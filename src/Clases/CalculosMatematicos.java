package Clases;

import java.text.DecimalFormat;

public class CalculosMatematicos {
    DecimalFormat formato = new DecimalFormat("#.00");
    public double sacarTotal(int cantidad, double precio){
        return sacarComas(formato.format(cantidad*precio));
    }
    
    public double sacarRentabilidad(double precio, double total, int cant){
        return sacarComas(formato.format(total - precio))*cant;
    }
    
    public int sacarMakup(double precio, double costo){
        return (int)(((precio/(costo))-1)*100);
    }
    
    public double sacarCosto(int codigo){
        Conexion con = new Conexion();
        double costo = con.traer_costo(codigo);
        return costo;
    }
    
    public double sacarPrecio(double costo, int porcentaje){
        return costo+((costo*porcentaje)/100);
    }
    
    public double sacarSuma(double numero, double numerodos){
        return sacarComas(formato.format(numero + numerodos));
    }
    
    public double sacarResta(double numeromayor, double numeromenor){
        return sacarComas(formato.format(numeromayor - numeromenor));
    }
    
    public double sacarComas(String numero){
        String valor = "";
        for(int i = 0; numero.length() > i; i++){
            if(",".equals(String.valueOf(numero.charAt(i)))){
                valor += ".";
            } else {
                valor += String.valueOf(numero.charAt(i));
            }
        }
        return Double.parseDouble(valor);
    }
    
    public void esperar(double seg){
        try {
            Thread.sleep((long)(seg*1000));
        } catch (Exception e) {
            System.out.println("No se pudo cumplir la espera");
        }
    }
}
