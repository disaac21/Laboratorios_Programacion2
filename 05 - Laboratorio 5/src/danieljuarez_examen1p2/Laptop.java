package danieljuarez_examen1p2;

public class Laptop extends Computadora {
    
    public String Marca;
    public String DefPantalla;
    public boolean RGB;

    public Laptop() {
        super();
    }

    public Laptop(String Marca, String DefPantalla, boolean RGB, String IP, String Mask, String Hostname) {
        super(IP, Mask, Hostname);
        this.Marca = Marca;
        this.DefPantalla = DefPantalla;
        this.RGB = RGB;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getDefPantalla() {
        return DefPantalla;
    }

    public void setDefPantalla(String DefPantalla) {
        this.DefPantalla = DefPantalla;
    }

    public boolean isRGB() {
        return RGB;
    }

    public void setRGB(boolean RGB) {
        this.RGB = RGB;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getMask() {
        return Mask;
    }

    public void setMask(String Mask) {
        this.Mask = Mask;
    }

    public String getHostname() {
        return Hostname;
    }

    public void setHostname(String Hostname) {
        this.Hostname = Hostname;
    }

    @Override
    public String toString() {
        return super.toString();
    }    
}
