package aula03.exercicios;

import java.util.Scanner;

public class atividade6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int valor1 = ler.nextInt();
        System.out.print("Digite um valor diferente: ");
        int valor2 = ler.nextInt();
        if (valor1> valor2)
            System.out.println("O primeiro valor que digitou é maior");
        else if (valor2> valor1)
            System.out.println("O segundo valor que digitou é maior");
    }
}
