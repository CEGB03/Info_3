import java.util.Scanner;
import utils.CapturaTiempo;
import utils.Ordenamientos;

public class Ejercicio4 {
    /**
     * Realizar captura de tiempos para cada uno de los algoritmos de ordenamiento para:
     * a. 100 elementos.
     * b. 1000 elementos.
     * c. 10000 elementos.
     */
    static Integer [] arrayList;
    static int ejercicio;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de ejercicio a realizar:\na. 100 elementos.\nb. 1000 elementos.\nc. 10000 elementos.\nSe calculara el tiempo de ejecucion por cada tipo de ordenamiento para arreglos cargados de forma aleatoria. ");
        ejercicio = Integer.parseInt(sc.nextLine());
        CapturaTiempo capturaTiempo = new CapturaTiempo(ejercicio);

    }
}
