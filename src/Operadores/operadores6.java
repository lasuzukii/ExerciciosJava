package Operadores;

//6- faça a conversão de km/h para m/s.
//   v * (m / s) = v * (km / h) / 36
import java.util.Scanner;

public class operadores6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double km;
        double ms;

        System.out.println("conversão de km/h para m/s");
        System.out.println("");
        System.out.println("digite a velocidade em km/h : ");
        km = teclado.nextInt();

        ms = km / 3.6;

        System.out.println(km + "km/h eaquivalem a " + ms + "m/s");

    }

}
