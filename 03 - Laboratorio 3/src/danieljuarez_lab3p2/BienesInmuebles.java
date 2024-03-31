package danieljuarez_lab3p2;

public class BienesInmuebles {
    
    public String tipo;
    public String direccion;
    public String dimensiones;
    public int id;

    public BienesInmuebles() {
    }

    public BienesInmuebles(String tipo, String direccion, String dimensiones, int id) {
        this.tipo = tipo;
        this.direccion = direccion;
        this.dimensiones = dimensiones;
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BienesInmuebles{" + "tipo=" + tipo + ", direccion=" + direccion + ", dimensiones=" + dimensiones + ", id=" + id + '}';
    }
    
    
    
}
