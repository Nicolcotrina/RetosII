public class Ejercicio10 {
    
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
        do{
            // solicitar calificacion
            System.out.println("ingrese la calificacion #" + (i + 1));
            // capturamos la nota
            nota = capturar.nextDouble();
            suma = suma + nota;
            // mostrar la nota
            System.out.println("su calificacion #" + (i + 1) + "es:" + nota);
        }while(resp==1);
        
        promedio = (promedio + suma) / n;
        System.out.println("su promedio es" + promedio);
        capturar.close();
    }
}
}
