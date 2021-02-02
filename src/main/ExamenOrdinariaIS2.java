/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import model.*;

/**
 *
 * @author sauld
 */

public class ExamenOrdinariaIS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto platano = new Producto("platano","fruta");
        Producto pera = new Producto("pera","fruta");
        
        Producto sardina = new Producto("sardina","agua salada");
        Producto piraña = new Producto("piraña","agua dulce");
        
        ListaComp compra = new ListaComp ("Compra");
        
        compra.addProducto(platano);
        compra.addProducto(pera);
            
        pera.mark();
        
        ListaComp peces = new ListaComp ("Peces");
        
        peces.addProducto(piraña);
        peces.addProducto(sardina);
        
        Listas total = new Listas("Todas Las Listas");
        
        total.addLista(compra);
        total.addLista(peces);

        
        total.stringListas();
        
        
        if(pera.isMark()==true){
            System.out.println("Pera esta marcada");
        }
        
        pera.unMark();
        
        if(pera.isMark()==true){
            System.out.println("Pera esta marcada");
        }
        
        
    }
    
}
