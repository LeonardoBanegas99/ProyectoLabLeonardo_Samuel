package proyectolab;

import java.util.ArrayList;
import java.util.Date;

public class UsuarioComun extends Usuarios {

    private String direccion;
    private ArrayList<Mensaje> mensaje = new ArrayList();
    private ArrayList<UsuarioCandidato> candidatoseguidos = new ArrayList();
    private ArrayList<UsuarioComun> amigos = new ArrayList();

    public UsuarioComun() {
    }

    public UsuarioComun(String usuario, String contrasena, Date fechadenacimiento, String correoelectronico, String sexo, String nombre) {
        super(usuario, contrasena, fechadenacimiento, correoelectronico, sexo, nombre);
    }

    public UsuarioComun(String direccion, String usuario, String contrasena, Date fechadenacimiento, String correoelectronico, String sexo, String nombre) {
        super(usuario, contrasena, fechadenacimiento, correoelectronico, sexo, nombre);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Mensaje> getMensaje() {
        return mensaje;
    }

    public void setMensaje(ArrayList<Mensaje> mensaje) {
        this.mensaje = mensaje;
    }

    public ArrayList<UsuarioCandidato> getCandidato() {
        return candidatoseguidos;
    }

    public void setCandidato(ArrayList<UsuarioCandidato> candidato) {
        this.candidatoseguidos = candidato;
    }

    public ArrayList<UsuarioComun> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<UsuarioComun> amigos) {
        this.amigos = amigos;
    }

    @Override
    public String toString() {
        return "UsuarioComun{" + "direccion=" + direccion + ", mensaje=" + mensaje + ", candidato=" + candidatoseguidos + ", amigos=" + amigos + '}';
    }

}
