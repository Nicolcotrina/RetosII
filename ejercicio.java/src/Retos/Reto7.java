package Retos;
import java.util.Random;
import java.util.Scanner;
public class Reto7 {
    public static void main(String[] args) {
 int res;
        Scanner capturar = new Scanner(System.in);
            Random random = new Random();

System.out.println("Quieres jugar 1.si o 2.no");
res=capturar.nextInt();
    if(res==1){

        do{
            System.out.print("Elige cara (0) o sello (1): ");
                    int resultado = random.nextInt(2);
                    int eleccionmaqui = capturar.nextInt();

                    if (eleccionmaqui == resultado) {
                        System.out.println("Ganaste");
                    } else {
                        System.out.println("Perdiste");
                    }

            System.out.println("¿Quieres jugar otra vez 1.si o 2.no?");
            res=capturar.nextInt();
        }while(res==1);
    }
    capturar.close();
}
    }



