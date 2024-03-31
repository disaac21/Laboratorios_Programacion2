package danieljuarez_lab8p2;

import java.awt.Color;

public class Mascota {
    
    public String NombreMascota;
    public int PuntosVida;
    public int PuntosVidaDecrease;
    public int Delay;
    public int CostoMascota;
    public Color ColorMascota;

    public Mascota() {
    }

    public Mascota(String NombreMascota, int PuntosVida, int PuntosVidaDecrease, int Delay, int CostoMascota, Color ColorMascota) {
        this.NombreMascota = NombreMascota;
        this.PuntosVida = PuntosVida;
        this.PuntosVidaDecrease = PuntosVidaDecrease;
        this.Delay = Delay;
        this.CostoMascota = CostoMascota;
        this.ColorMascota = ColorMascota;
    }

    public String getNombreMascota() {
        return NombreMascota;
    }

    public void setNombreMascota(String NombreMascota) {
        this.NombreMascota = NombreMascota;
    }

    public int getPuntosVida() {
        return PuntosVida;
    }

    public void setPuntosVida(int PuntosVida) {
        this.PuntosVida = PuntosVida;
    }

    public int getPuntosVidaDecrease() {
        return PuntosVidaDecrease;
    }

    public void setPuntosVidaDecrease(int PuntosVidaDecrease) {
        this.PuntosVidaDecrease = PuntosVidaDecrease;
    }
    
    public int getDelay() {
        return Delay;
    }

    public void setDelay(int Delay) {
        this.Delay = Delay;
    }

    public int getCostoMascota() {
        return CostoMascota;
    }

    public void setCostoMascota(int CostoMascota) {
        this.CostoMascota = CostoMascota;
    }

    public Color getColorMascota() {
        return ColorMascota;
    }

    public void setColorMascota(Color ColorMascota) {
        this.ColorMascota = ColorMascota;
    }

    @Override
    public String toString() {
        return NombreMascota;
    }
    
    
    
}
