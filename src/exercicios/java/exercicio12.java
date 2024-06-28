package exercicios.java;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int numero1 = ler.nextInt();
        System.out.print("Digite outro numero inteiro: ");
        int numero2 = ler.nextInt();
        float primeiro = (float)Math.pow(numero1,numero2);
        float segundo = (numero1*numero2);
        float terceiro = (1/numero1);
        float quarto = (numero1/2) + numero2;
        float quinto = numero1-numero2;
        float seis = (numero1*(-1));
        System.out.println("O primeiro é: "+primeiro);
        System.out.println("O segundo é: "+segundo);
        System.out.println("O terceiro é: "+terceiro);
        System.out.println("O quarto é: "+quarto);
        System.out.println("O quinto é: "+quinto);
        System.out.println("O sexto é: "+seis);
    }
}
