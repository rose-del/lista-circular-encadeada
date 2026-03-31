public class ListaCircularEncadeada {
    Nodo primeiro;
    int tamanho;

    public ListaCircularEncadeada() {
        primeiro = null;
        tamanho = 0;
    }

    public int size() {
        return tamanho;
    }

    public void addElemento(int elemento) {
        Nodo novo = new Nodo(elemento);

        if (primeiro == null) {
            primeiro = novo;
            novo.proximo = primeiro;
        } else {
            Nodo atual = primeiro;
            while (atual.proximo != primeiro) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
            novo.proximo = primeiro;
        }
        tamanho++;
    }

    public Nodo get(int index) {

        if (index < 0 || index >= tamanho) {
            return null;
        }

        Nodo atual = primeiro;

        for (int i = 0; i < index; i++) {
            atual = atual.proximo;
        }

        return atual;
    }

    public void add(int index, int elemento) {

        if (index < 0 || index > tamanho) {
            return;
        }

        Nodo novo = new Nodo(elemento);

        if (index == 0) {
            novo.proximo = primeiro;
            Nodo ultimo = get(tamanho-1);
            primeiro = novo;
            ultimo.proximo = primeiro;
        } else {
            Nodo anterior = get(index - 1);

            novo.proximo = anterior.proximo;
            anterior.proximo = novo;
        }
        tamanho++;
    }

    public void remove(int index) {
        if (index < 0 || index >= tamanho) {
            return;
        }

        if (index == 0) {
            Nodo ultimo = get(tamanho - 1);
            primeiro = primeiro.proximo;
            ultimo.proximo = primeiro;
        } else {
            Nodo anterior = get(index - 1);
            anterior.proximo = anterior.proximo.proximo;
        }
        tamanho--;
    }

    public void exibir() {
        if (primeiro == null) {
            System.out.println("Lista vazia");
            return;
        }
        Nodo atual = primeiro;
        do {
            System.out.print(atual.valor);
            if (atual.proximo != primeiro) System.out.print(" -> ");
            atual = atual.proximo;
        } while (atual != primeiro);
        // Prova visual de que é circular:
        System.out.println(" -> (volta para " + primeiro.valor + ")");
    }
}
