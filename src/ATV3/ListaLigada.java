package ATV3;

public class ListaLigada {
    private No inicio;

    public ListaLigada() {
        this.inicio = null;
    }

    public void inserir(int elemento) {
        No novoNo = new No(elemento);
        novoNo.proximo = this.inicio;
        this.inicio = novoNo;
    }

    public void remover(int elemento) {
        if (inicio == null) {
            System.out.println("A lista está vazia.");
            return;
        }

        if (inicio.elemento == elemento) {
            inicio = inicio.proximo;
            return;
        }

        No atual = inicio;
        No anterior = null;

        while (atual != null && atual.elemento != elemento) {
            anterior = atual;
            atual = atual.proximo;
        }

        if (atual == null) {
            System.out.println("Elemento não encontrado.");
            return;
        }

        anterior.proximo = atual.proximo;
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
