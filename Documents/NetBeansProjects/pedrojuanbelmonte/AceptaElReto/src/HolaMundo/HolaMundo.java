/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HolaMundo;

/*
 *
 * HolaMundo.java
 * Creada el 13-ene-2017,9:27:50
 *
 * Desarrollada por miquelpedro en la empresa Abastos.
 /**
 *
 * @author $MiquelyPedro
 * @version 1.0
 * @company $abastos micorreo@gmail.com
 * @Fecha 13-ene-2017
 */
import java.util.Scanner;
public class HolaMundo {   
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    int n=teclado.nextInt();
    while(n>0 && n<=5){
        System.out.println("Hola Mundo.");
        n--;
    }
    }
}

