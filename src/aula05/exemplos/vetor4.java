package aula05.exemplos;

import java.util.Random;

public class vetor4 {
    public static void main(String[] args){
        Random aleatorio = new Random();
        int numero = aleatorio.nextInt();
        System.out.println(numero);
        numero = aleatorio.nextInt(10);
        System.out.println(numero);
        numero = aleatorio.nextInt(10, 100);
        System.out.println(numero);
        boolean flag = aleatorio.nextBoolean();
        System.out.println(flag);
        int[] numeros = new int[10];
        //length = tamanho do vetor
        for (int i=0;i<numeros.length;i++){
            numeros[i] = aleatorio.nextInt(1,20);
            System.out.print(numeros[i]+" ");
        }
    }
}
