package Clases;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

public class DatosDeFactura{
    
    private String cod;
    private String und;
    private String desc;
    private String punt;
    private String ptotal;
    //dato de usuario
    private String nombre;
    private String direccion;
    private String documento;
    private String telefono;
    private String totalf;
    public DatosDeFactura(String cod, String und, String desc, String punt, String ptotal) {
        this.cod = cod;
        this.und = und;
        this.desc = desc;
        this.punt = punt;
        this.ptotal = ptotal;
    }

    public DatosDeFactura(String nombre, String direccion, String documento, String telefono, String totalf, boolean hola) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.documento = documento;
        this.telefono = telefono;
        this.totalf = totalf;
    }

    public String getTotalf() {
        return totalf;
    }

    public void setTotalf(String totalf) {
        this.totalf = totalf;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getUnd() {
        return und;
    }

    public void setUnd(String und) {
        this.und = und;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPunt() {
        return punt;
    }

    public void setPunt(String punt) {
        this.punt = punt;
    }

    public String getPtotal() {
        return ptotal;
    }

    public void setPtotal(String ptotal) {
        this.ptotal = ptotal;
    }
    
}
