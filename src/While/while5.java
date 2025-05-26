package While;

import java.util.Scanner;
//5- Faça um programa que peça ao usuário um número entre 12 e 20. Se a pessoa digitar
//   um número diferente, mostrar a mensagem "entrada inválida" e solicitar o número
//   novamente. Se digitar correto mostrar o número digitado.

public class while5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int num =0;
        
        while (num < 12 || num > 20) {
           System.out.println("Digite um número entre 12 e 20:");
            num = teclado.nextInt();
        } 
        
        System.out.println("O número digitadofoi : " + num);
    }

}
