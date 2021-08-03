public class ListaEncadeada {

    private Nodo inicio;
    private Nodo fim;

    public ListaEncadeada() {
        this.inicio = new Nodo();
        this.fim = new Nodo();
    }

    public void inserirNoInicio(Object elemento) {

        Nodo nodo = new Nodo();
        nodo.setElemento(elemento);
        nodo.setProximo(inicio);
        inicio = nodo;

        if (fim.getElemento() == null) {
            fim = nodo;
        }

    }

    public void inserirNoFim(Object elemento) {
        Nodo nodo = new Nodo();
        nodo.setElemento(elemento);
        nodo.setProximo(null);
        fim.setProximo(nodo);
        fim = nodo;

        if (inicio.getElemento() == null) {
            inicio = nodo;
        }

    }

    public Object primeiroElemento() {
        return inicio.getElemento();
    }

    public Object ultimoElemento() {
        return fim.getElemento();
    }
}
