package aula21;

public class engenheiro extends funcionario{

    private String crea;

    public engenheiro(String nome,String sobrenome,int matricula, String crea){
        super(nome,sobrenome,matricula);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }


}
