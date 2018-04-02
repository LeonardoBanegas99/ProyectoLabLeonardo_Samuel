package proyectolab;


import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class UsuarioCandidato extends Usuarios {
    private ArrayList<UsuarioComun>seguidores = new ArrayList();
    private ArrayList<Publicaciones> publicaciones = new ArrayList();
    private ArrayList<String> certificaciones = new ArrayList();
    private int pos;
    private ArrayList<UsuarioCandidato>candidatos = new ArrayList();
    
    public UsuarioCandidato() {
    }

    public UsuarioCandidato(int pos, String usuario, String contrasena, Date fechadenacimiento, String correoelectronico, String sexo, String nombre) {
        super(usuario, contrasena, fechadenacimiento, correoelectronico, sexo, nombre);
        this.pos = pos;
    }

    public ArrayList<UsuarioCandidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(ArrayList<UsuarioCandidato> candidatos) {
        this.candidatos = candidatos;
    }
    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
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
        return super.toString();
    }
     public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        UsuarioCandidato josealfonzo = new UsuarioCandidato(1,"josealfonzo","candidato1",null,null,null,"JoseAlfonzoDiaz");
        UsuarioCandidato salvadornasralla = new UsuarioCandidato(2,"salvadornasralla","candidato2",null,null,null,"SalvadorNasralla");
        UsuarioCandidato eliseovallecillo = new UsuarioCandidato(3,"eliseovallecillo","candidato3",null,null,null,"EliseoVallecillo");
        UsuarioCandidato lucasevangelisto = new UsuarioCandidato(4,"lucasevangelisto","candidato4",null,null,null,"LucasEvangelisto");
        UsuarioCandidato luiszelaya = new UsuarioCandidato(5,"luiszelaya","candidato5",null,null,null,"LuisZelaya");
        UsuarioCandidato romeovasquez = new UsuarioCandidato(6,"romeovasquez","candidato6",null,null,null,"RomeoVasquez");
        UsuarioCandidato isaiasfonseca = new UsuarioCandidato(7,"isaiasfonseca","candidato7",null,null,null,"IsaiasFonseca");
        UsuarioCandidato marlenealvarenga = new UsuarioCandidato(8,"marlenealvarenga","candidato8",null,null,null,"MarleneAlvarenga");
        UsuarioCandidato juanorlando = new UsuarioCandidato(9,"juanorlando","candidato9",null,null,null,"JuanOrlandoHernandez");
        candidatos.add(josealfonzo);
        candidatos.add(salvadornasralla);
        candidatos.add(eliseovallecillo);
        candidatos.add(lucasevangelisto);
        candidatos.add(luiszelaya);
        candidatos.add(romeovasquez);
        candidatos.add(isaiasfonseca);
        candidatos.add(marlenealvarenga);
        candidatos.add(juanorlando);
        File archivo = new File("./UsuarioCandidato.cmb");
        try{
        
            fw = new FileOutputStream(archivo,false);
            bw = new ObjectOutputStream(fw);
            for (UsuarioCandidato t : candidatos) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
     public void cargarArchivo(){
        try {
            candidatos = new ArrayList();
            UsuarioCandidato temp;
            File archivo = new File("./UsuarioCandidato.cmb");
            if(archivo.exists()){
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((temp=(UsuarioCandidato)objeto.readObject())!=null){
                        candidatos.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
