// 1- faça um progama que leia um programainteiro e leia.
// 2- faça um programaque leia um número real e imprima.
package Operadores;

import java.util.Scanner;

public class operadores1e2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //exercício 1
        System.out.println("digite um número inteiro: ");
        int num1 = teclado.nextInt();

        //exercício 2
        System.out.println("digite um número real: ");
        double num2 = teclado.nextDouble();

        System.out.println("");
        System.out.println("o número inteiro escolhido foi:" + num1);
        System.out.println("o número real escolhido foi: " + num2);
        System.out.println("");

    }

}
