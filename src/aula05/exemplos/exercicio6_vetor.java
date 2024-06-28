package aula05.exemplos;

import java.util.Random;
import java.util.Scanner;

public class exercicio6_vetor {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        String[] nomes = {"laura"};
        System.out.print("Qual nome devo pesquisar na lista?");
        String nome = ler.next();
        boolean achei = false;
        for(int i=0; i<nomes.length;i++){
            if(nomes[i].equalsIgnoreCase(nome)){
                achei = true;
            }
        }
        if(achei){
            System.out.println(nome+" está na lista");
        }
        else{
            System.out.println(nome+" não está na lista");
        }
    }

}
