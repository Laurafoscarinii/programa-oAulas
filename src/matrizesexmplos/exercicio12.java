package matrizesexmplos;

import java.util.Random;

public class exercicio12 {
    public static void main(String[] args){
        Random gerador = new Random();
        int[][] cartela = new int[5][5];
        int [] vetor = new int[25];
        int cont=0;
        for (int l = 0; l < cartela.length; l++) {
            for (int c = 0; c < cartela[l].length;) {
                int num = gerador.nextInt(1,100);
                boolean novoNumero = true;
                for (int i = 0; i < cont; i++) {
                    if(vetor[i]==num){
                        novoNumero = false;
                    }
                }
                if(novoNumero){
                    vetor[cont]=num;
                    cont++;
                    cartela[l][c] = num;
                    c++;
                }
            }
        }
        System.out.println("\nCartela gerada\n");
        for (int l = 0; l < cartela.length; l++) {
            for (int c = 0; c < cartela[l].length; c++) {
                System.out.printf("%02d ",cartela[l][c]);
            }
            System.out.println();
        }
    }
}
