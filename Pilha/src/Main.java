
public class Main {

    /**
     * @param args the command line arguments
     * @throws StackEmptyException
     * @throws StackFullException
     */
    public static void main(String[] args) {

        // Pilha p = new Pilha(7);
        // System.out.println(p.vazia());
        // p.empilhar(8);
        // p.empilhar(7);
        // p.desempilhar();
        // p.empilhar("a");
        // p.empilhar("teste");
        // p.empilhar(3);        
        // p.empilhar(3);
        // p.empilhar(9);
        // p.empilhar(3);
        // p.empilhar(4);
        // System.out.println("Elemento do topo da pilha: " + p.topo());
        // p.desempilhar();
        // System.out.println("Elemento do topo da pilha: " + p.topo());
        // p.desempilhar();
        // System.out.println("Elemento do topo da pilha: " + p.topo());
        // p.empilhar("a");
        // System.out.println("Elemento do topo da pilha: " + p.topo());
        PilhaEncadeada q = new PilhaEncadeada();
        System.out.println("Elemento do topo da pilha: " + q.topo());

        q.empilhar("a");
        System.out.println("Elemento do topo da pilha: " + q.topo());

        q.empilhar("b");
        System.out.println("Elemento do topo da pilha: " + q.topo());

        q.empilhar("c");
        System.out.println("Elemento do topo da pilha: " + q.topo());

        q.desempilhar();
        System.out.println("Elemento do topo da pilha: " + q.topo());
        q.desempilhar();
        q.desempilhar();

    }

}
