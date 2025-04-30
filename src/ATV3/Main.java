package ATV3;

public class Main {
    public static void main(String[] args) {

        ListaLigada lista = new ListaLigada();

        lista.inserir(2);
        lista.inserir(4);
        lista.inserir(6);
        lista.exibir();



        lista.remover(4);
        System.out.println("Lista depois de remover:");
        lista.exibir();


    }
}
