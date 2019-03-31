
package Clases;

import Ventanas.Inicio;
import Ventanas.Sistema;
import Ventanas.ventanasEstaticas.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    public int id_usuario;
    public int id_cliente;
    public int cargo;
    private PreparedStatement ps;
    private CalculosMatematicos calcular = new CalculosMatematicos();
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
               this.id_usuario = resultado.getInt("id_usuario");
               new Sistema(this.usuario,this.nombreApellido,this.cargo,this.id_usuario).setVisible(true);
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
            cerrarConexion();
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
           cerrarConexion();
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
           cerrarConexion();
       } 
    }
    public void seleccionar_cliente(int documento, Facturar_admin v, DefaultTableModel t){
        System.out.println("Acá estoy");
        try {
            String sql = "SELECT * FROM clientes WHERE documento_cliente="+documento;
            this.ps = this.conectador.prepareStatement(sql);
            this.resultado = this.ps.executeQuery();
            System.out.println("Comenzo a buscar usuario por dni");
            if(this.resultado.next()){
                System.out.println("Entro en next");
                String razon = this.resultado.getString("razonsocial");
                String direccion_cliente = this.resultado.getString("direccion_cliente");
                int documento_cliente = Integer.parseInt(this.resultado.getString("documento_cliente"));
                int telefono_cliente = Integer.parseInt(this.resultado.getString("telefono_cliente"));
                int id_cliente = Integer.parseInt(this.resultado.getString("id_cliente"));
                Cliente c = new Cliente(
                        razon,
                        direccion_cliente,
                        documento_cliente,
                        telefono_cliente,
                        id_cliente,
                        v,t);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            cerrarConexion();
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
           cerrarConexion();
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
    public void enviarDetalle(DefaultTableModel t, Usuario u, Cliente c, Facturar_admin v){
        try {
            id_usuario = u.getId_usuario();
            id_cliente = c.id_cliente;
            String sql = "INSERT INTO detalleventa values (null,?,?,?,?,?,?,?,?)";
            this.ps = this.conectador.prepareStatement(sql);
            int cantFilas = t.getRowCount();
            int id_factura = enviarFactura(v);
            for(int i = 0; i<cantFilas; i++){
                int cod = Integer.parseInt(t.getValueAt(i, 0).toString());
                double costo = calcular.sacarCosto(cod);
                double precio =Double.parseDouble(t.getValueAt(i, 3).toString());
                double precioTotal = Double.parseDouble(v.total_facturar.getText());
                int markup = calcular.sacarMakup(precio, costo);
                double rentabilidad = calcular.sacarRentabilidad(precio, precioTotal);
                this.ps.setInt(1,id_factura);
                this.ps.setInt(2, cod);
                this.ps.setInt(3, Integer.parseInt(String.valueOf(precio)));
                this.ps.setInt(4, Integer.parseInt(t.getValueAt(i, 1).toString()));
                this.ps.setInt(5, markup);
                this.ps.setInt(6,Integer.parseInt(String.valueOf(rentabilidad)));
                this.ps.addBatch();
            }
            this.ps.executeBatch();
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private int enviarFactura(Facturar_admin v) throws SQLException{
            Date hoy = new Date();
            DateFormat formato = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
            String fecha = formato.format(hoy);
            String sql = "'INSER INT factura values (null,"+
                    Integer.parseInt(v.total_facturar.getText())+
                    ","+fecha+","+id_usuario+","+id_cliente+")'";
            this.ps = this.conectador.prepareStatement(sql);
            this.ps.executeUpdate();
            this.resultado = this.ps.getGeneratedKeys(); 
            return this.resultado.getInt(1);
    }
    
}
