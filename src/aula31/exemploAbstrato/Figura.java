package aula31.exemploAbstrato;

public abstract class Figura {
    public String getNomeFigura() {
        return nomeFigura;
    }

    public void setNomeFigura(String nomeFigura) {
        this.nomeFigura = nomeFigura;
    }

    private String nomeFigura;

    public abstract double calculaArea();
    public abstract double calculaPerimetro();

    @Override
    public String toString() {
        String retorno = "Nome: "+nomeFigura;
        retorno+="\nArea: "+calculaArea();
        retorno+="\nPerimetro: "+calculaPerimetro();
        return retorno;
    }
}
