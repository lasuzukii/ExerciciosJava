package While;

import java.util.Scanner;
//7- O usuário vai digitar notas válidas (de 0 até 10). O programa deverá armazenar
//   estas notas em um acumulador. Usar uma segunda variável para contar quantas notas
//   foram armazenadas. Ao final, quando o usuário não quiser mais lançar notas, ele pede
//   para sair e o programa imprime na tela a média das notas. 

public class while7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double nota = 0;
        double soma = 0;
        double media = 0;
        int contador = 0;
        boolean ligado = true;
        String ok = "ok";

        System.out.println("MÉDIA ENTRE 'n' NOTAS");

        while (ligado) {

            System.out.println("Digite uma nota [Escreva '100' para sair] : ");
            nota = teclado.nextDouble();

            if (nota >= 0 && nota <= 10) {
                soma += nota;
                contador++;
                ligado = true;
            } else if (nota == 100) {
                ligado = false;
            } else {
                System.out.println("Entrada inválida");
            }
        }

        media = soma / contador;
        System.out.println(" A média entre as " + contador + " notas fornecidas é: " + media);
    }

}
