package For;

import java.util.Scanner;

// 7- Faça um programa, utilizando for, que permita o usuário fazer três contas de
//    subtração. O usuário deve conseguir reconhecer que são três contas diferentes. 
public class for7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int minuendo;
        int subtraendo;
        int subtração;
        
        System.out.println("TRÊS CONTAS DE SUBTRAÇÃO");
        System.out.println("");
        
        for (int i = 1; i <=3; i++) {
            System.out.println("Conta 0" + i);
            
            System.out.println("Digite o minuendo");
            minuendo= teclado.nextInt();
            
            System.out.println("Digite o subtraendo");
            subtraendo = teclado.nextInt();
            
            subtração = minuendo - subtraendo;
            
            System.out.println(minuendo + " - " + subtraendo + " = " + subtração);
        }
    }

}
