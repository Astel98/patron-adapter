/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patron.adapter.dispositivo;

/**
 *
 * @author hugol
 */
public class Lampara implements Dispositivo {
    
    protected boolean estado;

    @Override
    public void Encender() {
        this.estado = true;
    }

    @Override
    public void Apagar() {
        this.estado = false;
    }

    @Override
    public void ImprimeEstado() {
        String esta = this.estado?"prendida":"apagada";
        System.out.println("La lampara esta: " + esta);
    }
    
}
