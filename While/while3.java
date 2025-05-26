

package While;

 //3- Crie um programa para ler 3 notas e mostrar a média delas.
import java.util.Scanner;

public class while3 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner (System.in);
        
        int cont =1;
        double nota;
        double soma= 0;
        double media;
        
        while (cont <= 3) {
            System.out.println("Digite uma nota: ");
            nota = teclado.nextDouble();
            soma += nota;
            cont ++;
        }
        media = soma / 3;
        System.out.printf("A média entre as notas fornecidas é: " + "%.2f", media);
    }

}
