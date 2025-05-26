package For;

import java.util.Scanner;

// 6- Ler 10 números e imprimir quantos são pares e quantos são ímpares. 
public class for6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;
        int pares = 0;
        int impares = 0;

        System.out.println("CONTAGEM DE PARES E ÍMPARES");
        System.out.println("");

        for (int i = 1; i <= 10; i++) {
            System.out.println("digite um número");
            num = teclado.nextInt();
            

            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Dos números digitados, " + pares + " são pares e "
                + impares + " são ímpares.");
    }
}
