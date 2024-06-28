package aula19;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        System.out.print("Qual o nome: ");
        p1.nome = ler.next();
        System.out.print("Qual o sobrenome "+p1.nome+": ");
        p1.sobrenome = ler.next();
        System.out.print("Qual a idade do "+p1.nome+": ");
        p1.idade = ler.nextInt();
        System.out.print("Qual a altura do "+p1.nome+": ");
        p1.altura = ler.nextInt();
        System.out.println(p1.obterDados());

        p1.andar();
        p1.parar();
    }
}
