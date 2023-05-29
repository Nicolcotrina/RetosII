import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        // declarar array
        int n;
        String[] apellido;
        // instanciar y crear un objeto tipo array
        apellido = new String[6];
        Scanner capturar = new Scanner(System.in);
        // segunda opcion //
         //en una sola linea
         /*String [] apellido2=new String[6];
        System.out.println("dijite la cantidad de apellidos que requiere");
        n = capturar.nextInt();
         */
        // declarar vector
       /*  String[] apellido1;
        apellido1 = new String[n];
        */
        String [] apellido3=new String[6];
        /*  primero manualmente
        apellido[0] = "";
        apellido[1] = "";
        apellido[2] = "";
        apellido[3] = "";
        apellido[4] = "";
        apellido[5] = "";
     String [] apellido3={"Bulla,Bobadilla,Briceño,Cotrina,Salinas,Rodriguez"};
        for (int i = 0; i<apellido.length; i++) {
            System.out.println("ingrese el apellido en la posicion:" + i);
            apellido1[i] = capturar.next();
        }
        for (int i = 0; i<apellido.length; i++) {
            System.out.println(apellido1[i]);
        }
        //for each mejorado
        for(String nombre:apellido) {
        System.out.println(nombre);
        }
        */
        for(String valor:apellido3){
            System.out.println("ingrese el apellido");
            valor=capturar.next();
        }
    }
}