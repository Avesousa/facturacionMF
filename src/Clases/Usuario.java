
package Clases;

public class Usuario {
    private String usuario;
    private int cargo;
    private String NombreApellido;
    private int id_usuario;
    
    public Usuario(String u, String na, int c, int id){
        usuario = u;
        NombreApellido = na;
        cargo = c;
        id_usuario = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public String getNombreApellido() {
        return NombreApellido;
    }

    public void setNombreApellido(String NombreApellido) {
        this.NombreApellido = NombreApellido;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    
    
}
