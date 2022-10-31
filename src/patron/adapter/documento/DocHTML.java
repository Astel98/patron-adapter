/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patron.adapter.documento;

/**
 *
 * @author hugol
 */
public class DocHTML implements Documento {
    
    protected String contenido;

    @Override
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando contenido del HTML:");
        System.out.println(this.contenido);
    }

    @Override
    public void imprime() {
        System.out.println("Imprimiendo contenido del HTML:");
        System.out.println(this.contenido);
    }
    
}
