package proyectolab;


import java.util.ArrayList;
import java.util.Date;

public class UsuarioCandidato extends Usuarios {
    private ArrayList<UsuarioComun>seguidores = new ArrayList();
    private ArrayList<Publicaciones> publicaciones = new ArrayList();
    private ArrayList<String> certificaciones = new ArrayList();

    public UsuarioCandidato() {
    }

    public UsuarioCandidato(String usuario, String contrasena, Date fechadenacimiento, String correoelectronico, String sexo, String nombre) {
        super(usuario, contrasena, fechadenacimiento, correoelectronico, sexo, nombre);
    }

    public ArrayList<UsuarioComun> getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(ArrayList<UsuarioComun> seguidores) {
        this.seguidores = seguidores;
    }

    public ArrayList<Publicaciones> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(ArrayList<Publicaciones> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public ArrayList<String> getCertificaciones() {
        return certificaciones;
    }

    public void setCertificaciones(ArrayList<String> certificaciones) {
        this.certificaciones = certificaciones;
    }

    @Override
    public String toString() {
        return "UsuarioCandidato{" + "seguidores=" + seguidores + ", publicaciones=" + publicaciones + ", certificaciones=" + certificaciones + '}';
    }
    
}
