package br.com.tecnonoticias.myException;

public class cc52259769 {

	public static void main(String[] args) {
		try {
			ClienteComum cliC = new ClienteComum();
			cliC.cadastro(cliC.teste1());
		} catch (Exception e) {
			System.out.println("erro teste 1 " + e);
		}
		try {

			ClienteEspecial cliE = new ClienteEspecial();
			cliE.cadastro(cliE.teste2());
		} catch (Exception e) {
			System.out.println("erro teste 2 " + e);
		}

	}
}

class Cliente {

	public String teste1() {
		return "falha";
	}

	public String teste2() {
		return "falha";
	}

}

class ClienteComum extends Cliente {

	public void cadastro(String falha) throws IllegalArgumentException {
		if (falha.equals("falha")) {
			throw new IllegalArgumentException();
		}
	}
}

class ClienteEspecial extends Cliente {

	public void cadastro(String falha) throws IllegalArgumentException {
		if (falha.equals("falha")) {
			throw new IllegalArgumentException();

		}
	}
}
