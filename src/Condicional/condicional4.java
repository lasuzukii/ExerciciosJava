package Condicional;

// 4- faça um programa que leia um número inteiro e retorne ao usuário se ele
//    é par ou impar e positivo ou negativo.
import java.util.Scanner;

public class condicional4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;

        System.out.println("digite um número inteiro");
        num = teclado.nextInt();

        if (num % 2 == 0) {
            System.out.print("o número escolhido é par");
        } else {
            System.out.print("o número escolhido é ímpar");
        }

        if (num >= 0) {
            System.out.print(" e positivo");
        } else {
            System.out.print(" e negativo");
        }

    }
}
