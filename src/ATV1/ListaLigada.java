package ATV1;

public class ListaLigada {
    private No inicio;

    public ListaLigada() {
        this.inicio = null;
    }


    //funções e metodos
    public void inserir(int elemento) {
        No novoNo = new No(elemento);
        novoNo.proximo = this.inicio;
        this.inicio = novoNo;
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
