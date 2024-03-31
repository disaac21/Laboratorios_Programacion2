package danieljuarez_lab7p2;

import java.util.ArrayList;

public class Cliente extends Usuario {
    
    public ArrayList <Cancion> Favorites = new ArrayList();
    public ArrayList <Playlist> Created = new ArrayList();
    public ArrayList <Playlist> LikedPlaylists = new ArrayList();

    public Cliente() {
    }

    public Cliente(String Username, String Password, int Edad) {
        super(Username, Password, Edad, "Cliente");
    }

    public ArrayList<Cancion> getFavorites() {
        return Favorites;
    }

    public void setFavorites(ArrayList<Cancion> Favorites) {
        this.Favorites = Favorites;
    }

    public ArrayList<Playlist> getCreated() {
        return Created;
    }

    public void setCreated(ArrayList<Playlist> Created) {
        this.Created = Created;
    }

    public ArrayList<Playlist> getLikedPlaylists() {
        return LikedPlaylists;
    }

    public void setLikedPlaylists(ArrayList<Playlist> LikedPlaylists) {
        this.LikedPlaylists = LikedPlaylists;
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
        return "Cliente: " + "Favorites=" + Favorites + ", Created=" + Created + ", LikedPlaylists=" + LikedPlaylists + '}';
    }
    
}
