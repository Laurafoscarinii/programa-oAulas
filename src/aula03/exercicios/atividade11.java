package aula03.exercicios;

import java.util.Scanner;

public class atividade11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o nome de uma pessoa: ");
        String nome1 = ler.next();
        System.out.print("Digite a idade dessa pessoa: ");
        int idade1 = ler.nextInt();
        System.out.print("Digite o nome de outra pessoa: ");
        String nome2 = ler.next();
        System.out.print("Digite a idade dessa pessoa: ");
        int idade2 = ler.nextInt();
        if (idade1 > idade2)
            System.out.println("A pessoa mais velha é: "+nome1);
        else if (idade2 > idade1)
            System.out.println("A pessoa mais velha é: "+nome2);
    }
}
