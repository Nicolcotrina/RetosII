package prueba;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        int num;
        Scanner capturar=new Scanner (System.in);
        System.out.println("ingrese un numero");
        num=capturar.nextInt();
        if(num%2==0)
        System.out.println("el numero es par");
        else{
        System.out.println("el numero es impar");
    }
    }
}
