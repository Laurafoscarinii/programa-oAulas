package exercicioBanco;

import java.util.Random;

public class Conta {
    private String senha;
    private String titular;
    private String identificador;
    protected float saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }


    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public Conta(String titular, String senha){
        this.titular = titular;
        this.senha = senha;
    }

    private void gerarIdentificador(){
        String id = "";
        Random aleatorio = new Random();
        for(int i=0;i<4;i++){
            id+=(char)aleatorio.nextInt(65,90);
        }
        id+=aleatorio.nextInt(1000,2000);
        identificador = id;
    }



    public void setSenha(String senha){
        this.senha = senha;
    }

    public void depositar(float valor){
        saldo += valor;
    }

    public boolean validaAcesso(String senha, String identificador){
        return this.identificador.equals(identificador) && this.senha.equals(senha);
    }
}
