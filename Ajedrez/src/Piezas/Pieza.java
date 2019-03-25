/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Piezas;

/**
 *
 * @author Asus Pc
 */
public class Pieza implements Movimiento {
   String color;

    public Pieza(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
   
   
    
    
    public Pieza() {
    }
    
     

   public boolean movimiento(int f1,int c1,int f2,int c2) {
        
        
        return true;
    }
    
    
   
}
