package br.com.tecnonoticias.usina.Recursivo;

import java.util.Scanner;

public class ExemploRecursivo {

	// public class Fibonacci {

	public static int fibonacci(int n) {

		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);

	}

	public static int calcular(int ordem, int profundidade, int numero, int numero2) {
		if (ordem == profundidade) {
			return numero;
		} else {
			return calcular(ordem, profundidade + 1, numero = numero2 - numero, numero + numero2);
		}
	}

	@SuppressWarnings("resource")
	public static void main(String arg[]) {
		
		System.out.println("Algorito Alexandre " + fibonacci(5));
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero");
		int ordem = teclado.nextInt();
		int resultado = calcular(ordem, 0, 0, 1);
		System.out.println(resultado);
	}
}
// }