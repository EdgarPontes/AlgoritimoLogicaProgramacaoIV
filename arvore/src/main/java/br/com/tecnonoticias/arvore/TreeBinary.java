package br.com.tecnonoticias.arvore;

import java.util.Calendar;

import br.com.tecnonoticias.arvore.no.No;

public class TreeBinary {

	public static void insertNo(No node, int raiz) {

		if (raiz < node.getRaiz()) {

			if (node.getLeft() != null) {

				insertNo(node.getLeft(), raiz);

			} else {

				node.setLeft(new No(raiz));
			}
		} else if (raiz > node.getRaiz()) {

			if (node.getRight() != null) {

				insertNo(node.getRight(), raiz);
			} else {

				node.setRight(new No(raiz));
			}
		}
	}

	public static void inOrder(No node) {

		if (node != null) {

			inOrder(node.getLeft());

			System.out.print(node.getRaiz() + " ");

			inOrder(node.getRight());

		}
	}

	public static void posFixed(No node) {
		
		if (node != null) {
			
			posFixed(node.getLeft());
			
			posFixed(node.getRight());
			
			System.out.print(node.getRaiz() + " ");
		}
	}
	
	public static void preFixed(No node) {
		
		if(node != null){
			
			System.out.print(node.getRaiz() + " ");
			
			preFixed(node.getLeft());
			
			preFixed(node.getRight()); 
			
			}
		}

	public static void main(String[] args) {
		No no = new No(7);
		Calendar c = Calendar.getInstance(); 
		// no.setRaiz(15);
		System.out.println("Data e Hora atual: " + c.getTime());
		long inicio = System.currentTimeMillis();

		insertNo(no, 10);
		
		long fim  = System.currentTimeMillis();
		System.out.println( "tempo gasto : " + (fim - inicio) );
		
		System.out.println("Data e Hora atual: " + c.getTime());
		
		
		insertNo(no, 8);
		insertNo(no, 11);
		insertNo(no, 9);
		
		
		System.out.println("Impresão em ordem: " );
		inOrder(no);
		System.out.println("\nImpresão em pre fixido: " );
		posFixed(no);
		System.out.println("\nImpresão em pos fixado: " );
		preFixed(no);
	}
}