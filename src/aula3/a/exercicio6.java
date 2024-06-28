package aula3.a;

import java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu perfil: ");
        String perfil = ler.next();

        if(perfil.equals("admin")){
            System.out.println("Usuario administrador");
        }
        else if(perfil.equals("usuario")){
            System.out.println("Usuario normal");
        }
        else{
            System.out.println("Usuario visitante");
        }
    }
}
