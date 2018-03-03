package proyectolab;

public class Mensaje {
    private String emisor;
    private String receptor;
    private String titulo;
    private String cuerpo;

    public Mensaje() {
    }

    public Mensaje(String emisor, String receptor, String titulo, String cuerpo) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    @Override
    public String toString() {
        return "Mensaje{" + "emisor=" + emisor + ", receptor=" + receptor + ", titulo=" + titulo + ", cuerpo=" + cuerpo + '}';
    }
    
}
