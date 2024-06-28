package aula05.exemplos;

import java.util.Random;
import java.util.Scanner;

//* < ,

public class exercicio7_vetor {
    public static void main(String[] args){
        Random aleatorio = new Random();
        int[] vr = new int[5];
        int[] vs = new int[10];
        int[] vx = new int[15];
        System.out.println("Dados no vetor r");
        for (int i=0; i<vr.length; i++){
            vr[i] = aleatorio.nextInt(20);
            System.out.print(vr[i]+" ");
        }
        System.out.println("\nDados no vetor s");
        for (int i=0; i<vs.length; i++){
            vs[i] = aleatorio.nextInt(20);
            System.out.print(vs[i]+" ");
        }
        System.out.println("\nDados no vetor x");
        for (int i=0; i< vx.length; i++){
            if(i<5){
                vx[i] = vr[i];
            }
            else{
                vx[i] = vs[i-5];
            }
            System.out.print(vx[i]+" ");
        }
    }
}
