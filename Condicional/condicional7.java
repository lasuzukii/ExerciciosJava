package Condicional;
//7- Faça um programa de resultado de exames em que o usuário digitará Nome, 
//   idade, sexo e quantidade de hemoglobina em g/gL. O programa deverá, com base 
//   na tabela abaixo, informar se o resultado está normal ou se há alguma alteração.
//          Crianças de 2 a 6 anos - 11,5 a 13,5 g/dL
//          Crianças de 6 a 12 anos - 11,5 a 15,5 g/dL
//          Homens - 14 a 18 g/dL
//          Mulheres - 12 a 16 g/dL
//          Grávidas - 11 g/d

import java.util.Scanner;

public class condicional7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;
        int idade;
        String sexo;
        double hemoglobina;
        String resultado = "analisando";
        String gravida;

        System.out.print("Nome: ");
        nome = teclado.next();

        System.out.print("Idade: ");
        idade = teclado.nextInt();

        System.out.print("Sexo biológico [F/M]: ");
        sexo = teclado.next();

        System.out.print("Quantidade de hemoglobina em g/gL: ");
        hemoglobina = teclado.nextDouble();

        System.out.println("Está em uma gravidez? [sim / não]");
        gravida = teclado.next();

        if (gravida.equalsIgnoreCase("sim")) {
            if (hemoglobina == 11) {
                resultado = "normal.";
            } else {
                resultado = "alterado. [ideal = 11]";
            }
        } 
        else {

            if (idade >= 2 && idade <= 6) {

                if (hemoglobina >= 11.5 && hemoglobina <= 13.5) {
                    resultado = "normal";
                } else {
                    resultado = "alterado. [ideal : 11,5 a 13,5 g/dL]";
                }

            } else if (idade >= 6 && idade <= 12) {

                if (hemoglobina >= 11.5 && hemoglobina <= 15.5) {
                    resultado = "normal";
                } else {
                    resultado = "alterado. [ideal : 11,5 a 15,5 g/dL]";
                }

            } else if (idade > 12 && sexo.equalsIgnoreCase("m")) {
                if (hemoglobina >= 14 && hemoglobina <= 18) {
                    resultado = "normal";
                } else {
                    resultado = "alterado. [ideal : 14 a 18 g/dL]";
                }
            } else if (idade > 12 && sexo.equalsIgnoreCase("f")) {
                
                if (hemoglobina >= 12 && hemoglobina <= 16) {
                    resultado = "normal";
                } else {
                    resultado = "alterado. [ideal : 12 a 16 g/dL]";
                }
            } else {
                System.out.println("Informações inválidas");
            }
        }
        
        System.out.println(nome + ", o seu exame está " + resultado);
    }
}
