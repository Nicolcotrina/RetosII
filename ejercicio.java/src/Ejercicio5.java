import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] rgs) {
        // declarar variable//
        String opcion;
        int num1;
        int num2;
        double num3;
        double num4;
        int resul;
        int result2;
        int resul3;
        double resul1;
        // instanciar clases que se necesitan
        Scanner capturar = new Scanner(System.in);
        // solicitar datos
        System.out.println("elija una opcion: 1. suma 2. resta 3. multiplicacion 4.division 5.potencia ");
        // capturar datos
        opcion = capturar.nextLine();

        // generar condiciones
        switch (opcion) {
            case "suma":
                System.out.println(" digite el primer numero ");
                num1 = capturar.nextInt();
                System.out.println(" digite el segundo numero ");
                num2 = capturar.nextInt();
                resul = num1 + num2;
                System.out.println("el resultado es:" + resul);
                break;
            case "resta":
                System.out.println(" digite el primer numero ");
                num1 = capturar.nextInt();
                System.out.println(" digite el segundo numero ");
                num2 = capturar.nextInt();
                result2 = num1 - num2;
                System.out.println("el resultado de la resta es:" + result2);
                break;
            case "multiplicacion":
                System.out.println(" digite el primer numero ");
                num1 = capturar.nextInt();
                System.out.println(" digite el segundo numero ");
                num2 = capturar.nextInt();
                resul = num1 * num2;
                System.out.println("el resultado de la multiplicacion es:" + resul);
                break;
            case "division":
                System.out.println(" digite el primer numero ");
                num1 = capturar.nextInt();
                System.out.println(" digite el segundo numero ");
                num2 = capturar.nextInt();
                resul = num1 / num2;
                System.out.println("el resultado de la division es" + resul);
                break;
            case "potencia":
                System.out.println(" digite el primer numero ");
                num3 = capturar.nextDouble();
                System.out.println(" digite el segundo numero ");
                num4 = capturar.nextDouble();
                resul1 = Math.pow(num3, num4);
                System.out.println("el resultado de la potencia es: " + resul1);
                break;
            default:
                System.out.println("No ingreso operación valida");
                capturar.close();

        }
    }

}
