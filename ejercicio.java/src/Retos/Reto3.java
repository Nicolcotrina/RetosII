package Retos;
import java.util.Random;
import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        int resultado;
        int eleccionmaqui;
        Scanner capturar = new Scanner(System.in);
            Random random = new Random();
            System.out.println("Bienvenidos a nuestro programa donde vas a poder jugar con la maquina el juego de cara y sello:");
            System.out.print("Elige cara (0) o sello (1): ");
             resultado = random.nextInt(2);
             eleccionmaqui = capturar.nextInt();

            if (eleccionmaqui == resultado) {
                System.out.println("Ganaste");
            } else {
                System.out.println("Perdiste");
            }
            capturar.close();
    }
}

