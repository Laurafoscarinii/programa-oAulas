package aula05.exemplos;

import java.util.Scanner;

public class vetores {
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        int[] vetor = new int[10];
        for(int i=0;i<10;i++){
            System.out.print("vetor["+i+"]: ");
            vetor[i] = ler.nextInt();
        }
        for (int i=0;i<10;i++){
            System.out.print(vetor[i]+" ");
        }
    }
}
