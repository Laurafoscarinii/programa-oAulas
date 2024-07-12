package aula23.exemploExceção.exemploArquivo;

import java.io.*;

public class GravarPessoa {
    public static void main(String[] args){
        File caminho = new File("C:\\Users\\laura\\OneDrive\\Documentos\\aula23");

        if(!caminho.exists()){
            System.out.print("caminho não existe, tentando criar...");
            caminho.mkdirs();
            System.out.println("[ok]");
        }
        File arquivo = new File (caminho, "pessoas.db");
        try{
            ObjectOutputStream objEscrita = new ObjectOutputStream(new FileOutputStream(arquivo.getAbsolutePath()));
        Pessoa p1 = new Pessoa();
        p1.setNome("jonas");
        p1.setSobrenome("silva");
        objEscrita.writeObject(p1);
        objEscrita.close();
        }
        catch (FileNotFoundException erro){
            System.out.println("arquivo não pode ser criado");
        }
        catch (IOException erro){
            System.out.println("Erro ao ler o arquivo");
        }
    }
}
