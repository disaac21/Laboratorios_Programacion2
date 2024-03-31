package danieljuarez_lab10p2;

import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

public class HiloTyping extends Thread {

    public JProgressBar Bar;
    public JTextArea Text;
    public java.awt.event.KeyEvent evt;

    public HiloTyping() {
    }

    public HiloTyping(JProgressBar Bar, JTextArea Text, java.awt.event.KeyEvent evt) {
        this.Bar = Bar;
        this.Text = Text;
        this.evt = evt;
    }

    public JProgressBar getBar() {
        return Bar;
    }

    public void setBar(JProgressBar Bar) {
        this.Bar = Bar;
    }

    public JTextArea getText() {
        return Text;
    }

    public void setText(JTextArea Text) {
        this.Text = Text;
    }

    public KeyEvent getEvt() {
        return evt;
    }

    public void setEvt(KeyEvent evt) {
        this.evt = evt;
    }

    public void run() {
        Bar.setMaximum(300);
        while (true) {
            int valor = evt.getKeyChar();
            if (valor > 96 && valor < 123) {
                Bar.setValue(valor);
            } else {
                Bar.setValue(valor * 2);
            }
            try {
                Thread.sleep(100);
                Bar.setValue(0);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloPlaying.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
