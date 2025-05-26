package Condicional;

//8- Faça um programa para um banco de sangue em que o usuário informará qual o 
//   tipo sanguíneo de um paciente e o programa retornará que tipo de sangue este 
//   paciente pode receber.
//      Sangue tipo:       Pode doar para:        Pode receber doação de:
//      A+                 AB+ e A+               A+, A-, O+ e O-
//      A-                 A+, A-, AB+ e AB-      A- e O- 
//      B+                 B+ e AB+               B+, B-, O+ e O-
//      B-                 B+, B-, AB+ e AB-      B- e O-
//      AB+                AB+                    todos
//      AB-                AB+ e AB-              A-, B-, O- e AB-
//      O+                 A+, B+, O+ e AB+       O+ e O-
//      O-                 todos                  O-
import java.awt.BorderLayout;
import java.util.Scanner;

public class condicional8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String tipo;
        String acao;
        String resultado = "calculando";

        System.out.println("TRANSFUSÃO DE SANGUE");
        System.out.println("Digite 1 para doar e 2 para receber.");
        acao = teclado.next();

        System.out.println("Qual seu tipo sanguíneo?");
        tipo = teclado.next();

        if (acao.equals("1")) {
            if (tipo.equalsIgnoreCase("A+")) {
                resultado = "Você pode doar para : AB+ e A+";
            } else if (tipo.equalsIgnoreCase("A-")) {
                resultado = "Você pode doar para : A+ A-, AB+ e AB-";
            } else if (tipo.equalsIgnoreCase("B+")) {
                resultado = "Você pode doar para : B+ e AB+";
            } else if (tipo.equalsIgnoreCase("B-")) {
                resultado = "Você pode doar para : B+, B-, AB+ e AB-";
            } else if (tipo.equalsIgnoreCase("AB+")) {
                resultado = "Você pode doar para : AB+";
            } else if (tipo.equalsIgnoreCase("AB-")) {
                resultado = "Você pode doar para : AB+ e AB-";
            } else if (tipo.equalsIgnoreCase("O+")) {
                resultado = "Você pode doar para : A+, B+, O+ e AB+";
            } else if (tipo.equalsIgnoreCase("O-")) {
                resultado = "Você pode doar para : todos";
            }
        } else if (acao.equals("2")) {
            if (tipo.equalsIgnoreCase("A+")) {
                resultado = "Você pode receber de : A+, A-, O+ e O-";
            } else if (tipo.equalsIgnoreCase("A-")) {
                resultado = "Você pode receber de : A- e O-";
            } else if (tipo.equalsIgnoreCase("B+")) {
                resultado = "Você pode receber de : B+ e AB+";
            } else if (tipo.equalsIgnoreCase("B-")) {
                resultado = "Você pode receber de : B+, B-, O+ e O-";
            } else if (tipo.equalsIgnoreCase("AB+")) {
                resultado = "Você pode receber de : todos";
            } else if (tipo.equalsIgnoreCase("AB-")) {
                resultado = "Você pode receber de : A-, B-, O- e AB-";
            } else if (tipo.equalsIgnoreCase("O+")) {
                resultado = "Você pode receber de : O+ e O-";
            } else if (tipo.equalsIgnoreCase("O-")) {
                resultado = "Você pode receber de : O-";
            }
        } else {
            resultado = "informações inválidas.";
        }
        System.out.println(resultado);
    }
}
