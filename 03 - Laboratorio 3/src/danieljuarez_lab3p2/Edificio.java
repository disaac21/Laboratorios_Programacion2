package danieljuarez_lab3p2;

import java.util.ArrayList;

public class Edificio extends BienesInmuebles {
    
    public int cantlocales;
    public String nombreEd;
    public ArrayList<Apartamento> Apartamentos = new ArrayList<>();

    public Edificio() {
        super();
    }

    public Edificio(int cantlocales, String nombreEd) {
        this.cantlocales = cantlocales;
        this.nombreEd = nombreEd;
    }

    public Edificio(int cantlocales, String nombreEd, String tipo, String direccion, String dimensiones, int id) {
        super(tipo, direccion, dimensiones, id);
        this.cantlocales = cantlocales;
        this.nombreEd = nombreEd;
    }

    public int getCantlocales() {
        return cantlocales;
    }

    public void setCantlocales(int cantlocales) {
        this.cantlocales = cantlocales;
    }

    public String getNombreEd() {
        return nombreEd;
    }

    public void setNombreEd(String nombreEd) {
        this.nombreEd = nombreEd;
    }

    public ArrayList<Apartamento> getApartamentos() {
        return Apartamentos;
    }

    public void setApartamentos(ArrayList<Apartamento> Apartamentos) {
        this.Apartamentos = Apartamentos;
    }

    @Override
    public String toString() {
        return "Edificio{" + "cantlocales=" + cantlocales + ", nombreEd=" + nombreEd + ", Apartamentos=" + Apartamentos + '}';
    }
    
    
    
}
