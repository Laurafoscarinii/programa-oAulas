package aula23.exemploExceção.exemploArquivo;

import java.io.*;

public class LerPessoa {
    public static void main(String[] args){
        File caminho = new File("C:\\Users\\laura\\OneDrive\\Documentos\\aula23");
        File arquivo = new File (caminho, "pessoas.db");
        try{
            ObjectInputStream objLeitura =
                    new ObjectInputStream(new FileInputStream(arquivo.getAbsolutePath()));
            Pessoa p1 = (Pessoa) objLeitura.readObject();
            System.out.println(p1);
            objLeitura.close();
        }
        catch (IOException erro){
            System.out.println("erro ao ler o arquivo");
        }
        catch (ClassNotFoundException erro){
            System.out.println("erro ao localizar a classe");
        }
    }
}
