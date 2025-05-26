package For;

//4- Ler um valor inteiro entre 1 e 10 e escrever a tabuada de 1 a 
//   10 do valor lido.
import java.util.Scanner;

public class for4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;
        int tabuada;

        System.out.println("Digite um número para obter a tabuada:");
        num = teclado.nextInt();

        for (int i = 1; i <= 10; i++) {
            tabuada = num * i;
            System.out.println(num + " . " + i + " = " + tabuada);
        }
    }
}
