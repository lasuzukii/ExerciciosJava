package Operadores;

//5- peça para o usuário inserir a temperatura em °C e imprima a temperatura em°F.
//   F = C * (9/5) + 32
import java.util.Scanner;

public class operadores5 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int celcius;
        int farenheit;
        
        System.out.println("CALCULADORA °C PARA °F");
        System.out.println("");
        System.out.println("Digite a temperatura em °C:");
        celcius = teclado.nextInt();
        
        farenheit = celcius * (9/5) + 32;
        
        System.out.println("a temperatura de " + celcius + "°C é igual a " + farenheit + "°F");
    }
    
}
