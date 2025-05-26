package For;

//2- Crie um programa que calcula o fatorial de um número. Mas o incremento do for deve 
//   ser regressivo
import java.util.Scanner;

//   ser regressivo.
public class for2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;
        int fatorial = 1;

        System.out.println("Número para obter o valor fatorial :");
        num = teclado.nextInt();

        for (int i = num; i > 0; i--) {
            fatorial = fatorial * i;
            System.out.print(i + " . ");
        }

        System.out.println("= " + fatorial);
    }
}
