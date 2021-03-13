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
public class OrdenPedido extends Documento {

    
    
    @Override
    public void imprimir() {
        System.out.println("Imprime la orden del pedido: "+contenido);
    }

    @Override
    public void visualizar() {
        System.out.println("Viusaliza la orden del pedido: "+contenido);
    }
    
}
