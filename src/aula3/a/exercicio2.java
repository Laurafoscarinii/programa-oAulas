package aula3.a;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int idade = ler.nextInt();
        if(idade<0)
            System.out.println("Idade inválida");
        else if(idade<10)
            System.out.println("Infantil");
        else if(idade<23)
            System.out.println("Juvenil");
        else if(idade<65)
            System.out.println("Adulto");
        else
            System.out.println("Terceira idade");
    }
}
