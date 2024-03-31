package lab4p2_danieljuarez;

public abstract class Personaje {
    
    public String nombre;
    public double puntosataque;
    public double puntosvida;
    public String nombreuniverso;

    public Personaje() {
    }

    public Personaje(String nombre, double puntosataque, double puntosvida, String nombreuniverso) {
        this.nombre = nombre;
        this.puntosataque = puntosataque;
        this.puntosvida = puntosvida;
        this.nombreuniverso = nombreuniverso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPuntosataque() {
        return puntosataque;
    }

    public void setPuntosataque(double puntosataque) {
        this.puntosataque = puntosataque;
    }

    public double getPuntosvida() {
        return puntosvida;
    }

    public void setPuntosvida(double puntosvida) {
        this.puntosvida = puntosvida;
    }

    public String getNombreuniverso() {
        return nombreuniverso;
    }

    public void setNombreuniverso(String nombreuniverso) {
        this.nombreuniverso = nombreuniverso;
    }

    @Override
    public String toString() {
        return "Personaje{" + nombre + ", Ataque: " + puntosataque + "Vida: " + puntosvida + "Universo: " + nombreuniverso + "\n";
    }
    
    public abstract double Ataque(Personaje p);
    
}
