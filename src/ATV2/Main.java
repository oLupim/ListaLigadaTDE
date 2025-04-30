package ATV2;

public class Main {
    public static void main(String[] args) {

        ListaLigada lista = new ListaLigada();

        lista.inserir(2);
        lista.inserir(3);
        lista.exibir();

        lista.inserir(4);
        lista.inserir(5);

        System.out.println("Exibir Lista:");
        lista.exibir();
    }
}
