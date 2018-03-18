/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author Samuel
 */
public class BarradeVoto extends Thread {
    private JProgressBar bar;
    private File archivo;
    private int pos;
    private JLabel label;
    private boolean vive;

    public BarradeVoto() {
    }

    public BarradeVoto(JProgressBar bar, int pos, JLabel label) {
        this.bar = bar;
        this.pos = pos;
        this.label = label;
        vive=true;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public JProgressBar getBar() {
        return bar;
    }

    public void setBar(JProgressBar bar) {
        this.bar = bar;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }


    @Override
    public String toString() {
        return "BarradeVoto{" + "bar=" + bar + ", archivo=" + archivo + ", Posicion=" + pos + '}';
    }
    
    @Override
    public void run(){
        int cont;
        int numvo;
        while (true) {
            if (vive) {
                cont = 0;
                numvo = 0;
                archivo = new File("./src\\Resultados\\Results.txt");
                Scanner sc = null;
                try {
                    sc = new Scanner(archivo);
                    sc.useDelimiter(",");
                    while (sc.hasNext()) {
                        numvo = sc.nextInt();
                        cont++;
                        if (cont == pos * 2) {
                            break;
                        }

                    }

                } catch (Exception e) {
                }
                sc.close();
                cont=0;
                while(cont<=numvo){
                    bar.setValue(cont);
                    label.setText("VOTOS TOTALES: "+cont + " de "+numvo);
                    cont+=10;
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException ex) {
                    }
                    
                }
                vive=false;
            }
        }
        
    }
    
}
