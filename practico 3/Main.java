import pruebas.*;
import utils.Palindromo;

import java.security.spec.RSAOtherPrimeInfo;
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
        palindromoTest.cadena1();
        palindromoTest.cadena2();
        palindromoTest.cadena3();
        System.out.println("Ingrese una palabra o frase para corroborar si es palindromo:");
        palindromoTest.cadenaUsuario(sc.nextLine());

        System.out.println("Expresiones Matemáticas Test");
        ExpresionesMatemáticasTest expresionesMatemáticasTest=new ExpresionesMatemáticasTest();
        expresionesMatemáticasTest.Pruebas();
        System.out.println("Ingrese una expresion matematica con parentesis para corroborar si esta equilibrada:");
        expresionesMatemáticasTest.expresionUsuario(sc.nextLine());


    }
}