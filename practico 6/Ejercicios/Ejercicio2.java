package Ejercicios;

import utils.ArbolBinario;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio2 {
    private ArbolBinario<Integer> integerArbolBinario;
    private Integer[] arrayStandar={3, 15, 22, 19, 6, 12, 1, 24, 5, 8 };
    public Ejercicio2() throws Exception {
        cargaArbol();
        System.out.println("\nImpresion de recursivo 2");
        integerArbolBinario.imprimirArbolRecursivo2(integerArbolBinario.getRoot(),0);
        System.out.println("Impresion de recursivo 1:");
        integerArbolBinario.imprimirArbolRecursivo1(integerArbolBinario.getRoot(),"",false);
    }
    private void cargaArbol() throws Exception {
        Random random = new Random();
        int numeroAleatorio;
        // Generar 10 números aleatorios entre 0 y 25
        for (int i = 0; i < 10; i++) {
            numeroAleatorio = random.nextInt(26); // Genera un número entre 0 (inclusive) y 26 (exclusive)
            //numeroAleatorio = arrayStandar[i];
            System.out.println("\nnumeroAleatorio = "+numeroAleatorio);
            if(i==0)
                integerArbolBinario = new ArbolBinario<>(numeroAleatorio);
            else
                integerArbolBinario.addNoRep(numeroAleatorio);

            System.out.println("InOrder N°"+(i+1));
            integerArbolBinario.imprimirInOrder();
        }
    }
    public ArbolBinario<Integer> getIntegerArbolBinario() {
        return integerArbolBinario;
    }
}