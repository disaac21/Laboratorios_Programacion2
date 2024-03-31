package lab6p2_danieljuarez;

import java.awt.Color;

public class Puffle {
    
    public String NombrePuffle;
    public int PrecioPuffle;
    public Color ColorPuffle;

    public Puffle() {
    }
    
    public Puffle(String NombrePuffle, int PrecioPuffle, Color ColorPuffle) {
        this.NombrePuffle = NombrePuffle;
        this.PrecioPuffle = PrecioPuffle;
        this.ColorPuffle = ColorPuffle;
    }

    public String getNombrePuffle() {
        return NombrePuffle;
    }

    public void setNombrePuffle(String NombrePuffle) {
        this.NombrePuffle = NombrePuffle;
    }

    public int getPrecioPuffle() {
        return PrecioPuffle;
    }

    public void setPrecioPuffle(int PrecioPuffle) {
        this.PrecioPuffle = PrecioPuffle;
    }

    public Color getColorPuffle() {
        return ColorPuffle;
    }

    public void setColorPuffle(Color ColorPuffle) {
        this.ColorPuffle = ColorPuffle;
    }
    
    
    
}
