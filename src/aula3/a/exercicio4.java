package aula3.a;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um numero de 1 a 7: ");
        int dia = ler.nextInt();
        switch(dia){
            case 1,7 -> System.out.println("É fim de semana");
            case 2,3,4,5,6->{
                System.out.println("É dia útil");
                System.out.println("...");
            }
            default -> System.out.println("Numero inválido");
        }
    }
}
