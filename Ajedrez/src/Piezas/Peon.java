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
public class Peon extends Pieza{


    public Peon(String color) {
       super(color);
    }

    public Peon() {
    }
    
    
  @Override
  public boolean movimiento(int f1,int c1,int f2,int c2) {
      boolean mover = true;
      
      if (c1 == c2) {
            if ((f2-f1 == 1 || f2 - f1 == 2)&& super.getColor().equals("negra") || (f2-f1 == -1 || f2 - f1 == -2)&& super.getColor().equals("blanca")) {
            mover = true;
      }else{
            mover = false;
        }
          
      }else{
          mover = false;
      }
      
    
        return mover;
      
    }
    
}
