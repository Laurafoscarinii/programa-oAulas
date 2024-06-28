package aula05.exemplos;

public class vetor2 {
    public static void main(String[] args){
        int[] vetor = new int[20];
        int tamanho = vetor.length;
        System.out.println("o tamanho do vetor é "+tamanho);
        for (int i=0;i<vetor.length;i++){
            System.out.print(vetor[i]+" ");
        }
    }
}
