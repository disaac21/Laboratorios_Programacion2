package danieljuarez_lab8p2;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class Barra extends Thread {

    public JProgressBar Barra;
    public boolean YaSet;
    public boolean Vivo;
    public int Decrease;

    public Barra() {
    }

    public Barra(JProgressBar Barra, boolean YaSet, boolean Vivo, int Decrease) {
        this.Barra = Barra;
        this.YaSet = false;
        this.Vivo = true;
        this.Decrease = Decrease;
    }

    public JProgressBar getBarra() {
        return Barra;
    }

    public void setBarra(JProgressBar Barra) {
        this.Barra = Barra;
    }

    public boolean isYaSet() {
        return YaSet;
    }

    public void setYaSet(boolean YaSet) {
        this.YaSet = YaSet;
    }

    public boolean isVivo() {
        return Vivo;
    }

    public void setVivo(boolean alive) {
        this.Vivo = alive;
    }

    public int getDecrease() {
        return Decrease;
    }

    public void setDecrease(int Decrease) {
        this.Decrease = Decrease;
    }

    @Override
    public void run() {
        while (YaSet) {
            while (Vivo) {
                Barra.setValue(Barra.getValue() - Decrease);
                if (Barra.getValue() == 0) {
                    JOptionPane.showMessageDialog(null, "Su Mascota Ha Fallecido", "Pet", JOptionPane.PLAIN_MESSAGE);
                    Vivo = false;
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }

}
