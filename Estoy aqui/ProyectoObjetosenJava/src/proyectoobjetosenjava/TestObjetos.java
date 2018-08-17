/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoobjetosenjava;

import java.util.Scanner;

/**
 *
 * @author Sala5
 */
public class TestObjetos {
    Scanner scan;
    int intA;
    static String StringMSG;
    final static float G=9.81f; /*m/s^{2}, constante de gravedad*/
    /*final se usa para que se convierta en una constante*/
    /*Static se usa para que sea una variable de clase*/
    
    public static void main(String[] args) {
        Scanner Scan=new Scanner(System.in);  /* Para obtener entrada del teclado*/
        int inta;
        TestObjetos.G=9.9f;
        /*System.out.println("Teclee un valor entero:");
        inta=Scan.nextInt();
        System.out.println("El entero inta="+inta); */
        System.out.println("Teclea algo!!!!");
        TestObjetos.StringMSG=Scan.nextLine();
        System.out.println("Usted tecleo:"+TestObjetos.StringMSG); /*sout+tab*/
        
        TestObjetos TO=new TestObjetos();
        TO.scan=new Scanner(System.in);
        System.out.println("Teclee otro valor entero: ");
        TO.intA=TO.scan.nextInt();
        System.out.println("El entero TO.intA="+TO.intA);
        System.out.println("El atributo StringMSG "
                + "del objeto TO:"+TO.StringMSG+"\n"+TO.toString());  /**/
    }//end main
    public String toString(){ //metodo
        return ""+intA+" Algún objeto de clase TestObjetos";
    }
    
} //end class TestObjetos


class A{
    
}