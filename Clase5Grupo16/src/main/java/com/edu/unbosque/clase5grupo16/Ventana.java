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
public class Ventana extends JFrame {
    
    
    //Definición de Elemementos
    JLabel etiqueta;
    JTextField campoTexto;//Campo para escribr pero un sola linea
    JTextArea areaTexto;//tiene ancho y alto, es más grande
    JButton boton;//
    JComboBox listaDesplegable;//
    JRadioButton botonRedondo,botonRedondoII,botonRedondoIII;//
    JCheckBox cajita;//
    
    ButtonGroup grupo;//Este elemento controla la seleccion automarica de los redondos
    
    Ventana(){
        this.setLayout(new FlowLayout());//LayOuts son los que se encargan de la 
        //distribución de los elementos gráficos
        this.setTitle("Ventana Flow");
        this.setSize(400,400);
        
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
        
        this.add(etiqueta);
        this.add(campoTexto);
        this.add(areaTexto);
        this.add(boton);
        this.add(listaDesplegable);
        this.add(botonRedondo);
        this.add(botonRedondoII);
        this.add(botonRedondoIII);
        this.add(cajita);
        
    }
    
}
