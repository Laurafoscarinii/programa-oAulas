package aula23.exemploExceção;

public class Exemplo2 {
    public int divide(int n1, int n2) throws ArithmeticException{
        if(n2==0)
            throw new ArithmeticException("não é possivel dividir por zero");
        return n1/n2;
    }
}
