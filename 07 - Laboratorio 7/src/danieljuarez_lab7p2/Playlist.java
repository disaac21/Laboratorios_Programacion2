package danieljuarez_lab7p2;

import java.util.ArrayList;

public class Playlist {
    
    public String NombrePlaylist;
    public int LikeCount;
    public ArrayList <Cancion> InPlaylist = new ArrayList();

    public Playlist(String NombrePlaylist, int LikeCount) {
        this.NombrePlaylist = NombrePlaylist;
        this.LikeCount = LikeCount;
    }

    public String getNombrePlaylist() {
        return NombrePlaylist;
    }

    public void setNombrePlaylist(String NombrePlaylist) {
        this.NombrePlaylist = NombrePlaylist;
    }

    public int getLikeCount() {
        return LikeCount;
    }

    public void setLikeCount(int LikeCount) {
        this.LikeCount = LikeCount;
    }

    public ArrayList<Cancion> getInPlaylist() {
        return InPlaylist;
    }

    public void setInPlaylist(ArrayList<Cancion> InPlaylist) {
        this.InPlaylist = InPlaylist;
    }

    @Override
    public String toString() {
        return "Playlist: " + NombrePlaylist;
    }
    
}
