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
public class Torre extends Pieza{

    public Torre(String color) {
        super(color);
    }

    public Torre() {
    }
    
    
    
     @Override
     public boolean movimiento(int f1,int c1,int f2,int c2) {
       if ((f1==f2) || (c1==c2)) {
            return true; 
         }else{
             return false;
         }
    }
    
    
}
