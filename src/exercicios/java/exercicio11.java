package exercicios.java;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o comprimento da base do triangulo: ");
        Float comprimento = ler.nextFloat();
        System.out.print("Digite a altura do triangulo: ");
        Float altura = ler.nextFloat();
        float area;
        area = (comprimento+altura)/2;
        System.out.println("A area do triangulo é: "+area);
    }
}
