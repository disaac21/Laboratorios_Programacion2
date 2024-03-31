package danieljuarez_lab8p2;

import java.util.ArrayList;

public class Jugador {
    
    public ArrayList <Item> ItemsJugador = new ArrayList();
    public ArrayList <Mascota> MascotasJugador = new ArrayList();
    public int Dinero;
    public int DineroBanco;

    public Jugador() {
    }

    public Jugador(int Dinero, int DineroBanco) {
        this.Dinero = Dinero;
        this.DineroBanco = DineroBanco;
    }

    public ArrayList<Item> getItemsJugador() {
        return ItemsJugador;
    }

    public void setItemsJugador(ArrayList<Item> ItemsJugador) {
        this.ItemsJugador = ItemsJugador;
    }

    public ArrayList<Mascota> getMascotasJugador() {
        return MascotasJugador;
    }

    public void setMascotasJugador(ArrayList<Mascota> MascotasJugador) {
        this.MascotasJugador = MascotasJugador;
    }

    public int getDinero() {
        return Dinero;
    }

    public void setDinero(int Dinero) {
        this.Dinero = Dinero;
    }

    public int getDineroBanco() {
        return DineroBanco;
    }

    public void setDineroBanco(int DineroBanco) {
        this.DineroBanco = DineroBanco;
    }

    @Override
    public String toString() {
        return "Juagdor: Dinero: " + Dinero + ", DineroBanco: " + DineroBanco + "\n";
    }
    
    
    
}
