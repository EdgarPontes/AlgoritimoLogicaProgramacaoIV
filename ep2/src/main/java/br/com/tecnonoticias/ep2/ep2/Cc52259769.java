package br.com.tecnonoticias.ep2.ep2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cc52259769 {

	public static void main(String[] args) {

		try {
			new lerArquivo().lendoArquivo();

		} catch (IOException ex) {
			Logger.getLogger(Cc52259769.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}

class lerArquivo {
	public String uniao = "";
	public String interseccao = "";
	public String subtracao = "";
	public String cardinalidade = "";

	public void lendoArquivo() throws IOException {

		BufferedReader ler = new BufferedReader(
				new FileReader("/media/edgar/Novo volume/faculdade/AlgoritimoLogicaProgramacaoIV/ep2/entrada1"));
		String linha;
		while ((linha = ler.readLine()) != null) {
			if (linha.contains("u")) {
				String uniao = linha;
				this.uniao = novoConjuntoUniao(converter(uniao));
			} else if (linha.contains("i")) {
				String interseccao = linha;
				this.interseccao = novoConjuntoInterseccao(converter(interseccao));
			} else if (linha.contains("s")) {
				String subtracao = linha;
				this.subtracao = novoConjuntoSubtracao(converter(subtracao));
			} else {
				String cardinalidade = linha;
				this.cardinalidade = novoConjuntoCardinalidade(cardinalidade);
			}
		}
		ler.close();
		PrintWriter print = new PrintWriter(
				new FileWriter("/media/edgar/Novo volume/faculdade/AlgoritimoLogicaProgramacaoIV/ep2/RetornoOperacao"));
		print.println(this.uniao);
		print.println(this.interseccao);
		print.println(this.subtracao);
		print.print(this.cardinalidade);
		print.close();

	}

	public int[] converter(String recebe) {
		StringTokenizer mod = new StringTokenizer(recebe, " ,{}uis");
		int[] numero = new int[mod.countTokens()];
		for (int i = 0; i < numero.length; i++) {
			numero[i] = Integer.parseInt(mod.nextToken());

		}
		return numero;
	}

	public String novoConjuntoUniao(int[] numeros) {
		int count = 1;
		int num = numeros[0];

		while (count < numeros.length) {
			if (num < numeros[count]) {
				num = numeros[count];
			}
			count++;
		}
		int[] cU = new int[num + 1];
		for (int i = 0; i < numeros.length; i++) {
			cU[numeros[i]] = 1;
		}
		String trata = "{";
		for (int i = 0; i < cU.length; i++) {
			
			if (cU[i] > 0) {
				trata += Integer.toString(i) + ",";
			}
		}

		return trata + "}";
	}

	public String novoConjuntoInterseccao(int[] numeros) {
		int count = 1;
		int num = numeros[0];

		while (count < numeros.length) {
			if (num < numeros[count]) {
				num = numeros[count];
			}
			count++;
		}
		int[] cI = new int[num + 1];
		for (int i = 0; i < numeros.length; i++) {
			cI[numeros[i]] += 1;
		}
		String trata = "{";
		for (int i = 0; i < cI.length; i++) {
			if (cI[i] > 1) {
				trata += Integer.toString(i) + ",";
			}
		}
		return trata + "}";
	}

	public String novoConjuntoSubtracao(int[] numeros) {
		int count = 1;
		int num = numeros[0];

		while (count < numeros.length) {
			if (num < numeros[count]) {
				num = numeros[count];
			}
			count++;
		}
		int[] cS = new int[num + 1];
		for (int i = 0; i < numeros.length; i++) {
			cS[numeros[i]] += 1;
		}
		return "";
	}

	public String novoConjuntoCardinalidade(String recebe) {
		StringTokenizer mod = new StringTokenizer(recebe, " ,{}uis");
		String card = Integer.toString(mod.countTokens());
		return card;
	}
}
