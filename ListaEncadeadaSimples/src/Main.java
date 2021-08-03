
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserirNoInicio("Carlos");
        lista.inserirNoInicio("Bruna");
        lista.inserirNoInicio("Charles");
        System.out.println("Primeiro da lista: " + lista.primeiroElemento());
        System.out.println("Ultimo da lista: " + lista.ultimoElemento());
        lista.inserirNoFim("Janikele");
        System.out.println("Ultimo da lista: " + lista.ultimoElemento());
        lista.inserirNoInicio("Diego");
        System.out.println("Primeiro da lista: " + lista.primeiroElemento());
    }
}
