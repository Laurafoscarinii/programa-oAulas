package aula05.exemplos;

import java.util.Random;
import java.util.Scanner;

public class exercicio5_vetor {
    public static void main(String[] args){
        Random aleatorio = new Random();
        int[] vetor = new int[20];
        int[] par = new int [20];
        int[] impar = new int [20];
        int ip = 0;
        int ii = 0;
        for(int i=0;i<vetor.length;i++) {
            vetor[i] = aleatorio.nextInt(1, 50);
            if (vetor[i] % 2 == 0) {
                par[ip] = vetor[i];
                ip++;
            }
            else {
                impar[ii] = vetor[i];
                ii++;
            }
        }
        System.out.println("\nNumeros pares");
        for(int i=0; i<ip; i++){
            System.out.print(impar[i]+" ");
        }
        System.out.println("\nNumeros impares");
        for(int i=0; i<ip; i++){
            System.out.print(impar[i]+" ");
        }
    }
}
