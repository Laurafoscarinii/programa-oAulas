package aula31.exemploAbstrato;

public class Principal {
    public static void main(String[] args){
        Circulo c1 = new Circulo();
        c1.setRaio(5);
        System.out.println(c1);

        Retangulo r1 = new Retangulo();
        r1.setBase(3);
        r1.setAltura(3);
        System.out.println(r1);
    }
}
