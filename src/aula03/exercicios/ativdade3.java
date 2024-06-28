package aula03.exercicios;

import java.util.Scanner;

public class ativdade3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite a senha de 8 caracteres: ");
        int senha = ler.nextInt();
        if (senha == 12345678)
            System.out.println("Senha válida");
        else if (senha != 12345678)
            System.out.println("Senha inválida");
    }
}
