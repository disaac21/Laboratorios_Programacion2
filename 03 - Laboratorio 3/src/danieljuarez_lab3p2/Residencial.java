package danieljuarez_lab3p2;

import java.util.ArrayList;

public class Residencial {

    public ArrayList<Casa> Casas = new ArrayList<>();
    public ArrayList<Edificio> Edificios = new ArrayList<>();
    public String nombreRes;

    public Residencial() {
    }

    public Residencial(String nombreRes) {
        this.nombreRes = nombreRes;
    }

    public String getNombreRes() {
        return nombreRes;
    }

    public void setNombreRes(String nombreRes) {
        this.nombreRes = nombreRes;
    }

    public ArrayList<Casa> getCasas() {
        return Casas;
    }

    public void setCasas(ArrayList<Casa> Casas) {
        this.Casas = Casas;
    }

    public ArrayList<Edificio> getEdificios() {
        return Edificios;
    }

    public void setEdificios(ArrayList<Edificio> Edificios) {
        this.Edificios = Edificios;
    }

    @Override
    public String toString() {
        return "Residencial " + nombreRes;
    }

    
}
