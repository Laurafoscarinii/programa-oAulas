package exercicios.java;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite sua altura: ");
        Float altura = ler.nextFloat();
        System.out.print("Digite o seu peso: ");
        Float peso = ler.nextFloat();
        float IMC;
        IMC = (altura/peso)*2;
        System.out.println("O seu IMC é: " + IMC);
    }
}
