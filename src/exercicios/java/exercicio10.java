package exercicios.java;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o comprimento da base do quadrado: ");
        Float comprimento = ler.nextFloat();
        System.out.print("Digite a altura do quadrado: ");
        Float altura = ler.nextFloat();
        float area;
        area = comprimento*altura;
        float perimetro;
        perimetro = altura*4;
        System.out.println("A area do quadrado é: "+area);
        System.out.println("O perimetro do quadrado é: "+perimetro);
    }
}
