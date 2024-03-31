package danieljuarez_lab2p2;

import java.util.ArrayList;

public class Usuario {

    public String nombre;
    public int victorias;
    public String jugadas;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public Usuario(String nombre, int victorias, String jugadas) {
        this.nombre = nombre;
        this.victorias = victorias;
        this.jugadas = jugadas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setJugadas(String jugadas) {
        this.jugadas = jugadas;
    }

    public String getJugadas() {
        return jugadas;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", victorias=" + victorias + ", jugadas=" + jugadas + '}';
    }
    
    
}
