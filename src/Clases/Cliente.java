
package Clases;

import Ventanas.ventanasEstaticas.Facturar_admin;
import javax.swing.table.DefaultTableModel;

public class Cliente {
    public String razon;
    public String direccion;
    public int documento;
    public int telefono;
    public int id_cliente;
    private double total = 0;
    private Facturar_admin v;
    private DefaultTableModel t;

    public Cliente(String razon, String direccion, int documento, int telefono,
    int id_cliente, Facturar_admin ve, DefaultTableModel ta) {
        this.razon = razon;
        this.direccion = direccion;
        this.documento = documento;
        this.telefono = telefono;
        this.id_cliente = id_cliente;
        v = ve; 
        t = ta;
        v.documento_facturar.setText(String.valueOf(this.documento));
        v.razonsocial_facturar.setText(this.razon);
        v.telefono_facturar.setText(String.valueOf(this.telefono));
        v.direccion_facturar.setText(this.direccion);
        v.crearCliente(this);
    }
    
    public void borrarCliente(){
        v.documento_facturar.setText("");
        v.razonsocial_facturar.setText("");
        v.telefono_facturar.setText("");
        v.direccion_facturar.setText("");
        this.razon = "";
        this.direccion = "";
        this.documento = 0;
        this.telefono = 0;
        while(t.getRowCount() > 0){
            t.removeRow(0);
        }
    }
    
    public void sumarTotal(double precio){
        total += precio;
        v.total_facturar.setText(String.valueOf(total));
    }
    
    public void restarTotal(double precio){
        total -= precio;
        v.total_facturar.setText(String.valueOf(total));
    }
}
