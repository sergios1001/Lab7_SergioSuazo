
package lab.pkg7_sergiosuazo;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminEstudiantes {
    private ArrayList<Estudiantes> listaEstudiantes=new ArrayList<>();
    private File archivo=null;

    public adminEstudiantes(String path) {
        archivo= new File(path);
    }

    public ArrayList<Estudiantes> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiantes> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setEstudiante(Estudiantes a){
        listaEstudiantes.add(a);
    }
    
    public void cargarArchivo() {
        try {            
            listaEstudiantes = new ArrayList();
            Estudiantes temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Estudiantes) objeto.readObject()) != null) {
                        listaEstudiantes.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Estudiantes t : listaEstudiantes) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }    
    
}
