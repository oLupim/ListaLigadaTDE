package ATV4;

public class Main {
    public static void main(String[] args) {

        ListaLigada lista = new ListaLigada();

        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);

        System.out.println(lista.buscar(20));
        System.out.println(lista.buscar(40));
    }
}
