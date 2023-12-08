/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_carmenbrandonalejandro;

import java.awt.Color;
import javax.swing.JProgressBar;

/**
 *
 * @author diego
 */
public class HiloAgregarRegistro extends Thread{
    private JProgressBar progBar;
    private boolean isAlive;

    public HiloAgregarRegistro(JProgressBar progBar, boolean isAlive) {
        this.progBar = progBar;
        this.isAlive = isAlive;
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

        boolean avanzar = true;
        while(isAlive){
            if(avanzar){
                progBar.setForeground(Color.yellow);
                progBar.setValue(progBar.getValue()+1);
                if(progBar.getValue()== 12){
                    isAlive=false;
                }                
            } //FIN IF
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
            }
        }
    }
    
}
