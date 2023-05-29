
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        // Declarar las variable//
        int edad;
        Scanner captura = new Scanner(System.in);
        System.out.println("por favor ingrese su edad");
        edad = captura.nextInt();
        if (edad >= 18)
            System.out.println("Puedes ingresar a la discoteca");
    else
    if (edad <= 18)
        System.out.println("usted no puede ingresar");
       
        captura.close();
    }
}
