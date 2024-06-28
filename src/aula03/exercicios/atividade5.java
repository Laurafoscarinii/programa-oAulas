package aula03.exercicios;

import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = ler.nextInt();
        if (numero>10 && numero<15)
            System.out.println("Seu numero está entre 10 e 15");
        else if (numero !=9 && numero != 16)
            System.out.println("Seu numero está fora");
    }
}
