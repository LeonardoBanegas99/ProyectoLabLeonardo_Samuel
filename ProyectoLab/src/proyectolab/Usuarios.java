package proyectolab;


import java.util.Date;

public class Usuarios {
    private String usuario;
    private String contrasena;
    private Date fechadenacimiento;
    private String correoelectronico;
    private String sexo;
    private String nombre;

    public Usuarios() {
    }

    public Usuarios(String usuario, String contrasena, Date fechadenacimiento, String correoelectronico, String sexo, String nombre) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.fechadenacimiento = fechadenacimiento;
        this.correoelectronico = correoelectronico;
        this.sexo = sexo;
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getFechadenacimiento() {
        return fechadenacimiento;
    }

    public void setFechadenacimiento(Date fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "usuario=" + usuario + ", contrasena=" + contrasena + ", fechadenacimiento=" + fechadenacimiento + ", correoelectronico=" + correoelectronico + ", sexo=" + sexo + ", nombre=" + nombre + '}';
    }
    
    
    
}
