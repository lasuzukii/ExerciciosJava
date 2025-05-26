package Operadores;

//4- faça um programa em que o usuário digita uma letra e o programa retorna o 
//número inteiro do código UNICODE referente àquela letra.
import java.util.Scanner;

public class operadores4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("escolha uma letra [a/b]: ");
        String letra = teclado.next();

        if (letra.equals("a")) {
            System.out.println("seu código é 12345.");
        } else if (letra.equals("b")) {
            System.out.println("seu código é 54321.");
        } else {
            System.out.println("letra inválida.");
        }

    }

}
