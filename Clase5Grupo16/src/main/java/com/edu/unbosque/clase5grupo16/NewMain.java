/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.clase5grupo16;

import javax.swing.JFrame;

/**
 *
 * @author Usuario
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Componentes graficos de JFrame y Layouts
        
        Ventana v1=new Ventana();
        v1.setVisible(true);
        v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Ventana2 v2=new Ventana2();
        v2.setVisible(true);
        v2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Ventana3 v3=new Ventana3();
        v3.setVisible(true);
        v3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
         Ventana4 v4=new Ventana4();
        v4.setVisible(true);
        v4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
      
         Ventana5 v5=new Ventana5();
        v5.setVisible(true);
        v5.setResizable(true);
        v5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
