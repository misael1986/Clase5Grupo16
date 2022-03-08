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
public class Ventana4 extends JFrame {
    
    
    //Definición de Elemementos
    JLabel etiqueta;
    JTextField campoTexto;//Campo para escribr pero un sola linea
    JTextArea areaTexto;//tiene ancho y alto, es más grande
    JButton boton;//
    JComboBox listaDesplegable;//
    JRadioButton botonRedondo,botonRedondoII,botonRedondoIII;//
    JCheckBox cajita;//
    
    ButtonGroup grupo;//Este elemento controla la seleccion automarica de los redondos
    
    Ventana4(){
        this.setLayout(new CardLayout(20,20));//LayOuts son los que se encargan de la 
        //distribución de los elementos gráficos
        this.setTitle("Ventana Card");
        this.setSize(400,400);
        JPanel panel=new JPanel(new FlowLayout());
        JPanel panel2=new JPanel(new FlowLayout());
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
        
        panel.add(etiqueta);
        panel.add(campoTexto);
        panel.add(areaTexto);
        panel.add(boton);
        panel2.add(listaDesplegable);
        panel2.add(botonRedondo);
        panel2.add(botonRedondoII);
        panel2.add(botonRedondoIII);
        panel2.add(cajita);
        this.add(panel, "Panel 1");
        this.add(panel2, "Panel 2");
        
    }
    
}
