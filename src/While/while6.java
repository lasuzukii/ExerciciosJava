package While;

import java.util.Random;
import java.util.Scanner;
//6- Use o laço while para pedir ao usuário que tente acertar um número aleatório
//   entre 0 e 10 (incluindo) e mostrar a quantidade de tentativas feitas. Dica: Usar o
//   comando Random numero = new Random();

public class while6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random gerador = new Random();

        int numero = gerador.nextInt(11);
        int tentativa = 11;
        int contador = 0;
        
        System.out.println("ADIVINHE O NÚMERO SECRETO");

        while (tentativa != numero) {
            System.out.println("Digite um número: ");
            tentativa = teclado.nextInt();
            contador++;
        }
        
        System.out.println("Acertou! Tentativas: " + contador);

    }

}
