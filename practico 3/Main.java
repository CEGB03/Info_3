import pruebas.*;
import utils.Palindromo;

import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Main class");

        System.out.println("Stack Test.");
        StackTest stackTest = new StackTest();
        stackTest.testStackInteger();
        stackTest.testStackString();
/*

        System.out.println("Palindromo Test Ema.");
        PalindromoTestEma palindromoTestEma = new PalindromoTestEma();
        palindromoTestEma.testPalindromoInteger();
        palindromoTestEma.testPalindromoString();
*/

        System.out.println("Palindromo Test.");
        PalindromoTest palindromoTest=new PalindromoTest();
        System.out.println("Palindromo Test.2");
        palindromoTest.cadena1();
        palindromoTest.cadena2();
        palindromoTest.cadena3();
        palindromoTest.cadenaUsuario(sc.nextLine());
    }
}