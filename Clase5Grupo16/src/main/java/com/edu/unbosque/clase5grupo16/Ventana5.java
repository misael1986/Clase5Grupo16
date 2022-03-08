/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.clase5grupo16;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Usuario
 */
public class Ventana5 extends JFrame {
    
    
    //Definición de Elemementos
    JLabel etiqueta;
    JTextField campoTexto;//Campo para escribr pero un sola linea
    JTextArea areaTexto;//tiene ancho y alto, es más grande
    JButton boton;//
    JComboBox listaDesplegable;//
    JRadioButton botonRedondo,botonRedondoII,botonRedondoIII;//
    JCheckBox cajita;//
    
    ButtonGroup grupo;//Este elemento controla la seleccion automarica de los redondos
    
    Ventana5(){
        this.setLayout(null);//LayOuts son los que se encargan de la 
        //distribución de los elementos gráficos
        this.setTitle("Ventana NULL");
        this.setSize(400,400);
        this.setResizable(false);
        //Creación de elementos
        etiqueta=new JLabel("Etiqueta");
        campoTexto= new JTextField("Nombre",20);
        campoTexto.setToolTipText("Mensaje de Ayuda");
        areaTexto=new JTextArea(5,20);
        boton= new JButton("Botón");
        String cosas[]={"VISA","PASS","TI"};
        listaDesplegable =new JComboBox(cosas);
        listaDesplegable.addItem("CC");
        listaDesplegable.addItem("RC");
        listaDesplegable.addItem("CE");
        
        botonRedondo = new JRadioButton("AV");
        botonRedondoII = new JRadioButton("HDMI");
        botonRedondoIII = new JRadioButton("Componente");
        grupo= new ButtonGroup();
        grupo.add(botonRedondo);
        grupo.add(botonRedondoII);
        grupo.add(botonRedondoIII);
        
        cajita=new JCheckBox("Casado");
        
        etiqueta.setBounds(90,20,100,30);//Coordenadas y Tamaño
        this.add(etiqueta);
        campoTexto.setBounds(150,20,150,30);
        //                    x  y  Anc  Alt 
        this.add(campoTexto);
        areaTexto.setBounds(20,50,280,60);
        this.add(areaTexto);
        boton.setBounds(100,120,100,30);
        this.add(boton);
        this.add(listaDesplegable);
        listaDesplegable.setBounds(100,160,100,30);
        
        botonRedondo.setBounds(20,200,100,30);
        botonRedondoII.setBounds(130,200,100,30);
        botonRedondoIII.setBounds(260,200,100,30);
        this.add(botonRedondo);
        this.add(botonRedondoII);
        this.add(botonRedondoIII);
        cajita.setBounds(250,250,80,20);
        this.add(cajita);
        
    }
    
}
