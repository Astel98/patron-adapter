/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patron.adapter.documento;

/**
 *
 * @author hugol
 */
public class CompPDF {
    
    protected String contenido;
    
    public void pdfFijarCont(String contenido){
        this.contenido = contenido;
    }
    
    public void pdfPrepararV(){
        System.out.println("Iniciando Visualizacion PDF");
    }
    
    public void pdfRefresh(){
        System.out.println("Visualizando contenido PDF:");
        System.out.println(this.contenido);
    }
    
    public void pdfFinV(){
        System.out.println("Terminando Visualizacion PDF");
    }
    
    public void pdfEnviarImp(){
        System.out.println("Enviando a imprimir contenido PDF:");
        System.out.println(this.contenido);
    }
    
}
