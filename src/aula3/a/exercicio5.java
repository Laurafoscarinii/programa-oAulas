package aula3.a;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu perfil: ");
        String perfil = ler.next();
        switch (perfil){
            case "admin" -> System.out.println("Usuario administrador");
            case "usuario" -> System.out.println("Usuário padrão");
            default -> System.out.println("Usuario visitante");
        }
    }
}
