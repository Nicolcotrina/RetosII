import java.util.Scanner;
import java.util.scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        //instanciar clase 
        Scanner capturar=new Scanner(System.in);
        //Declarar variables
        string comentarios;
        string respuesta;
        i=1;
        int edad;
        do{
            System.out.println("¿cuantos años tienes?");
            edad=capturar.nextInt();
            if(edad <=18 ){
            System.out.println("agregar comentario");
            comentarios=capturar.nextLine();
            System.out.println("quieres agregar otro comentario");
            respuesta=capturar.nextLine();
            i=i+1;
            }
            else{
            System.out.println("no puedes comentar");
            }
        } while(respuesta=="si");
    }
}