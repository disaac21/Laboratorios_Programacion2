package danieljuarez_lab8p2;

import java.util.ArrayList;

public class Zona {
    
    public int IDZona;
    public String NombreZona;
    public ArrayList <Item> ItemsZona = new ArrayList();
    public int Remuneracion;
    public int ProbabilidadDerrumbe;
    public int ProbabilidadAtaque;

    public Zona() {
    }

    public Zona(int IDZona, String NombreZona, int Remuneracion, int ProbabilidadDerrumbe, int ProbabilidadAtaque) {
        this.IDZona = IDZona;
        this.NombreZona = NombreZona;
        this.Remuneracion = Remuneracion;
        this.ProbabilidadDerrumbe = ProbabilidadDerrumbe;
        this.ProbabilidadAtaque = ProbabilidadAtaque;
    }

    public int getIDZona() {
        return IDZona;
    }

    public void setIDZona(int IDZona) {
        this.IDZona = IDZona;
    }

    public String getNombreZona() {
        return NombreZona;
    }

    public void setNombreZona(String NombreZona) {
        this.NombreZona = NombreZona;
    }

    public ArrayList<Item> getItemsZona() {
        return ItemsZona;
    }

    public void setItemsZona(ArrayList<Item> ItemsZona) {
        this.ItemsZona = ItemsZona;
    }

    public int getRemuneracion() {
        return Remuneracion;
    }

    public void setRemuneracion(int Remuneracion) {
        this.Remuneracion = Remuneracion;
    }

    public int getProbabilidadDerrumbe() {
        return ProbabilidadDerrumbe;
    }

    public void setProbabilidadDerrumbe(int ProbabilidadDerrumbe) {
        this.ProbabilidadDerrumbe = ProbabilidadDerrumbe;
    }

    public int getProbabilidadAtaque() {
        return ProbabilidadAtaque;
    }

    public void setProbabilidadAtaque(int ProbabilidadAtaque) {
        this.ProbabilidadAtaque = ProbabilidadAtaque;
    }

    @Override
    public String toString() {
        return NombreZona;
    }
    
    
    
}
