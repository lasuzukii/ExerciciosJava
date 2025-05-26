package While;

//4- Escreva um programa com um looping indeterminado em que enquanto o usuário não
//   pedir para o programa sair, ele continua printando um contador na tela.
import java.util.Scanner;

public class while4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int comando = 1;
        int cont = 1;

        System.out.println("digite 0 quando quiser sair");

        while (comando != 0) {
            System.out.println(cont);
            cont++;
            System.out.println("digite qualquer número");
            comando = teclado.nextInt();
        }
        
        System.out.println("finalizado");
    }

}
