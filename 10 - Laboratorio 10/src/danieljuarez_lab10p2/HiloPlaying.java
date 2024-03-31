package danieljuarez_lab10p2;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

public class HiloPlaying extends Thread {

    public JProgressBar Bar;
    public boolean Play;
    public String Lyrics;
    public JTextArea Text;

    public HiloPlaying(JProgressBar Bar, String Lyrics, JTextArea Text) {
        this.Bar = Bar;
        this.Play = true;
        this.Lyrics = Lyrics;
        this.Text = Text;
    }

    public JProgressBar getBar() {
        return Bar;
    }

    public void setBar(JProgressBar Bar) {
        this.Bar = Bar;
    }

    public boolean isPlay() {
        return Play;
    }

    public void setPlay(boolean Play) {
        this.Play = Play;
    }

    public String getLyrics() {
        return Lyrics;
    }

    public void setLyrics(String Lyrics) {
        this.Lyrics = Lyrics;
    }

    public JTextArea getText() {
        return Text;
    }

    public void setText(JTextArea Text) {
        this.Text = Text;
    }

    @Override
    public void run() {
        Bar.setMaximum(300);
        Text.setText("");
        while (Play) {
            for (int i = 0; i < Lyrics.length(); i++) {
                int valor = Lyrics.charAt(i);
                String letra = Character.toString(Lyrics.charAt(i));
                Text.append(letra);
                if (valor > 96 && valor < 123) {
                    Bar.setValue(valor);
                } else {
                    Bar.setValue(valor * 2);
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(HiloPlaying.class.getName()).log(Level.SEVERE, null, ex);
                }
                Bar.setValue(0);
            }
            Play = false;
            JOptionPane.showMessageDialog(null, "Se Termino La Cancion", "Hilo", JOptionPane.PLAIN_MESSAGE);
        }
    }

}
