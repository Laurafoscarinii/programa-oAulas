package aula31.exemploInterface;

public class Principal {
    public static void main(String[] args) {
        Vetor v1 = new Vetor(10);

        v1.adiciona("A");
        v1.adiciona("B");
        v1.adiciona("C");
        v1.adiciona("D");
        v1.adiciona("E");

        System.out.println("qual o tamanho da lista "+v1.getTamanho());
        System.out.println(v1);
        System.out.println("Removendo o elemento "+v1.remove());
        System.out.println(v1);

        Lista l1 = new Vetor(5);
        l1.adiciona("teste");
        l1.remove();
    }
}
