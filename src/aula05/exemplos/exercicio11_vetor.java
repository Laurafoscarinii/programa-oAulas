package aula05.exemplos;

import java.util.Random;
import java.util.Scanner;

//* < ,

public class exercicio11_vetor {
    public static void main(String[] args){
        Random aleatorio = new Random();
        int[] vetor = new int[10];
        for(int i=0; i< vetor.length; i++){
            vetor[i] = aleatorio.nextInt(50);
            System.out.print(vetor[i]+" ");
        }
        System.out.print("\nQual numero deseja remover da lista: ");
        int remove = new Scanner(System.in).nextInt();
        //busca pelo numero no vetor
        int posicao = -1;
        for(int i=0; i< vetor.length; i++){
            if(vetor[i]==remove){
                posicao = i;
            }
        }

        //System.out.println("O elemento a ser removido está na posição "+pposica)
        //removendo o numero da lista

        for(int i=posicao; i< vetor.length-1; i++){
            vetor[i] = vetor[i+1];
        }
        System.out.println("\nDados no vetor");
        for(int i=0; i< vetor.length-1; i++){
            System.out.print(vetor[i]+" ");
        }
    }
}
