
package proyectolab;

public class Casilla {
     Casilla casilla;
     Object dato;

    public Casilla() {
    }
    public Casilla(Object dato) {
        this.casilla = null;
        this.dato = dato;
    }
    public Object getDato(){
        return dato;
    }
    public void setDato(Casilla casilla){
        this.casilla=casilla;
    }
    public Casilla getCasilla(){
        return casilla;
    }

    @Override
    public String toString() {
        return  casilla + ", dato=" + dato + '}';
    }
    
    
    
    
}
