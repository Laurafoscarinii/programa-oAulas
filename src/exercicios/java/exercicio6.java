package exercicios.java;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Quanto voce ganha por hora: ");
        Float hora = ler.nextFloat();
        System.out.print("Quantas horas voce trabalha por mes: ");
        Float mes = ler.nextFloat();
        Float salario = hora*mes;
        System.out.println("O seu salpario do mes foi: "+salario);
    }
}
