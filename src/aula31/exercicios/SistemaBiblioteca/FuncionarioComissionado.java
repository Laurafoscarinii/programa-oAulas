package aula31.exercicios.SistemaBiblioteca;

public class FuncionarioComissionado extends Funcionario {
    @Override
    public double calculaSalario() {
        return salarioBase;
    }

    @Override
    public double processarPagamento() {
        return 0;
    }



    private double horas;
    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }



    private String nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }



    private double valorHora;
    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }




    private double salarioBase;
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
