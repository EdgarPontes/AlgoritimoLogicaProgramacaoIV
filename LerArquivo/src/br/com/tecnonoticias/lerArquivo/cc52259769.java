package br.com.tecnonoticias.lerArquivo;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class cc52259769 {

	String linha = " ";
	int qtde;

	public void leitura() throws IOException {

		BufferedReader leitura = new BufferedReader(
				new FileReader("/home/alexandre/Desktop/arquivo/cc52259769.txt"));

		while (true) {
			if (getLinha() == " ") {
				System.out.println("Lendo o arquivo!\n");
			} else {
				if (getLinha() != null) {
					System.out.println(getLinha());
					setQtde(getQtde() + 1);
				} else {
					break;
				}
			}
			setLinha(leitura.readLine());
		}
		leitura.close();
		System.out.println("\nA quantidade de linhas lidas foi " + getQtde());
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public String getLinha() {
		return linha;
	}

	public void setLinha(String linha) {
		this.linha = linha;
	}

	public static void main(String[] args) throws IOException {

		new cc52259769().leitura();
	}
}
