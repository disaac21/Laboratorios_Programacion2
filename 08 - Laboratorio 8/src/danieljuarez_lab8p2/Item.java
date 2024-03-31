package danieljuarez_lab8p2;

public class Item {
    
    public int IDItem;
    public String NombreItem;
    public boolean Alimento;
    public int ProbabilidadObtencion;
    public int PrecioItem;

    public Item() {
    }

    public Item(int IDItem, String NombreItem, boolean Alimento, int ProbabilidadObtencion, int PrecioItem) {
        this.IDItem = IDItem;
        this.NombreItem = NombreItem;
        this.Alimento = Alimento;
        this.ProbabilidadObtencion = ProbabilidadObtencion;
        this.PrecioItem = PrecioItem;
    }

    public int getIDItem() {
        return IDItem;
    }

    public void setIDItem(int IDItem) {
        this.IDItem = IDItem;
    }

    public String getNombreItem() {
        return NombreItem;
    }

    public void setNombreItem(String NombreItem) {
        this.NombreItem = NombreItem;
    }

    public boolean isAlimento() {
        return Alimento;
    }

    public void setAlimento(boolean Alimento) {
        this.Alimento = Alimento;
    }

    public int getProbabilidadObtencion() {
        return ProbabilidadObtencion;
    }

    public void setProbabilidadObtencion(int ProbabilidadObtencion) {
        this.ProbabilidadObtencion = ProbabilidadObtencion;
    }

    public int getPrecioItem() {
        return PrecioItem;
    }

    public void setPrecioItem(int PrecioItem) {
        this.PrecioItem = PrecioItem;
    }

    @Override
    public String toString() {
        return IDItem + " - " + NombreItem;
    }
}
