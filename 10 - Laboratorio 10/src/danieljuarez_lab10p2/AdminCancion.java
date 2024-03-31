package danieljuarez_lab10p2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminCancion {

    private ArrayList<Cancion> ListaCanciones = new ArrayList();
    private File archivo = null;

    public AdminCancion() {
    }
    
    public AdminCancion (String path) {
        archivo = new File(path);
    }

    public ArrayList<Cancion> getListaCanciones() {
        return ListaCanciones;
    }

    public void setListaCanciones(ArrayList<Cancion> ListaCanciones) {
        this.ListaCanciones = ListaCanciones;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaPersonas=" + ListaCanciones;
    }

    //extra mutador
    public void setCancion(Cancion c) {
        this.ListaCanciones.add(c);
    }

    public void cargarArchivo() {
        try {
            ListaCanciones = new ArrayList();
            Cancion temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Cancion) objeto.readObject()) != null) {
                        ListaCanciones.add(temp);
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
            for (Cancion t : ListaCanciones) {
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
