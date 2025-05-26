package Looping;

import java.util.Scanner;
//1- Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso 
//   o valor seja inválido e continue pedindo até que o usuário informe um valor válido.

public class looping1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double nota;

        System.out.println("Digite uma nota de 0 a 10");
        nota = teclado.nextDouble();

        while (nota < 0 || nota > 10) {
            System.out.println("Valor inválido. tente novamente");
            nota = teclado.nextDouble();
        }

        System.out.println("Confirmado");

    }

}
