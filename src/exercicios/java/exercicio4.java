package exercicios.java;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite uma medida em metros: ");
        Float metros = ler.nextFloat();
        Float cm = (metros*100);
        System.out.println("A medida que voce digitou em cm é: "+cm);
    }
}
