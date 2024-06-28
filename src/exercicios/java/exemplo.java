package exercicios.java;

import java.util.Scanner;
public class exemplo {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Entre com um número: ");
        int numero = ler.nextInt();
        System.out.println("O número digitado foi: "+numero);
        System.out.print("Digite um número real: ");
        float numeroReal = ler.nextFloat();
        System.out.println("O número com vírgula é: "+numeroReal);
    }
}
