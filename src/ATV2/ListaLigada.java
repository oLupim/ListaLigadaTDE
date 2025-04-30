package ATV2;

public class ListaLigada {

    private No inicio;

    public ListaLigada() {
        this.inicio = null;
    }


    public void inserirFim(int elemento) {
        No novoNo = new No(elemento);
        if (this.inicio == null) {
            this.inicio = novoNo;
        } else {
            No noAtual = inicio;
            while (noAtual.proximo != null) {
                noAtual = noAtual.proximo;
            }
            noAtual.proximo = novoNo;
        }
    }

    public void exibir() {
        if (inicio == null) {
            System.out.println("A lista está vazia.");
            return;
        }

        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.elemento + " ");
            atual = atual.proximo;

        }
        System.out.println();
    }
}
