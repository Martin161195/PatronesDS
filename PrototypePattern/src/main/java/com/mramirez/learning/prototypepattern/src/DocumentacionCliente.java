/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mramirez.learning.prototypepattern.src;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class DocumentacionCliente extends Documentacion {
    
    public DocumentacionCliente(String informacion){
        
        documentos = new ArrayList<Documento>();
        DocumentacionBlanco documentacionBlanco = DocumentacionBlanco.Instance();
        
        List<Documento> documentosEnBlanco = documentacionBlanco.getAllDocumentos();
        
        for(Documento documento: documentosEnBlanco){
            Documento copiaDocumento = documento.duplica();
            
            copiaDocumento.rellenar(informacion);
            
            documentos.add(copiaDocumento);
        }
        
    }
    
    
    public void visualiza(){
        
        for(Documento doc : documentos){
            
           doc.visualizar();
        }
        
    }
    
    public void imprime(){
        
        for(Documento doc : documentos){
            
            doc.imprimir();
            
        }
    }
    
    
    
}
