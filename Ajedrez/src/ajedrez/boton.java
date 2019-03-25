/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import Piezas.*;

/**
 *
 * @author Asus Pc
 */
public class boton extends JButton implements ActionListener {
    Pieza pieza = new Pieza();
    int fila;
    int columna;
    
    public boton(int x1 , int y1,int x2 , int y2, Tablero p){
        
        setBounds(x1, y1, x2, y2);
        
       /* MouseHandler handler = new MouseHandler();
        addMouseListener(handler);
        addMouseMotionListener(handler);*/
    }
    
    
    
    public void CambiarNombre(int x , int y){
      
        
        
        setText((x+1)+","+(y+1));
         fila = (x+1)-1;
        columna = (y+1)-1;
        
        setName(fila+","+columna);
        
        if ((x+y) % 2 == 0) {
            setBackground(Color.WHITE);
        }else{
            setBackground(Color.darkGray);
        }
            
    }

    public Pieza getPieza() {
        return pieza;
    }

    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    
    
     
    
    
    
    
    
    public String dejarNombre(){
        return getName();
    }

  /*  @Override
    public String obtener() {
        return getName();
    }*/




    @Override
    public void actionPerformed(ActionEvent e) {
    
         System.out.println("hola");
    }
    
    
    
    



}
