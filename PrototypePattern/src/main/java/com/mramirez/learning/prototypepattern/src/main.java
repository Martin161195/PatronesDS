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
public class main {
    
    
    
    public static void main(String[] args){
        
        //incializacion de la documentacion
        DocumentacionBlanco docBlanco = DocumentacionBlanco.Instance();
        
        docBlanco.incluye(new OrdenPedido());
        docBlanco.incluye(new CertificadoCesion());
        docBlanco.incluye(new SolicitudMatriculacion());
        
        
        // Creacion de documentacion nueva para dos clientes
        
        DocumentacionCliente documentacionCliente1 = new DocumentacionCliente("Cliente 1 => Martin");
        DocumentacionCliente documentacionCliente2 = new DocumentacionCliente("Cliente 2 => Sara");
        
        //Visualizar los documentos para ambos clientes
        System.out.println("----------------------------------"); 
        documentacionCliente1.visualiza();
        documentacionCliente1.imprime();
        
        System.out.println("----------------------------------");
        
        documentacionCliente2.visualiza();
        documentacionCliente2.imprime();
        System.out.println("----------------------------------");
    }
}
