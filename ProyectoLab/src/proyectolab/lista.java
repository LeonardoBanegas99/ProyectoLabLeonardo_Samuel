/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolab;

/**
 *
 * @author Samuel
 */
public class lista {
    Casilla inicio;
    int size;
    
    public lista() {
    }
    public lista(Casilla inicio) {
        this.inicio = null;
        size=0;
    }
    public Object ob(int pos){
        int cont=0;
        Casilla temp = inicio;
        while(cont<pos){
            temp= temp.getCasilla();
            cont++;
        }
        return temp.getDato();
    }

    
    public void add(Object obj){
        if(inicio==null){
            inicio = new Casilla(obj);
        }else{
            Casilla temporal = inicio;
            Casilla nueva = new Casilla(obj);
            nueva.setDato(temporal);
            inicio=nueva;
        }
        size++;
        
    }

    public int getSize() {
        return size;
    }
    public boolean Vacio(){
        return (inicio==null);
    }

    @Override
    public String toString() {
        return  inicio.toString();
    }
    
    
    
    
}
