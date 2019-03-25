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
public class Rey extends Pieza {

    public Rey(String color) {
        super(color);
    }

    public Rey() {
    }
    
    
    
      @Override
      public boolean movimiento(int f1,int c1,int f2,int c2) {
        
                
                 if ((Math.abs(f1-f2)<=1 && Math.abs(c1-c2) <=1)) {
            return true; 
         }else{
             return false;
         }
        
 
    }
    
    
}
