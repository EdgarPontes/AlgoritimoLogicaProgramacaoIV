package br.com.tecnonoticias.arvore.no;

public class No {

	private No right;
	private No left;
	private int raiz;

	public No(int raiz) {
		this.raiz = raiz;
	}

	public No getRight() {
		return right;
	}

	public void setRight(No right) {
		this.right = right;
	}

	public No getLeft() {
		return left;
	}

	public void setLeft(No left) {
		this.left = left;
	}

	public int getRaiz() {
		return raiz;
	}
	
	public void setRaiz(int raiz){
		this.raiz = raiz;
	}

}