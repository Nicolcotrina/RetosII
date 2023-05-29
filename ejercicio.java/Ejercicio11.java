import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        // declarar variables
        int estudiante, equipo;
        // instanciar la clase para capturar los datos
        Scanner capturar = new Scanner(System.in);

        // solicitar estudiantes
        System.out.println("estudiantes en clase");
        estudiante = capturar.nextint();
        // crear el bucle
        for (int i = 0; i < estudiante; i++) {
            // solicitar el numero del equipo
            System.out.println("ingrese el numero del equipo que esta utilizando");
            // capturamos la nota
            equipo = capturar.nextDouble();
            equipo = equipo + estudiante;
            capturar.close();
        }
    }
}
