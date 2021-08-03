
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fila f = new Fila(3);
        System.out.println("Fila com capacidade para " + f.getCapacidade() + " pessoas");
        f.enfileirar("Carlos");
        f.enfileirar("Bruna");
        f.enfileirar("Diego");
        System.out.println("Primeiro da fila: " + f.primeiro());
        f.desenfileirar();
        System.out.println("Primeiro da fila: " + f.primeiro());
        System.out.println("Tamanho da fila: " + f.tamanho());
        f.enfileirar("Janikele");
        f.enfileirar("Charles");
        f.desenfileirar();
        f.enfileirar("Paula");
        f.enfileirar("Rany");
        f.desenfileirar();
        f.desenfileirar();
        System.out.println("Primeiro da fila: " + f.primeiro());
        f.enfileirar("Charles");
        f.enfileirar("Rany");
        f.desenfileirar();
    }
}
