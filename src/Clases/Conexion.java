
package Clases;

import Ventanas.Inicio;
import Ventanas.Sistema;
import Ventanas.ventanasEstaticas.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost/granmercado";
    private static final String USERNAME = "avesousa";
    private static final String PASSWORD = "26390042";
    public Connection conectador;
    public ResultSet resultado;
    public String nombreApellido;
    public String usuario;
    public int cargo;
    private PreparedStatement ps;
    public Conexion() {
        System.out.println("comenzo en el constructor");
        this.conectador = establecerConexion();
    }
    
    public static Connection establecerConexion(){
        
       Connection conexion = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se ha podido conectar a la base de dato ");
            System.out.println(e);
        }
        return conexion;
    }
    public void conectar_usuario(Inicio v) throws SQLException{
        try {
            this.ps = this.conectador.prepareStatement(("SELECT * FROM usuario WHERE usuario='"+v.usuarioR+"'and clave=('"+v.claveR+"')"));
            this.resultado = this.ps.executeQuery();
           if(this.resultado.next()){
               this.nombreApellido = (resultado.getString("nombre") + " " + resultado.getString("apellido"));
               this.cargo = resultado.getInt("id_cargo");
               this.usuario = resultado.getString("usuario");
               new Sistema(this.usuario,this.nombreApellido,this.cargo).setVisible(true);
               v.dispose();
               JOptionPane.showMessageDialog(null, "¡Bienvenid@! " + resultado.getString("nombre") + " " + resultado.getString("apellido"));
               
           }else{
               JOptionPane.showMessageDialog(null, "El usuario o contraseña ingresado, son INCORRECTOS");
               v.setVacios("");
           }
           
        } catch (Exception e) {
            System.out.println("Entro acá");
            System.out.println(e);
        } finally{
            cerrarConexion();
        }
        
        this.conectador.close();
    }
    public void traer_clientes(DefaultTableModel tabla){
        Object [] fila = null;
        try{
            this.ps = this.conectador.prepareStatement(("SELECT * FROM clientes"));
            this.resultado = this.ps.executeQuery();
            while(this.resultado.next()){
                 fila = new Object[4];
                for(int i = 0; i<4;i++){
                    fila[i] = this.resultado.getObject(i+2);
                }
                tabla.addRow(fila);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }finally{
            //cerrarConexion();
        }
        
    }
    public void editar_clientes(Formulario_cliente v, Facturar_admin vf, Buscador_cliente vb){
       try{
           String sql = "UPDATE `clientes` SET"+
                   " `documento_cliente` = '"+v.documento_cliente.getText()+
                   "', `razonsocial` = '"+v.razonsocial_cliente.getText()+
                   "', `telefono_cliente` = '"+v.telefono_cliente.getText()+
                   "', `direccion_cliente` = '"+v.direccion_cliente.getText()+
                   "' WHERE (`documento_cliente` = '"+v.almacenDeDocumento+"')";
           this.ps = this.conectador.prepareStatement((sql));
           this.ps.executeUpdate();
           v.dispose();
           Buscador_cliente vbd = new Buscador_cliente(vf);
           vbd.setVisible(true);
           vb.dispose();
           
       }   
       catch(Exception e){
           System.out.println(e);
       }finally{
           //cerrarConexion();
       } 
    }
    public void crear_clientes(Formulario_cliente v, Facturar_admin vf, Buscador_cliente vb){
        try{
            int dc = Integer.parseInt(v.documento_cliente.getText());
            long tc = Long.parseLong(v.telefono_cliente.getText());
            if(!verificarClientes(dc)){
                String sql = "INSERT INTO clientes (documento_cliente, razonsocial, "+
                    "telefono_cliente, direccion_cliente) VALUES ('"+dc+"','"+
                    v.razonsocial_cliente.getText()+"','"+tc+"','"+v.direccion_cliente.getText()+"')";
                this.ps = this.conectador.prepareStatement(sql);
                this.ps.executeUpdate();
                vf.razonsocial_facturar.setText(v.razonsocial_cliente.getText());
                vf.documento_facturar.setText(v.documento_cliente.getText());
                vf.direccion_facturar.setText(v.direccion_cliente.getText());
                vf.telefono_facturar.setText(v.telefono_cliente.getText());
                v.dispose();
                vb.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "El cliente que intentas agregar, ¡Ya existe!");
            }
            
        }catch(Exception e){
            System.out.println(e);
        }finally{
           //cerrarConexion();
       } 
    }
    private boolean verificarClientes(int d){
        try{
            this.ps = this.conectador.prepareStatement("SELECT * FROM clientes WHERE documento_cliente='" + d + "'");
            this.resultado = this.ps.executeQuery();
            System.out.println(this.resultado.next());
            return this.resultado.next();
        }catch(Exception e){
            System.out.println(e);
            return false;
        }finally{
           //cerrarConexion();
       } 
    }
    private void cerrarConexion(){
        try { this.resultado.close(); } catch (Exception e) { /* ignored */ }
        try { this.ps.close(); } catch (Exception e) { /* ignored */ }
        try { this.conectador.close(); } catch (Exception e) { /* ignored */ }

    }
    public void traer_productos(DefaultTableModel tabla){
        Object [] fila = null;
        try{
            String sql = "SELECT id_producto, nombre_categoria, nombre_producto,"+
                "cantidad_producto, precio_producto FROM productos\n" +
                "INNER JOIN categorias\n" +
                "ON categorias.id_categoria = productos.id_categoria;";
            this.ps = this.conectador.prepareStatement(sql);
            this.resultado = this.ps.executeQuery();
            while(this.resultado.next()){
                 fila = new Object[5];
                for(int i = 0; i<5;i++){
                    fila[i] = this.resultado.getObject(i+1);
                }
                tabla.addRow(fila);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }finally{
            //cerrarConexion();
        }
        
    }
    public double traer_costo(int codigo){
        try{
            this.ps = this.conectador.prepareStatement("SELECT * FROM productos"+ 
                "WHERE id_producto='"+codigo+"'");
            this.resultado = this.ps.executeQuery();
            if(this.resultado.next()){
                return Double.parseDouble(this.resultado.getString("costo_producto"));
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return 0;
    }
}
