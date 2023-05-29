package RetosII;

import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        int cnotas=0;
        int suma=0;
        int promedio=0;
        Scanner capturar=new Scanner(System.in);
        System.out.println("Dijite la cantidad de notas que vas evaluar");
        cnotas=capturar.nextInt();
        int [] array=new int[cnotas];
        for(int i =0; i < cnotas; i++){
            System.out.println("dijite el valor de sus notas");
        array[i]= capturar.nextInt();
        suma=suma+array[i];
    }
    promedio=suma/cnotas;
    if(promedio<3){
        System.out.println("Reprobaste");
    } else if (promedio>=3 && promedio<=4 ){
        System.out.println("Pasaste Raspando");
    }else if(promedio>4){
        System.out.println("Aprobaste con buenos resultados");
    }
    capturar.close();
}
}
