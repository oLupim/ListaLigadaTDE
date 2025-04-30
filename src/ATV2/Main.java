package ATV2;

public class Main {
    public static void main(String[] args) {

        ListaLigada lista = new ListaLigada();

        lista.inserirFim(2);
        lista.inserirFim(3);
        lista.exibir();

        lista.inserirFim(4);
        lista.inserirFim(5);

        System.out.println("Exibir Lista:");
        lista.exibir();
    }
}
