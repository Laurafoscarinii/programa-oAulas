package exercicioBanco;

import java.util.Scanner;

public class Banco {

    public static String leString(String mensagem){
        Scanner ler = new Scanner(System.in);
        System.out.print(mensagem+": ");
        return ler.nextLine();
    }

    public static float leFloat(String mensagem){
        Scanner ler = new Scanner(System.in);
        System.out.print(mensagem+": ");
        return ler.nextFloat();
    }

    public static ContaCorrente acessaCC(ContaCorrente c1){
        return c1;
    }

    public static ContaPoupanca acessaCP(ContaPoupanca c1){
        return c1;
    }

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        ContaCorrente[] listaCC = new ContaCorrente[20];
        ContaPoupanca[] listaCP = new ContaPoupanca[20];
        int contCC = 0;
        int contCP = 0;
        String opc;
        do{
            System.out.println("Selecione uma opção");
            System.out.println("cc - cadastrar conta corrente");
            System.out.println("cp - cadastrar conta poupança");
            System.out.println("ac - para acessar uma conta corrente");
            System.out.println("ap - para acessar conta poupança");
            System.out.println("para sair: 'e' " ) ;
            opc = ler.next();
        }
        while(!opc.equals("e"));
    }
}
