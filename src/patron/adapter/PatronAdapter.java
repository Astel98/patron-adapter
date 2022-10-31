/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patron.adapter;

import patron.adapter.dispositivo.AdaptadorLampara;
import patron.adapter.dispositivo.Dispositivo;
import patron.adapter.dispositivo.Lampara;
import patron.adapter.documento.DocPDF;
import patron.adapter.documento.DocHTML;
import patron.adapter.documento.Documento;

/**
 *
 * @author hugol
 */
public class PatronAdapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Documento doc1, doc2;
        System.out.println("-----CONTENIDO DOCUMENTO HTML-----");
        doc1 = new DocHTML();
        doc1.setContenido("Contenido para documento HTML");
        doc1.dibujar();

        System.out.println("-----CONTENIDO DOCUMENTO PDF-----");
        doc2 = new DocPDF();
        doc2.setContenido("Contenido para documento HTML");
        doc2.dibujar();
        
        
        Dispositivo lampara, inglesa;
        System.out.println("-----LAMPARA NORMAL-----");
        lampara = new Lampara();
        lampara.Encender();
        lampara.ImprimeEstado();
        lampara.Apagar();
        lampara.ImprimeEstado();
        
        System.out.println("-----LAMPARA INGLESA-----");
        inglesa = new AdaptadorLampara();
        inglesa.Encender();
        inglesa.ImprimeEstado();
        inglesa.Apagar();
        inglesa.ImprimeEstado();
        
        
        
        
        

    }

}
