package Operadores;
// 7- peça ao usuário que forneça um número e imprima seu antecessor.

import java.util.Scanner;

public class operadores7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;
        int ant;

        System.out.println("Forneça um número para saber seu antecessor :");
        num = teclado.nextInt();

        ant = num - 1;

        System.out.println("o antecessor de " + num + " é: " + ant);
    }

}
