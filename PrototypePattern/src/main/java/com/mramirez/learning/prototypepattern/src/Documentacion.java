/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mramirez.learning.prototypepattern.src;

import java.util.List;

/**
 *
 * @author ASUS
 */
public abstract class Documentacion {
    
    
    protected List<Documento>  documentos;
    
    public List<Documento> getAllDocumentos(){
        
        return documentos;
    }
    
}
