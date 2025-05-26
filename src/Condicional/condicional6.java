package Condicional;
// 6- João é pescador e usa um microcomputador para controlar o seu rendimento diário. 
//    Toda vez que ele traz um peso de peixe maior do que o estabelecido no regimento 
//    de pesca do Estado de SP (50 quilos), ele deve pagar uma multa de R$ 4,00 por 
//    quilo excedente. Faça um programa que, quando João informar o peso de peixes 
//    que trouxe no dia, o programa retorna o valor da multa.

import java.util.Scanner;

public class condicional6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double peso;
        double multa;

        System.out.println("Digite a quantidade de kg de peixe: ");
        peso = teclado.nextDouble();

        if (peso > 50) {
            multa = 4 * (peso - 50);
            System.out.println("O valor da multa será de: " + multa + " reais");
        } else {
            System.out.println("Você não foi multado.");
        }
    }

}
