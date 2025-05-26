package Operadores;

//3- peça para o usuário digitar três valores e imprima a soma deles.
import java.util.Scanner;

public class operadores3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("SOMA DE 3 NÚMEROS INTEIROS");
        System.out.println("");

        System.out.println("digite o primeiro número");
        int num1 = teclado.nextInt();

        System.out.println("digite o segundo número");
        int num2 = teclado.nextInt();

        System.out.println("digite o terceiro número");
        int num3 = teclado.nextInt();

        int soma = num1 + num2 + num3;

        System.out.println("");
        System.out.println("a soma entre os números fornecidosresulta em: " + soma);

    }

}
