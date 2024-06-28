package exercicios.java;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um número: ");
        Float numero1 = ler.nextFloat();
        System.out.print("Digite outro numero: ");
        Float numero2 = ler.nextFloat();
        float numero3;
        numero3 = numero1 + numero2;
        float numero4;
        numero4 = numero1*numero2;
        System.out.println("A some desse numero é "+numero3);
        System.out.println("A multiplicação desse nuero é "+numero4);
    }
}
