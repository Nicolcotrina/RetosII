package Operaciones;

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
       
        int n1,n2,suma=0;
        //instancia de una clase= crear un objeto
     //nombre de la clase, nombre del objeto = palabra reservada (new) estado//
     Scanner capturar= new Scanner(System.in);

        System.out.println("Bienvenido al programa");
        System.out.println("Dijite el primer numero");
        n1=capturar.nextInt();
        System.out.println("Dijite el  segundo numero");
        n2=capturar.nextInt();
        System.out.println("Los numeros son: "+n1+"y"+n2);
        suma=n1+n2;
        System.out.println("El resultado de la suma es"+suma);
        
        
        capturar.close();
    }
}