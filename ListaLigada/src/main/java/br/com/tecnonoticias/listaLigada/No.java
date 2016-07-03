package br.com.tecnonoticias.listaLigada;

public class No {

	private No proxima = null;
	private No anterior = null;
	private Object elemento;

	public No(No proxima, Object elemento) {
		this.proxima = proxima;
		this.elemento = elemento;
	}

	public No(Object elemento) {
		this.elemento = elemento;
	}

	public No() {
		proxima = null;
		anterior = null;
	}

	public void setProxima(No proxima) {
		this.proxima = proxima;
	}

	public No getProxima() {
		return proxima;
	}

	public Object getElemento() {
		return elemento;
	}

	public No getAnterior() {
		return anterior;
	}

	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}
}