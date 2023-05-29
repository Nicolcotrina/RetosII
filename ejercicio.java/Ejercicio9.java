import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        // declarar variables
        double nota, suma = 0, promedio = 0;
        int n;
        // instanciar la clase para capturar los datos
        Scanner capturar = new Scanner(System.in);

        // solicitar cantidad de notas
        system.out.println("ingrese la cantidad de notas que va a registrar");
        n = capturar.nextint();
        // crear el bucle
        for (int i = 0; i < n; i++) {
            // solicitar calificacion
            System.out.println("ingrese la calificacion #" + (i + 1));
            // capturamos la nota
            nota = capturar.nextDouble();
            suma = suma + nota;
            // mostrar la nota
            System.out.println("su calificacion #" + (i + 1) + "es:" + nota);
        }
        promedio = (promedio + suma) / n;
        System.out.println("su promedio es" + promedio);
        capturar.close();
    }
}
