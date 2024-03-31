

import java.util.Date;

public class Archivo {
    
    //Tendrán un nombre, un link, una extensión (pdf, txt, docx, jpg, mp4) y tamaño.
    
    public String Nombre;
    public String Link;
    public String Extension;
    public int Tamano;
    public String FechaCreacion;
    public boolean Pertenece;

    public Archivo() {
    }

    public Archivo(String Nombre, String Link, String Extension, int Tamano, String FechaCreacion, boolean Pertenece) {
        this.Nombre = Nombre;
        this.Link = Link;
        this.Extension = Extension;
        this.Tamano = Tamano;
        this.FechaCreacion = FechaCreacion;
        this.Pertenece = Pertenece;
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

    public String getExtension() {
        return Extension;
    }

    public void setExtension(String Extension) {
        this.Extension = Extension;
    }

    public int getTamano() {
        return Tamano;
    }

    public void setTamano(int Tamano) {
        this.Tamano = Tamano;
    }

    public String getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(String FechaCreacion) {
        this.FechaCreacion = FechaCreacion;
    }

    public boolean isPertenece() {
        return Pertenece;
    }

    public void setPertenece(boolean Pertenece) {
        this.Pertenece = Pertenece;
    }

    @Override
    public String toString() {
        return "Archivo{" + "Nombre=" + Nombre + "." + Extension + '}';
    }
    
    
    
}
