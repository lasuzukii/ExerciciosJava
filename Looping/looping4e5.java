package Looping;

import java.util.Scanner;

//4- Supondo que a população de um país A seja da ordem de 80000 habitantes com uma 
//   taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes com 
//   uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número 
//   de anos necessários para que a população do país A ultrapasse ou iguale a população 
//   do país B, mantidas as taxas de crescimento
//5- Altere o programa anterior permitindo ao usuário informar as populações e as taxas 
//   de crescimento iniciais. Valide a entrada e permita repetir a operação.
public class looping4e5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int habitantesA;
        int habitantesB;
        double taxaA;
        double taxaB;
        int anos = 0;

        System.out.println("Quantidade de habitantes da cidade A:");
        habitantesA = teclado.nextInt();

        System.out.println("Taxa anual de crescimento da cidade A [em %]:");
        taxaA = teclado.nextDouble() / 100;

        System.out.println("Quantidade de habitantes da cidade B:");
        habitantesB = teclado.nextInt();

        System.out.println("Taxa anual de crescimento da cidade B [em %]:");
        taxaB = teclado.nextDouble() / 100;

        while (habitantesA < habitantesB) {
            habitantesA += habitantesA * taxaA;
            habitantesB += habitantesB * taxaB;

            anos++;

        }

        System.out.println("Em " + anos + " anos, a população da cidade A ultrapassará a população da cidade B.");
    }
}
