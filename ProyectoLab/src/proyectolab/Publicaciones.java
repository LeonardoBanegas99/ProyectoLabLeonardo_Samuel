package proyectolab;

public class Publicaciones {
    private String emisor;
    private String cuerpo;

    public Publicaciones() {
    }

    public Publicaciones(String emisor, String cuerpo) {
        this.emisor = emisor;
        this.cuerpo = cuerpo;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    @Override
    public String toString() {
        return "Publicaciones{" + "emisor=" + emisor + ", cuerpo=" + cuerpo + '}';
    }
    
}
