/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author sauld
 */

public class ListaComp {
    public String name;
    public ArrayList <Producto> lista = new ArrayList();
    
    public ListaComp(String name){
        this.name=name;
    }
    
    public void addProducto (Producto product){
        if(!lista.contains(product)){
            lista.add(product);
        }
    }
    
    public String getName(){
        return name;
    }
    
    public void stringListaComp(){
        System.out.println("Lista " + name + ":");
        for (int i=0; i<lista.size();i++){
            System.out.println(lista.get(i).stringProducto());
        }
    }
    
    public void removeProducto(Producto product){
        lista.remove(product);
    }
    
}
