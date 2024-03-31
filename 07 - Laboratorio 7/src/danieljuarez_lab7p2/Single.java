package danieljuarez_lab7p2;

import java.util.Date;

public class Single extends Lanzamiento {
    
    public Cancion InSingle;

    public Single() {
    }

    public Single(Cancion InSingle, String Titulo, Date Lanzamiento, int Likes) {
        super(Titulo, Lanzamiento, Likes);
        this.InSingle = InSingle;
    }

    public Cancion getInSingle() {
        return InSingle;
    }

    public void setInSingle(Cancion InSingle) {
        this.InSingle = InSingle;
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
        return "Single{" + "InSingle=" + InSingle + '}';
    }
    
}
