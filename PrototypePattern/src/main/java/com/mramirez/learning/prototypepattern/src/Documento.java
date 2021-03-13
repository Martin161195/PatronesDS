/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mramirez.learning.prototypepattern.src;

/**
 *
 * @author ASUS
 */
public abstract class Documento implements Cloneable {
    
    protected String contenido = new String ();
    
    public Documento duplica(){
        Documento result;
        
        try{
            result = (Documento) this.clone();
            
        }catch(CloneNotSupportedException e){
            return null;
        }
        
        return result;
    }
    
    
    public void rellenar(String informacion){
        contenido = informacion;
    }
    
    public abstract void imprimir();
    
    public abstract void visualizar();
    
    
}
