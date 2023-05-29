package prueba;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        int boleteriap1;
        int boleteriap2;
        int boleteriap3;
        double gananciap1;
        double gananciap2;
        double gananciap3;
        int totalrecau;
        double totalrecauequi;
        Scanner capturar=new Scanner(System.in);
        System.out.println("¿cuanto gano en la boleteria del partido 1");
        boleteriap1=capturar.nextInt();
        System.out.println("¿cuanto gano en la boleteria del partido 2");
        boleteriap2=capturar.nextInt();
        System.out.println("¿cuanto gano en la boleteria del partido 3");
        boleteriap3=capturar.nextInt();
        totalrecau=boleteriap1+boleteriap2+boleteriap3;
        System.out.println("el recaudo de la boleteria es:"+ totalrecau);
        gananciap1 = boleteriap1*0.2;
        gananciap2 = boleteriap2*0.3;
        gananciap3 = boleteriap3*0.4;
        totalrecauequi= gananciap1+gananciap2+gananciap3;
        System.out.println("el recaudo del equipo es:" + totalrecauequi);
    }

}
