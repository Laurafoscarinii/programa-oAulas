package aula03.exercicios;

import java.util.Scanner;

public class atividade8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero1 = ler.nextInt();
        System.out.print("Digite um novo numero: ");
        int numero2 = ler.nextInt();
        System.out.print("Digite um simbolo de operação: ");
        String simbolo = ler.next();
        if (simbolo.equals("+")) {
            int soma = numero1 + numero2;
            System.out.print("Seu resultado foi ");
        }
    }
}
