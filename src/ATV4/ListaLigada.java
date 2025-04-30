package ATV4;

public class ListaLigada {
    private No inicio;

    public ListaLigada() {
        this.inicio = null;
    }

    public void inserir(int elemento) {
        No novoNo = new No(elemento);
        novoNo.proximo = this.inicio;
        this.inicio = novoNo;
        System.out.println("Elemento adicionado: "+ elemento);

    }


    public void buscar(int elemento) {
        if (inicio == null) {
            System.out.println("A lista está vazia.");
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

        System.out.println("Elemento encontrado: " + atual.elemento);
    }
}
