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
public class Listas {
    
    public String name;
    public ArrayList <ListaComp> lista = new ArrayList();
    
    public Listas(String name){
        this.name=name;
    }
    
    public void addLista (ListaComp listaAdd){
        lista.add(listaAdd);
    }
    
    public String getName(){
        return name;
    }
    
    public void stringListas(){
        
        for (int i=0; i<lista.size();i++){
            lista.get(i).stringListaComp();
        }
        
    }
    
    
}
