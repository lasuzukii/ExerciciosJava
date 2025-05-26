package Operadores;

//8- Peça ao usuário que informe sua data de nascimento e imprima a idade.
import java.util.Scanner;

public class operadores8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int nascimento;
        int idade;

        System.out.println("Inforeme seu ano de nascimento");
        nascimento = teclado.nextInt();

        idade = 2023 - nascimento;

        System.out.println("idade :" + idade);

    }

}
