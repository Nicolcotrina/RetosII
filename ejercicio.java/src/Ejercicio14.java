import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        int n,suma=0;
        int []numeros;
        Scanner capturar=new Scanner(System.in);
        System.out.println("dijite la cantidad de numeros que requiere");
        n=capturar.nextInt();
        numeros=new int[n];
        for (int i = 0; i<numeros.length; i++) {
            System.out.println("ingrese el numero en la posicion:" + i);
            numeros[i]=capturar.nextInt();
            suma= suma+numeros[i];
        }
        for(int i = 0; i<numeros.length; i++){
            System.out.println("los numeros que ingreso son:"+numeros[i]);
        }
        System.out.println("la suma es"+ suma);
    }
}

