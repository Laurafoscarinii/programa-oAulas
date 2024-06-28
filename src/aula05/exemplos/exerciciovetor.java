package aula05.exemplos;


import java.util.Scanner;

//Ler dois vetores, A e B com um número variável de conteúdo
// (números) (no máximo 10). O programa deve solicitar antes da leitura dos
// vetores a quantidade de dados a serem lidos (1 a 10), os dois vetores terão
// o mesmo número de elementos. Gerar um terceiro vetor chamado Soma
// (de no máximo 10 elementos) que seja a soma dos dados do vetor A com os do vetor B.

public class exerciciovetor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tamanho;
        do{
            System.out.print("Digite um valor entre 1 e 10: ");
            tamanho = ler.nextInt();
        }
        while (tamanho<1 || tamanho>10);
        int [] vetorA = new int[tamanho];
        int [] vetorB = new int[tamanho];
        int [] soma = new int [tamanho];
        System.out.println("Lendo dados do vetor A");
        for(int i=0;i<tamanho;i++){
            System.out.print("vetor["+i+"]: ");
            vetorA[i] = ler.nextInt();
        }
        System.out.println("Lendo dados do vetor B");
        for(int i=0;i<tamanho;i++){
            System.out.print("vetor["+i+"]: ");
            vetorB[i] = ler.nextInt();
        }
        System.out.println("\nsomando e mostrando o vetor...");
        for(int i=0;i<tamanho;i++){
            soma[i] = vetorA[i] + vetorB[i];
            System.out.println(vetorA[i]+" + "+ vetorB[i]+" = "+soma[i]);
        }
    }
}
