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

    public boolean buscar(int elemento) {
        No atual = inicio;

        while (atual != null) {
            if (atual.elemento == elemento) {
                return true;
            }
            atual = atual.proximo;
        }

        return false;
    }

}
