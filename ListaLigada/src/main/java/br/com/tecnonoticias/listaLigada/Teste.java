package br.com.tecnonoticias.listaLigada;

import java.util.LinkedList;

public class Teste {

	public static void main(String[] args) {
		Aluno maria = new Aluno();
		maria.setNome("Maria");

		Aluno manoel = new Aluno();
		manoel.setNome("Manoel");

		Aluno joaquim = new Aluno();
		joaquim.setNome("Joaquim");

		LinkedList<Aluno> listaLigada1 = new LinkedList<Aluno>();

		listaLigada1.add(maria);
		listaLigada1.add(manoel);
		listaLigada1.add(1, joaquim);

		for (int i = 0; i < listaLigada1.size(); i++) {
			System.out.println(listaLigada1.get(i));
		}
	}
}