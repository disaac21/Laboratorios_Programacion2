package lab4p2_danieljuarez;

import java.util.Random;

public class SuperiorSpiderman extends Personaje {

    static Random random = new Random();
    
    public SuperiorSpiderman() {
        super();
    }

    public SuperiorSpiderman(String nombre, double puntosataque, double puntosvida, String nombreuniverso) {
        super(nombre, puntosataque, puntosvida, nombreuniverso);
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
        return super.toString();
    }

    public double Ataque(Personaje p) {
        //  Hace un daño extra aleatorio en el rango 10%-30%
        
            double vida;
            vida = p.getPuntosvida();
            
            double randomizer = 0.10 + random.nextDouble(0.20);
            
            double dano = 0;
            dano = puntosataque + puntosataque * randomizer;

            double newvida;
            newvida = vida - dano;
            
            return newvida;
        
    }

}
