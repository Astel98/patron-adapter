/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patron.adapter.documento;

/**
 *
 * @author hugol
 * Esta clase actuara como el adapter de CompPDF
 * para hacerlo compatible a la interfaz 
 * Documento.java
 */
public class DocPDF implements Documento {
    
    protected CompPDF componentePDF = new CompPDF();

    @Override
    public void setContenido(String contenido) {
        componentePDF.pdfFijarCont(contenido);
    }

    @Override
    public void dibujar() {
        componentePDF.pdfPrepararV();
        componentePDF.pdfRefresh();
        componentePDF.pdfFinV();
    }

    @Override
    public void imprime() {
        componentePDF.pdfEnviarImp();
    }
    
}
