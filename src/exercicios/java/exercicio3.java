package exercicios.java;

import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite sua primeira nota bimestral: ");
        Float primeiraNota = ler.nextFloat();
        System.out.print("Digite sua segunda nota bimestral: ");
        Float segundaNota = ler.nextFloat();
        System.out.print("Digite sua terceira nota bimestral: ");
        Float terceiraNota = ler.nextFloat();
        System.out.print("Digite sua quarta nota bimestral: ");
        Float quartaNota = ler.nextFloat();
        Float media = (primeiraNota + segundaNota + terceiraNota + quartaNota)/4;
        System.out.println("A media desse bimestre foi: "+media);
    }
}
