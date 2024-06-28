package aula03.exercicios;

import java.util.Scanner;

public class atividade7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite f para converter uma temperatura para converter uma tempertura de °F " +
                "para °C");
        System.out.print("Digite c para converter uma temperatura de °C para °F: ");
        char opc = ler.next().toLowerCase().charAt(0);
        switch(opc){
            case'f'->{
                System.out.print("Informe uma temperatura em °C: ");
                float tempF = ler.nextFloat();
                float tempC = ler.nextFloat();
            }
        }
    }
}
