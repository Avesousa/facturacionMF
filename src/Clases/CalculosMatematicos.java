package Clases;

public class CalculosMatematicos {
    public double sacarTotal(int cantidad, double precio){
        double total = cantidad * precio;
        return total;
    }
    
    public double sacarRentabilidad(double precio, double total){
        return total - precio;
    }
    
    public int sacarMakup(double precio, double costo){
        return (int)((precio/(costo-1))*100);
    }
    
    public double sacarCosto(int codigo){
        Conexion con = new Conexion();
        double costo = con.traer_costo(codigo);
        return costo;
    }
    
    public double sacarSuma(double numero, double numerodos){
        return numero + numerodos;
    }
}
