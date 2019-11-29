
package lab.pkg7_sergiosuazo;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminBuses {
    private ArrayList<Autobuses> listaBuses=new ArrayList<>();
    File archivo=null;

    public adminBuses(String path) {
        archivo= new File(path);
    }

    public ArrayList<Autobuses> getListaBuses() {
        return listaBuses;
    }

    public void setListaBuses(ArrayList<Autobuses> listaBuses) {
        this.listaBuses = listaBuses;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    public void setBus(Autobuses a){
        listaBuses.add(a);
    }
    
    public void cargarArchivo() {
        try {            
            listaBuses = new ArrayList();
            Autobuses temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Autobuses) objeto.readObject()) != null) {
                        listaBuses.add(temp);
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
            for (Autobuses t : listaBuses) {
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
