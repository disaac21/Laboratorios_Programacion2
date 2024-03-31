package danieljuarez_lab3p2;


public class Apartamento extends BienesInmuebles {
    
    public int numlocal;
    public String referenciaEd;

    public Apartamento() {
        super();
    }

    public Apartamento(int numlocal, String referenciaEd) {
        this.numlocal = numlocal;
        this.referenciaEd = referenciaEd;
    }

    public Apartamento(int numlocal, String referenciaEd, String tipo, String direccion, String dimensiones, int id) {
        super(tipo, direccion, dimensiones, id);
        this.numlocal = numlocal;
        this.referenciaEd = referenciaEd;
    }

    public int getNumlocal() {
        return numlocal;
    }

    public void setNumlocal(int numlocal) {
        this.numlocal = numlocal;
    }

    public String getReferenciaEd() {
        return referenciaEd;
    }

    public void setReferenciaEd(String referenciaEd) {
        this.referenciaEd = referenciaEd;
    }

    @Override
    public String toString() {
        return "Apartamento{" + "numlocal=" + numlocal + ", referenciaEd=" + referenciaEd + '}';
    }
    
    
    
}
