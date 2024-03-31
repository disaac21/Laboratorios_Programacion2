/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_danieljuarez;

/**
 *
 * @author usuario
 */
public class Alterado extends Personaje{

    public Alterado() {
        super();
    }

    public Alterado(String nombre, double puntosataque, double puntosvida, String nombreuniverso) {
        super(nombre, puntosataque, puntosvida, nombreuniverso);
    }
    
    public double Ataque(Personaje p){
        if (p instanceof SpiderPunk) 
        {
            double vida;
            vida = p.getPuntosvida();
            
            double dano = 0;
            dano = puntosataque + puntosataque*0.10;
            
            double newvida;
            newvida = vida - dano;
            
            return newvida;
        }
        else
        {
            double newvida;
            newvida = p.getPuntosvida() - puntosataque;
            
            return newvida;
        }
    }

    @Override
    public String toString() {
        return super.toString();
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
    
}
