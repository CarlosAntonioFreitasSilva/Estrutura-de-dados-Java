
public class Pilha{
      
    private final int capacidade;
    
    private final Object S[];
    
    private int topo =-1;
        
    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        S = new Object[capacidade];
    }

    public int tamanho() {
        return (topo+1);
    }

    public boolean vazia() {
        return(topo<0);
    }

    public Object topo(){
        if(vazia())
            System.out.println("Pilha vazia");
        return S[topo];
    }
    
    public void empilhar(Object e){
        if(tamanho()==capacidade){
            System.out.println("Pilha cheia"); 
        }else{
            S[++topo]=e; 
        }
    }
    
    public void desempilhar(){
        if(vazia()){
            System.out.println("Pilha vazia.");
        }else{
            --topo;
        }
    }
}
