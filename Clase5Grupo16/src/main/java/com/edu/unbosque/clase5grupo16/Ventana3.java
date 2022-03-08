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
public class Ventana3 extends JFrame {
    
    
    //Definición de Elemementos
    JLabel etiqueta;
    JTextField campoTexto;//Campo para escribr pero un sola linea
    JTextArea areaTexto;//tiene ancho y alto, es más grande
    JButton boton;//
    JComboBox listaDesplegable;//
    JRadioButton botonRedondo,botonRedondoII,botonRedondoIII;//
    JCheckBox cajita;//
    
    ButtonGroup grupo;//Este elemento controla la seleccion automarica de los redondos
    
    Ventana3(){
        this.setLayout(new BorderLayout());//LayOuts son los que se encargan de la 
        //distribución de los elementos gráficos
        this.setTitle("Ventana Border");
        this.setSize(400,400);
        JPanel panelN=new JPanel(new FlowLayout());
        panelN.setBackground(Color.red);
        JPanel panelS=new JPanel(new FlowLayout());
        panelS.setBackground(Color.BLUE);
        JPanel panelE=new JPanel(new FlowLayout());
        panelE.setBackground(Color.ORANGE);
        
        JPanel panelO=new JPanel(new FlowLayout());
        panelO.setBackground(Color.YELLOW);
        JPanel panelC=new JPanel(new FlowLayout());
        
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
        
        panelN.add(etiqueta);
        panelN.add(campoTexto, BorderLayout.NORTH);
        panelS.add(areaTexto, BorderLayout.SOUTH);
        panelE.add(boton, BorderLayout.EAST);
        panelC.add(listaDesplegable, BorderLayout.CENTER);
        panelS.add(botonRedondo,BorderLayout.SOUTH);
        panelS.add(botonRedondoII,BorderLayout.SOUTH);
        panelS.add(botonRedondoIII,BorderLayout.SOUTH);
        panelO.add(cajita,BorderLayout.WEST);
        
        this.add(panelN, BorderLayout.NORTH);
        this.add(panelS, BorderLayout.SOUTH);
        this.add(panelE, BorderLayout.EAST);
        this.add(panelO, BorderLayout.WEST);
        this.add(panelC, BorderLayout.CENTER);
        
        
        
    }
    
}
