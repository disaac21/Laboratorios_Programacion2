package danieljuarez_examen1p2;

public class Computadora {
    
    public String IP;
    public String Mask;
    public String Hostname;

    public Computadora() {
    }
    
    public Computadora(String IP, String Mask, String Hostname) {
        this.IP = IP;
        this.Mask = Mask;
        this.Hostname = Hostname;
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
        return "Computadora{" + "IP=" + IP + ", Mask=" + Mask + ", Hostname=" + Hostname + '}';
    }
    
}
