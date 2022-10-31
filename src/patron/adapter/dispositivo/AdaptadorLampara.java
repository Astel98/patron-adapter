/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patron.adapter.dispositivo;

/**
 *
 * @author hugol
 */
public class AdaptadorLampara implements Dispositivo{
    
    protected LamparaInglesa lampara = new LamparaInglesa();

    @Override
    public void Encender() {
        this.lampara.onDevice();
    }

    @Override
    public void Apagar() {
        this.lampara.offDevice();
    }

    @Override
    public void ImprimeEstado() {
        boolean estado = lampara.isOn();
        
        if(estado){
            System.out.println("La lampara esta: prendida");
        }else{
            System.out.println("La lampara esta: apagada");
        }
        
    }
        
    
}
