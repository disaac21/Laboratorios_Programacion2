package danieljuarez_lab7p2;

import java.util.Date;

public class Lanzamiento {
    
    public String Titulo;
    public Date Lanzamiento;
    public int Likes;

    public Lanzamiento() {
    }
    
    public Lanzamiento(String Titulo, Date Lanzamiento, int Likes) {
        this.Titulo = Titulo;
        this.Lanzamiento = Lanzamiento;
        this.Likes = Likes;
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
        return "Lanzamiento: " + Titulo;
    }
    
}
