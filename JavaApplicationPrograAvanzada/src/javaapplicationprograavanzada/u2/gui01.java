/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationprograavanzada.u2;

/**
 *
 * @author Sala5
 */
import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout; 
import java.awt.event.WindowAdapter;

import java.awt.event.WindowEvent;

public class gui01 {
    Frame F;
    Button B1,B2,B3;
    
    public gui01(){
        F=new Frame("gui01");
        F.setLayout(new FlowLayout()); //Se instancia el objeto
        B1=new Button("Boton 1");
        B2=new Button("Boton 2");
        B3=new Button("Boton 3");
        F.add(B1);
        F.add(B2);
        F.add(B3);
        F.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent we){
            F.dispose();
            System.exit(0);
        }
    });
        
        F.setSize(400,300);
        F.setLocationRelativeTo(null);//Para que se coloque al centro de la ventana
        F.setVisible(true);//Si esto no se define la ventana será invisible
    }//end guid01
    
    public static void main(String[] args){
        new gui01();
    }
}//end class gui01
