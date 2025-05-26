package Condicional;
//5- Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um 
//   programa que calcule seu peso ideal utilizando as seguintes fórmulas:
//   a. Homens: Peso Ideal = (72,7 * altura) - 58
//   b. Mulheres: Peso Ideal = (62,1 * altura) – 44,7

import java.util.Scanner;

public class condicional5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String sexo;
        double altura;
        double pesoIdeal = 0;

        System.out.println("CÁLCULO DO PESO IDEAL");
        System.out.println("");

        System.out.println("Digite seu sexo biológico [masculino/feminino]");
        sexo = teclado.next();

        System.out.println("Digite sua altura: ");
        altura = teclado.nextDouble();

        if (sexo.equalsIgnoreCase("feminino")) {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else if (sexo.equalsIgnoreCase("masculino")) {
            pesoIdeal = (72.7 * altura) - 58;
        } else {
            System.out.println("sexo inválido");
        }

        System.out.println("O peso idal para uma pessoa com " + altura + "cm de altura é de " + pesoIdeal + "kg.");

    }

}
