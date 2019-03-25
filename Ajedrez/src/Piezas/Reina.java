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
public class Reina extends Pieza {

    public Reina(String color) {
        super(color);
    }

    public Reina() {
    }
    
    
    
      @Override
      public boolean movimiento(int f1,int c1,int f2,int c2) {
        
        if ((f1==f2) || (c1==c2) || (Math.abs(f1-f2) == Math.abs(c1-c2))) {
            return true; 
         }else{
             return false;
         }
       
    }
    
}
