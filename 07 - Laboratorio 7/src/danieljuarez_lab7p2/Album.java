package danieljuarez_lab7p2;

import java.util.ArrayList;
import java.util.Date;

public class Album extends Lanzamiento {
    
    public ArrayList <Cancion> InAlbum = new ArrayList();
    public int CuentaCanciones;

    public Album() {
    }

    public Album(int CuentaCanciones, String Titulo, Date Lanzamiento, int Likes) {
        super(Titulo, Lanzamiento, Likes);
        this.CuentaCanciones = CuentaCanciones;
    }

    public ArrayList<Cancion> getInAlbum() {
        return InAlbum;
    }

    public void setInAlbum(ArrayList<Cancion> InAlbum) {
        this.InAlbum = InAlbum;
    }

    public int getCuentaCanciones() {
        return CuentaCanciones;
    }

    public void setCuentaCanciones(int CuentaCanciones) {
        this.CuentaCanciones = CuentaCanciones;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public Date getLanzamiento() {
        return Lanzamiento;
    }

    public void setLanzamiento(Date Lanzamiento) {
        this.Lanzamiento = Lanzamiento;
    }

    public int getLikes() {
        return Likes;
    }

    public void setLikes(int Likes) {
        this.Likes = Likes;
    }

    @Override
    public String toString() {
        return "Album{" + "InAlbum=" + InAlbum + ", CuentaCanciones=" + CuentaCanciones + '}';
    }
}
