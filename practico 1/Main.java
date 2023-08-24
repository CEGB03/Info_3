import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String respuesta;
        int ejercicio, numCalcular;
        char repartir, siMayuscula='S', siMiniscula='s';

        do {
            System.out.println ("Ingrese la opccion correspondiente");
            System.out.println ("1. Factorial de un numero entero positivo");
            System.out.println ("2. Sumatoria de un numero entero positivo");
            System.out.println ("3. Potencia de un numero entero positivo");
            System.out.println ("4. Conteo de un numero entero positivo");
            ejercicio=Integer.parseInt(sc.nextLine());
            switch (ejercicio){
                case 1:
                    System.out.println ("Ingrese un numero entero positivo para calcular el Factorial: ");
                    numCalcular=Integer.parseInt(sc.nextLine());
                    Factorial factorial=new Factorial(numCalcular);
                    System.out.println("Factorial de "+numCalcular+"! = "+factorial.getN());
                    break;
                case 2:
                    System.out.println ("Ingrese un numero entero positivo para calcular la Sumatoria: ");
                    numCalcular=Integer.parseInt(sc.nextLine());
                    Sumatoria sumatoria=new Sumatoria(numCalcular);
                    System.out.println("Sumatoria de "+numCalcular+" = "+sumatoria.getN());
                    break;
                case 3:
                    System.out.println ("Ingrese un numero entero positivo para que sea la base de la potencia: ");
                    numCalcular=Integer.parseInt(sc.nextLine());
                    System.out.println ("Ingrese un numero entero positivo para que sea el elevado de la potencia: ");
                    int potenciaNum=Integer.parseInt(sc.nextLine());
                    Potencia potencia=new Potencia(numCalcular, potenciaNum);
                    System.out.println("Potencia de "+numCalcular+" elevado a "+potenciaNum+" = "+potencia.getR());
                    break;
                case 4:
                    System.out.println ("Ingrese un numero entero positivo para que se realice un conteo: ");
                    numCalcular=Integer.parseInt(sc.nextLine());
                    Conteo conteo=new Conteo(numCalcular);
                    //System.out.println("Conteo de "+numCalcular+" = fue: "+conteo.s.toString());
                    break;
            }
            System.out.println("Realizar otro ejercicio? Si/No");
            respuesta = sc.nextLine();
            repartir = respuesta.charAt(0);
        } while (repartir == siMayuscula || repartir == siMiniscula);
    }
}
