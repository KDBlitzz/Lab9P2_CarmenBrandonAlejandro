/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_carmenbrandonalejandro;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author diego
 */
public class EliminarRegistro extends Thread {

    private JProgressBar progBar;
    private boolean isAlive = true;
    private boolean avanzar = true;

    public EliminarRegistro(JProgressBar progBar, boolean isAlive, boolean avanzar) {
        this.progBar = progBar;
        this.isAlive = isAlive;
        this.avanzar = avanzar;
    }

    public JProgressBar getProgBar() {
        return progBar;
    }

    public void setProgBar(JProgressBar progBar) {
        this.progBar = progBar;
    }

    public boolean isIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    @Override
    public void run() {

        while (isAlive) {
            if (avanzar) {
                progBar.setForeground(Color.magenta);
                progBar.setMaximum(10);
                progBar.setValue(progBar.getValue() + 1);
                if (progBar.getValue() == 10) {
                    isAlive = false;
                }
            } //FIN IF

            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
            }
        }
        JOptionPane.showMessageDialog(null, "Ejecucion terminada con exito");
        progBar.setValue(0);
    }
}
