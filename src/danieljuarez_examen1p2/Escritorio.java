package danieljuarez_examen1p2;

public class Escritorio extends Computadora {
    
    public int RAM;
    public int Almacenamiento;
    public String TipoAlmacenamiento;
    public boolean TarGraf;

    public Escritorio() {
        super();
    }

    public Escritorio(int RAM, int Almacenamiento, String TipoAlmacenamiento, boolean TarGraf, String IP, String Mask, String Hostname) {
        super(IP, Mask, Hostname);
        this.RAM = RAM;
        this.Almacenamiento = Almacenamiento;
        this.TipoAlmacenamiento = TipoAlmacenamiento;
        this.TarGraf = TarGraf;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getAlmacenamiento() {
        return Almacenamiento;
    }

    public void setAlmacenamiento(int Almacenamiento) {
        this.Almacenamiento = Almacenamiento;
    }

    public String getTipoAlmacenamiento() {
        return TipoAlmacenamiento;
    }

    public void setTipoAlmacenamiento(String TipoAlmacenamiento) {
        this.TipoAlmacenamiento = TipoAlmacenamiento;
    }

    public boolean isTarGraf() {
        return TarGraf;
    }

    public void setTarGraf(boolean TarGraf) {
        this.TarGraf = TarGraf;
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
        return "Escritorio{" + "RAM=" + RAM + ", Almacenamiento=" + Almacenamiento + ", TipoAlmacenamiento=" + TipoAlmacenamiento + ", TarGraf=" + TarGraf + '}';
    }    
}
