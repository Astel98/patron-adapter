/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patron.adapter.dispositivo;

/**
 *
 * @author hugol
 */
public class LamparaInglesa {

    protected boolean isOn, isOff;

    public void onDevice() {
        this.isOn = true;
        this.isOff = false;
    }

    public void offDevice() {
        this.isOff = true;
        this.isOn = false;
    }
    
    public boolean isOn() {
        return isOn && !isOff;
    }
    

}
