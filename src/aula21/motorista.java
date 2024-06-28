package aula21;

public class motorista extends funcionario{
    private String cnh;

    public motorista (String nome, String sobrenome, int matricula){
        super(nome, sobrenome, matricula);

    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
}
