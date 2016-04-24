package br.com.tecnonoticias.listaLigada;

public class TesteAdicionaPorPosicao {
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		lista.adiciona("Rafael");
		lista.adiciona("Paulo");
		lista.adiciona("Camila");
		lista.adiciona("Jose");
		lista.adiciona("Marcio");

		System.out.println(lista);
		
		lista.mudarNo(2, 4);
		System.out.println(lista);
		
		
	}
}