package Looping;

import java.util.Scanner;
//3- Faça um programa que leia e valide as seguintes informações:
//       a. Nome: maior que 3 caracteres;
//       b. Idade: entre 0 e 150;
//       c. Salário: maior que zero;
//       d. Sexo: 'f' ou 'm';
//       e. Estado Civil: 's', 'c', 'v', 'd';

public class looping3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        System.out.println("nome:");
        nome = teclado.next();

        while (nome.length() < 3) {
            System.out.println("Digite um nome com mais de 3 caracteres:");
            nome = teclado.next();
        }

        System.out.println("idade:");
        idade = teclado.nextInt();

        while (idade <= 0 || idade > 150) {
            System.out.println("Insira uma idade válida:");
            idade = teclado.nextInt();
        }

        System.out.println("Salário:");
        salario = teclado.nextDouble();

        while (salario <= 0) {
            System.out.println("insira um valor válido em R$:");
            salario = teclado.nextDouble();
        }

        System.out.println("Sexo [m / f]:");
        sexo = teclado.next();

        while (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")) {
            System.out.println("Insira um caractere válido [m / f] :");
            sexo = teclado.next();
        }

        System.out.println("Estado civil [s / c / v / d]");
        estadoCivil = teclado.next();

        while (!estadoCivil.equalsIgnoreCase("s") && !estadoCivil.equalsIgnoreCase("c") 
                && !estadoCivil.equalsIgnoreCase("v") && !estadoCivil.equalsIgnoreCase("d")) {
            System.out.println("Insira um caractere válido [s / c / v / d]");
            estadoCivil = teclado.next();
        }

        System.out.println("Cadastro concluído.");
        System.out.println("Nome: " + nome);        
        System.out.println("Idade: " + idade); 
        System.out.println("Salário: " + salario);      
        System.out.println("Sexo: " + sexo);       
        System.out.println("Estado civil: " + estadoCivil);  
        
    }
}
