package aula05.exemplos;

//Ler um vetor de números, de 10 elementos.
// Declarar outro vetor inverso, copiar todos os elementos de números de trás para frente para o vetor inverso.

import java.util.Random;

public class exercicio3_vetor {
    public static void man(String[] args){
        Random aleatorio = new Random();
        int[] vetor = new int [10];
        int[] vetorInv = new int [10];
        for (int i=0;i<vetor.length;i++){
            vetor[i] = aleatorio.nextInt(1,20);
            System.out.print(vetor[i]+" ");
        }
        System.out.println("\nVetor inverso...");
        for(int i=0,j=9;i<10;i++,j--){
            vetorInv[i] =vetor[j];
            System.out.print(vetorInv[i] + " ");
        }
    }
}
