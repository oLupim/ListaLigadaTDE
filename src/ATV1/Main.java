package ATV1;

public class Main{
    public static void main(String[] args){

        ListaLigada lista = new ListaLigada();

        lista.inserir(12);
        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);

        System.out.println("Lista Ligada:");
        lista.exibir();

        lista.remover(20);
        System.out.println("Lista após remover 20:");
        lista.exibir();

    }
}