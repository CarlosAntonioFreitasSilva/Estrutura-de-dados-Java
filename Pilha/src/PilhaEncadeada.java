/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruna
 */
public class PilhaEncadeada {
    private Nodo topo;
    private int tamanho;
    
    public PilhaEncadeada(){
        this.topo = new Nodo();
        this.tamanho=0;
    }
    
    public int tamanho(){
        return tamanho;
    }
    
    public boolean vazia(){
        return (tamanho ==0);
    }
    public Object topo(){
        if(vazia())
            System.out.println("Pilha vazia");
        return topo.getElemento();
        
    }
    
    public void empilhar(Object e){
        Nodo nodo = new Nodo();
        nodo.setElemento(e);
        nodo.setProximo(topo);
        topo=nodo;
        tamanho ++;
    }
    
    public void desempilhar(){
        if(vazia()){
            System.out.println("Pilha vazia.");
        }else{
            topo=topo.getProximo();
            tamanho--;
        }
    }    
}
