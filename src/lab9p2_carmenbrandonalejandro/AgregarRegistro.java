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
public class AgregarRegistro extends Thread {

    private JProgressBar progBar;
    private boolean isAlive = true;
    private boolean avanzar = true;

    public AgregarRegistro(JProgressBar progBar, boolean isAlive, boolean avanzar) {
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

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    @Override
    public void run() {
        while (isAlive) {
            if (avanzar) {
                progBar.setForeground(Color.yellow);
                progBar.setMaximum(12);
                progBar.setValue(progBar.getValue() + 1);
                if (progBar.getValue() == 12) {
                    isAlive = false;
                }
            } //FIN IF

            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
            }
        }
        JOptionPane.showMessageDialog(null, "Registro Agregado");
        progBar.setValue(0);
    }
}
