

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class HiloDownload {

    public JProgressBar BarraArchivo;
    public JProgressBar BarraCarpeta;
    public int PesoArchivo;
    public int ArchivosCarpeta;
    public boolean start;

    public HiloDownload() {
    }

    public HiloDownload(JProgressBar BarraArchivo, JProgressBar BarraCarpeta, int PesoArchivo, int ArchivosCarpeta) {
        this.BarraArchivo = BarraArchivo;
        this.BarraCarpeta = BarraCarpeta;
        this.PesoArchivo = PesoArchivo;
        this.ArchivosCarpeta = ArchivosCarpeta;
        this.start = false;
    }

    public JProgressBar getBarraArchivo() {
        return BarraArchivo;
    }

    public void setBarraArchivo(JProgressBar BarraArchivo) {
        this.BarraArchivo = BarraArchivo;
    }

    public JProgressBar getBarraCarpeta() {
        return BarraCarpeta;
    }

    public void setBarraCarpeta(JProgressBar BarraCarpeta) {
        this.BarraCarpeta = BarraCarpeta;
    }

    public int getPesoArchivo() {
        return PesoArchivo;
    }

    public void setPesoArchivo(int PesoArchivo) {
        this.PesoArchivo = PesoArchivo;
    }

    public int getArchivosCarpeta() {
        return ArchivosCarpeta;
    }

    public void setArchivosCarpeta(int ArchivosCarpeta) {
        this.ArchivosCarpeta = ArchivosCarpeta;
    }

    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = true;
    }
    
    public void run() {
        int cont = PesoArchivo / 10;
        BarraCarpeta.setMaximum(ArchivosCarpeta);
        BarraArchivo.setMaximum(cont);
        while (start) {
            BarraArchivo.setValue(BarraArchivo.getValue()+1);
            if (BarraArchivo.getValue() == BarraArchivo.getMaximum()) {
                BarraCarpeta.setValue(BarraCarpeta.getValue()+1);
                if (BarraCarpeta.getValue() == BarraCarpeta.getMaximum() && BarraArchivo.getValue() == BarraArchivo.getMaximum()) {
                    JOptionPane.showMessageDialog(null, "Fin de la Descarga", "Descarga", JOptionPane.PLAIN_MESSAGE);
                    BarraCarpeta.setValue(0);
                    BarraArchivo.setValue(0);
                    start = false;
                }
            }
            try {
                Thread.sleep(cont * 1000);
            } catch (Exception e) {
            }
        }
    }
    
}

//            
