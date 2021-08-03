
public class Fila {

    private final int capacidade;
    private final Object F[];
    private int f, x;
    private int r, y;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        r = 0;
        f = 0;
        x = capacidade;
        y = capacidade;
        F = new Object[capacidade];
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int tamanho() {
        return x - y;
    }

    public boolean vazia() {
        return (x == y);
    }

    public Object primeiro() {
        return F[y % capacidade];
    }

    public void enfileirar(Object e) {

        if (tamanho() == capacidade) {
            System.out.println(e + ", n\u00e3o \u00e9 poss\u00edvel fazer pedido, a fila est\u00e1 cheia");
        } else {
            r = x % capacidade;
            F[r] = e;
            System.out.println(F[r] + " fez pedido");
            x++;
        }
    }

    public void desenfileirar() {
        if (tamanho() == 0) {
            System.out.println("Fila vazia");
        } else {
            f = y % capacidade;
            y++;
            System.out.println(F[f] + ", seu pedido est\u00e1 pronto");
        }
    }
}
