package proyectolab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdminActas {

    String votos;
    File file;
    String direccion;

    public AdminActas(String direccion) {
        this.direccion = direccion;
    }

    public void leerArchivo() throws IOException {
        FileReader fr = null;
        BufferedReader bf = null;
        votos = "";

        try {
            fr = new FileReader(direccion);
            bf = new BufferedReader(fr);
            String s;
            while((s= bf.readLine()) != null){
                String[] token = s.split(";");
                for (int i = 0; i < token.length; i++) {
                    votos += token[i] + "\n";
                }
            }
            bf.close();
            fr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminActas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String getVotos() {
        return votos;
    }

    public void setVotos(String votos) {
        this.votos = votos;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
