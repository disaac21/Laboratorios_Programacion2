package danieljuarez_lab7p2;

import java.util.ArrayList;

public class Artista extends Usuario {
    
    public String NombreArtistico;
    public ArrayList <Cancion> Uploads = new ArrayList();
    public ArrayList <Lanzamiento> Releases = new ArrayList();

    public Artista() {
    }

    public Artista(String NombreArtistico, String Username, String Password, int Edad) {
        super(Username, Password, Edad, "Artista");
        this.NombreArtistico = NombreArtistico;
    }

    public String getNombreArtistico() {
        return NombreArtistico;
    }

    public void setNombreArtistico(String NombreArtistico) {
        this.NombreArtistico = NombreArtistico;
    }

    public ArrayList<Cancion> getUploads() {
        return Uploads;
    }

    public void setUploads(ArrayList<Cancion> Uploads) {
        this.Uploads = Uploads;
    }

    public ArrayList<Lanzamiento> getReleases() {
        return Releases;
    }

    public void setReleases(ArrayList<Lanzamiento> Releases) {
        this.Releases = Releases;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "Artista: " + NombreArtistico;
    }
    
}
