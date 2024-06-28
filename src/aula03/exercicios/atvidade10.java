package aula03.exercicios;

import java.util.Scanner;

public class atvidade10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite  a primeira nota: ");
        int nota1 = ler.nextInt();
        System.out.print("Digite a segunda nota: ");
        int nota2 = ler.nextInt();
        System.out.print("Digite a terceira nota: ");
        int nota3 = ler.nextInt();
        int somaNota = (nota1+nota2+nota3)/3;
        if (somaNota  >= 7.0)
            System.out.println("Esse aluno foi aprovado");
        else if (somaNota >= 5.0 && somaNota< 7.0)
            System.out.println("Esse aluno está de recuperação");
        else if (somaNota < 5.0 )
            System.out.println("Esse aluno está reprovado");
    }
}
