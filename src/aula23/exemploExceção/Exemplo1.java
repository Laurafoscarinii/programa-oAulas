package aula23.exemploExceção;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo1 {
    public static int leNumero(String mensagem){
        Scanner ler = new Scanner (System.in);
        int num = 0;
        boolean correto;
        do{
            try{
                System.out.print(mensagem);
                num = ler.nextInt();
                correto = true;
            }
            catch (InputMismatchException erro){
                correto = false;
                System.out.println("valor inválido");
                ler.next();
            }
        }
        while(!correto);
        return num;
    }

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int n1 = leNumero("digite um valor para n1: ");
        int n2 = leNumero ("digte um numero para n2: ");
        try {
            int resposta = n1/n2;
            System.out.println(resposta);
        }
        catch (InputMismatchException erro){
            System.out.println("os valores precisam ser numeros");
        }
        catch (ArithmeticException erro){
            System.out.println("não é possivel dividir por zero");
        }
    }
}
