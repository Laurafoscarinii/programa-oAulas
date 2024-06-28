package aula05.exemplos;

import java.util.Random;
import java.util.Scanner;

public class exercicio4_vetor {
    public static void main(String[] args){
        Random aleatorio = new Random();
        Scanner ler = new Scanner(System.in);
        int[] vetor = new int[10];
        int[] vetorM = new int[10];
        System.out.println("Dados no vetor...");
        for(int i=0;i<vetor.length;i++){
            vetor[i] = aleatorio.nextInt(1,10);
            System.out.print(vetor[i]+" ");
        }
        System.out.print("\nDigite um valor para multiplicar o vetor: ");
        int x = ler.nextInt();
        System.out.println("Vetor multiplicado");
        for(int i=0; i<vetorM.length; i++){
            vetorM[i] = vetor[i]*x;
            System.out.print(vetorM[i]+" ");
        }
    }
}
