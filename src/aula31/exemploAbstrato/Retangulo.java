package aula31.exemploAbstrato;

public class Retangulo extends Figura{
    @Override
    public double calculaArea() {
        return base*altura;
    }

    @Override
    public double calculaPerimetro() {
        return (2*base) + (2*altura);
    }

    public String getNomeRetangulo() {
        return nomeRetangulo;
    }

    public void setNomeRetangulo(String nomeRetangulo) {
        this.nomeRetangulo = nomeRetangulo;
    }

    private String nomeRetangulo;

    public Double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    private double base;




    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    private double altura;




    public void setNomeFigura(String nomeFigura) {
        super.setNomeFigura("Retangulo");
    }

}
