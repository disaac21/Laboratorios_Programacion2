

import java.util.ArrayList;
import java.util.Date;

public class Carpeta {
    
    //Tendrán un nombre, un link, una lista de archivos y carpetas
    //Empty
    public String Nombre;
    public String Link;
    public Date Fecha;
    public ArrayList <Carpeta> Carpetas = new ArrayList<>();
    public ArrayList <Archivo> Archivos = new ArrayList<>();

    public Carpeta() {
    }

    public Carpeta(String Nombre, String Link) {
        this.Nombre = Nombre;
        this.Link = Link;
        Fecha = new Date();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String Link) {
        this.Link = Link;
    }

    public ArrayList<Carpeta> getCarpetas() {
        return Carpetas;
    }

    public void setCarpetas(ArrayList<Carpeta> Carpetas) {
        this.Carpetas = Carpetas;
    }

    public ArrayList<Archivo> getArchivos() {
        return Archivos;
    }

    public void setArchivos(ArrayList<Archivo> Archivos) {
        this.Archivos = Archivos;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }
    
    @Override
    public String toString() {
        return "Carpeta{" + "Nombre=" + Nombre + '}';
    }
    
}
