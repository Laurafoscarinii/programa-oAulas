package aula31.exercicios.SistemaBiblioteca;

public class FuncionarioHorista extends Funcionario{
    @Override
    public double calculaSalario() {
        return salarioBase*horas;
    }

    @Override
    public double processarPagamento() {
        return 0;
    }




    private String nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }



    private double horas;
    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }




    private double salarioBase;
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
