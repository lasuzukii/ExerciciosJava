package For;

//Leia várias idades e calcule a média entre as idades (usar uma variável para idade). 
import java.util.Scanner;

public class for5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int idade = 0;
        int acumulador = 0;
        int media;

        System.out.println("MEDIA ENTRE n IDADES");
        System.out.println("");

        for (int i = 0;; i++) {
            System.out.println("Insira uma idade. [Digite o número '0' para calcular a média] ");
            idade = teclado.nextInt();

            if (idade != 0) {
                acumulador += idade;
            } else {
                media = acumulador / i ;
                System.out.println("A média entre as " + i + " idades é igual a: " + media);
            }

        }
    }
}

