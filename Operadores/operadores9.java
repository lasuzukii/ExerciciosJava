package Operadores;



//9- faça um programa que calcula a área de uma circunferência com precisão de 
import java.util.Scanner;

//   2 casas decimais.  A = pi * r ^2
public class operadores9 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int raio;
        double area;

        System.out.println("CÀLCULO DA ÁREA DA CIRCUNFERÊNCIA");
        System.out.println("");
        System.out.println("digite o raio da circunferência em cm: ");
        raio = teclado.nextInt();

        area = 3.141592653589793 * Math.pow(raio, 2);

        System.out.print("a área da circunferência é de : ");
        System.out.printf("%.2f", area);
        System.out.print(" centímetros quadrados");
    }

}
