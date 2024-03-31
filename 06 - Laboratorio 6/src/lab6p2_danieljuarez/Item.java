package lab6p2_danieljuarez;

public class Item {
    
    public String NombreItem;
    public int PrecioItem;
    public String TipoItem;

    public Item() {
    }

    public Item(String NombreItem, int PrecioItem, String TipoItem) {
        this.NombreItem = NombreItem;
        this.PrecioItem = PrecioItem;
        this.TipoItem = TipoItem;
    }

    public String getNombreItem() {
        return NombreItem;
    }

    public void setNombreItem(String NombreItem) {
        this.NombreItem = NombreItem;
    }

    public int getPrecioItem() {
        return PrecioItem;
    }

    public void setPrecioItem(int PrecioItem) {
        this.PrecioItem = PrecioItem;
    }

    public String getTipoItem() {
        return TipoItem;
    }

    public void setTipoItem(String TipoItem) {
        this.TipoItem = TipoItem;
    }

    @Override
    public String toString() {
        return "Item - Nombre: " + NombreItem + ", Precio: " + PrecioItem + " & Tipo" + TipoItem + "\n";
    }
    
}
