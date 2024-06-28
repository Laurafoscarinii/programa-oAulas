package exercicios.java;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        Float temperatura = ler.nextFloat();
        float celcius;
        celcius =  (5 * (temperatura-32) / 9);
        System.out.println("A temperatura digitada em celcius é: " +celcius);
    }
}
