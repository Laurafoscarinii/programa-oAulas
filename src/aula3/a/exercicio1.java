package aula3.a;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite uma nota: ");
        int n1 =ler.nextInt();
        if (n1>=0 && n1<=10){
            System.out.println("Nota válida");
        }
        else{
            System.out.println("Nota inválda");
        }
    }
}
