package aula31.exemploAbstrato;

public class Circulo extends Figura{
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return Math.PI*raio*raio;
    }

    @Override
    public double calculaPerimetro() {
        return 2*Math.PI*raio;
    }

    public Circulo(){}
    @Override
    public void setNomeFigura(String nomeFigura) {
        super.setNomeFigura("Circulo");
    }


}
