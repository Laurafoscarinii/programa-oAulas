package aula31.exercicios.SistemaBiblioteca;

public abstract class Funcionario{
    private String nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    private double salarioBase;
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }


    public abstract double calculaSalario();

    public abstract double processarPagamento();



}