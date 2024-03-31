package lab6p2_danieljuarez;

import java.util.ArrayList;

public class Pinguino {
    
    public String NombrePinguino;
    public String ContraseñaPinguino;
    public boolean SocioPinguino;
    public int DineroPinguino;
    public ArrayList <Item> ItemsPinguino = new ArrayList();
    public Casa CasaPinguino;

    public Pinguino() {
    }
    
    public Pinguino(String NombrePinguino, String ContraseñaPinguino, boolean SocioPinguino, int DineroPinguino, Casa CasaPinguino) {
        this.NombrePinguino = NombrePinguino;
        this.ContraseñaPinguino = ContraseñaPinguino;
        this.SocioPinguino = SocioPinguino;
        this.DineroPinguino = DineroPinguino;
        this.CasaPinguino = CasaPinguino;
    }

    public String getNombrePinguino() {
        return NombrePinguino;
    }

    public void setNombrePinguino(String NombrePinguino) {
        this.NombrePinguino = NombrePinguino;
    }

    public String getContraseñaPinguino() {
        return ContraseñaPinguino;
    }

    public void setContraseñaPinguino(String ContraseñaPinguino) {
        this.ContraseñaPinguino = ContraseñaPinguino;
    }

    public boolean isSocioPinguino() {
        return SocioPinguino;
    }

    public void setSocioPinguino(boolean SocioPinguino) {
        this.SocioPinguino = SocioPinguino;
    }

    public int getDineroPinguino() {
        return DineroPinguino;
    }

    public void setDineroPinguino(int DineroPinguino) {
        this.DineroPinguino = DineroPinguino;
    }

    public ArrayList<Item> getItemsPinguino() {
        return ItemsPinguino;
    }

    public void setItemsPinguino(ArrayList<Item> ItemsPinguino) {
        this.ItemsPinguino = ItemsPinguino;
    }

    public Casa getCasaPinguino() {
        return CasaPinguino;
    }

    public void setCasaPinguino(Casa CasaPinguino) {
        this.CasaPinguino = CasaPinguino;
    }

    @Override
    public String toString() {
        return "Pinguino" + NombrePinguino + "\n";
    }    
}
