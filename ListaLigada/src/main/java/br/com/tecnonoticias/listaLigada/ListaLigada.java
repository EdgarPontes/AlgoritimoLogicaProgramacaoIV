package br.com.tecnonoticias.listaLigada;

public class ListaLigada {

	private No primeira;
	private No ultima;
	private int totalDeElementos;

	public void adiciona(Object elemento) {
		if (this.totalDeElementos == 0) {
			No nova = new No(elemento);
			this.primeira = nova;
			this.ultima = nova;
			this.totalDeElementos++;
		} else {
			No nova = new No(elemento);
			this.ultima.setProxima(nova);
			nova.setAnterior(this.ultima);
			this.ultima = nova;
			this.totalDeElementos++;
		}
	}

	public void adiciona(int posicao, Object elemento) {
		if (posicao == 0) { // No começo.
			this.adicionaNoComeco(elemento);
		} else if (posicao == this.totalDeElementos) { // No fim.
			this.adiciona(elemento);
		} else {
			No anterior = this.pegaCelula(posicao - 1);
			No proxima = anterior.getProxima();
			No nova = new No(anterior.getProxima(), elemento);
			nova.setAnterior(anterior);
			anterior.setProxima(nova);
			proxima.setAnterior(nova);
			this.totalDeElementos++;
		}
	}

	public Object pega(int posicao) {
		return this.pegaCelula(posicao).getElemento();
	}

	public void remove(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição não existe");
		}

		if (posicao == 0) {
			this.removeDoComeco();
		} else if (posicao == this.totalDeElementos - 1) {
			this.removeDoFim();
		} else {
			No anterior = this.pegaCelula(posicao - 1);
			No atual = anterior.getProxima();
			No proxima = atual.getProxima();

			anterior.setProxima(proxima);
			proxima.setAnterior(anterior);

			this.totalDeElementos--;
		}
	}

	public int tamanho() {
		return this.totalDeElementos;
	}

	public boolean contem(Object elemento) {
		No atual = this.primeira;

		while (atual != null) {
			if (atual.getElemento().equals(elemento)) {
				return true;
			}
			atual = atual.getProxima();
		}
		return false;
	}

	public void adicionaNoComeco(Object elemento) {
		if (this.totalDeElementos == 0) {
			No nova = new No(elemento);
			this.primeira = nova;
			this.ultima = nova;
		} else {
			No nova = new No(this.primeira, elemento);
			this.primeira.setAnterior(nova);
			this.primeira = nova;
		}
		this.totalDeElementos++;
	}

	public void removeDoComeco() {
		if (!this.posicaoOcupada(0)) {
			throw new IllegalArgumentException("Posição não existe");
		}

		this.primeira = this.primeira.getProxima();
		this.totalDeElementos--;

		if (this.totalDeElementos == 0) {
			this.ultima = null;
		}
	}

	public void removeDoFim() {
		if (!this.posicaoOcupada(this.totalDeElementos - 1)) {
			throw new IllegalArgumentException("Posição não existe");
		}
		if (this.totalDeElementos == 1) {
			this.removeDoComeco();
		} else {
			No penultima = this.ultima.getAnterior();
			penultima.setProxima(null);
			this.ultima = penultima;
			this.totalDeElementos--;
		}
	}

	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeElementos;
	}

	private No pegaCelula(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição não existe");
		}

		No atual = primeira;
		for (int i = 1; i < posicao; i++) {
			atual = atual.getProxima();
		}
		return atual;
	}

	public void mudarNo(int inicio, int fim) {

		No aux = new No();
		No aux1 = new No();
		No noArray[] = new No[totalDeElementos];
		 aux.setProxima(this.primeira);

//		for (int j = fim; j > inicio; j--) {
			for (int i = 0; i <= totalDeElementos - 1; i++) {
				noArray[i] = aux.getProxima();
				 aux = aux.getProxima();
			}
			// aux = pegaCelula(j);
			// aux1 = aux.getAnterior();

			// aux1.setProxima(aux.getProxima());
			// aux.setProxima(aux1);
			// aux.setAnterior(aux1.getAnterior());
			// aux1.setAnterior(aux);
			// j--;

			noArray[inicio].setProxima(noArray[fim].getProxima());
			noArray[fim].setProxima(noArray[inicio].getProxima());
			noArray[inicio].setAnterior(noArray[fim].getAnterior());
			noArray[fim].setAnterior(noArray[inicio].getAnterior());
//		}
	}

	public String toString() {

		// Verificando se a Lista está vazia
		if (this.totalDeElementos == 0) {
			return "[]";
		}

		StringBuilder builder = new StringBuilder("[ ");
		No atual = primeira;

		// Percorrendo até o penúltimo elemento.
		// for (int i = 0; i < this.totalDeElementos - 1; i++) {
		while (atual != null) {
			builder.append(atual.getElemento());
			builder.append(" ");
			atual = atual.getProxima();
		}

		// último elemento
		// builder.append(atual.getElemento());
		builder.append("]");

		return builder.toString();
	}
}