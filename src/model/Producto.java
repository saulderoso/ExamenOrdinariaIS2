/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author sauld
 */
public class Producto {
    String nombreProducto;
    String category;
    boolean marcado = false;
    
    public Producto(String nombreProducto, String category){
        this.nombreProducto=nombreProducto;    
        this.category=category;
    }
    
    public String getProductName(){
        return this.nombreProducto;
    }
    
    public String getCategory(){
        return this.category;
    }
    
    public void mark(){
        this.marcado=true;
    }
    
    public void unMark(){
        this.marcado=false;
    }
    
    public boolean isMark(){
        return this.marcado;
    }
    
    public String stringProducto(){
        return " Nombre: " + nombreProducto + " Categoría: " + category;
    }
    
}
