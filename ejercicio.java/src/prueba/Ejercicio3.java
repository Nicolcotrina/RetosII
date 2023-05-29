package prueba;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
       int  vacunasips=0,vacunasentre,vacunasdispo;
       Scanner capturar = new Scanner(System.in);
       while ( vacunasips <= 200)
       System.out.println("Agregue la cantidad de vacunas que distribuyo en la 1 ips");
       System.out.println("Agregue la cantidad de vacunas que distribuyo en la 2 ips");
       System.out.println("Agregue la cantidad de vacunas que distribuyo en la 3 ips");
       System.out.println("Agregue la cantidad de vacunas que distribuyo en la 4 ips");
       System.out.println("Agregue la cantidad de vacunas que distribuyo en la 5 ips");
      vacunasips=capturar.nextInt();
      vacunasentre= vacunasentre+vacunasips;
       
       else {
        System.out.println("las vacunas entregadas no son validas");
       }
       


    }
}
