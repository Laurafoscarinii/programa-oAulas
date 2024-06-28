package matrizesexmplos;

import java.util.Scanner;
import java.util.Random;
//* < ,

public class exercicio4 {
    public static void main(String[] args){
        Random aleatorio = new Random();
        int [][] matrizG = new int[3][3];
        int[] sl = new int [3];
        int[] sc = new int [3];
        for (int l= 0; l <3;l++) {
            for (int c= 0;c<3;l++) {
                matrizG[l][c] = aleatorio.nextInt(1,20);
                System.out.printf("%02d ",matrizG[l][c]);
            }
            System.out.println();
        }
        for (int l= 0; l <3;l++){
            for (int c= 0;c<3;l++){
                sl[l] = sl[l]+matrizG[l][c];
                sc[l] = sc[l]+matrizG[c][l];
            }
        }
        System.out.println("\nDados no vetor soma linha: ");
        for(int i : sl){
            System.out.print(i+" ");
        }
        System.out.println("\nDados no vetor soma soma: ");
        for(int i : sc){
            System.out.print(i+" ");
        }
    }
}
