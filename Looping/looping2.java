package Looping;

import java.util.Scanner;
//2- Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha 
//   igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as 
//   informações.

public class looping2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String usuario;
        String senha;
        
        System.out.println("CADASTRO");
        
        System.out.println("Usuário:");
        usuario = teclado.next();
        
        System.out.println("Senha:");
        senha = teclado.next();

        while (usuario.equals(senha)) {
            System.out.println("O usuário não pode ser igual à senha. Tente novamente:");
            System.out.println("Usuário:");
            usuario = teclado.next();
            System.out.println("Senha:");
            senha = teclado.next();
        }
        
        System.out.println("Cadastrado");

    }

}
