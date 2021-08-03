/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruna
 */
public class Nodo {   

	private Nodo proximo;
	private Object elemento;

	public Nodo getProximo(){
		return proximo;
	}

	public Object getElemento(){
		return  elemento;
	}

	public void setProximo(Nodo proximo){
		this.proximo  = proximo;
	}

	public void setElemento(Object elemento){
		this.elemento = elemento;
	}

	public Nodo(){
		this(null,null);
	}
	public Nodo(Object elemento, Nodo proximo){
		this.elemento = elemento;
		this.proximo  = proximo;

	}
}

