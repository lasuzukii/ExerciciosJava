package While;

// 2- Escrever um programa para exibir os números pares de 1 até 50 na tela.
public class while2 {

    public static void main(String[] args) {

        int cont = 1;

        while (cont <= 50) {
            if (cont % 2 == 0) {
                System.out.println(cont);

            }

            cont++;
        }
    }

}
