package br.com.tecnonoticias.testeLaboratorio.testeLaboratorio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Cc52259769 {

	public void registraNiveisHormonio(String[] coor, String[][] logHorm) throws IOException {
		
		for (int i = 0; i < coor.length; ) {
			int linha = Integer.parseInt(coor[i]) - 1;
			int coluna = Integer.parseInt(coor[i + 1]) - 1;

			if (linha < 100000 && coluna < 100 && linha >= 0 && coluna >= 0) {
				if (logHorm[linha][coluna] != null) {
					System.out.println(logHorm[linha][coluna]);
				} else {
					System.out.println(-1);
				}
			} else {
				System.out.println(-1);
			}
			i += 2;
		}
	}

	public static void main(String args[]) {

		Cc52259769 coorLoghorm = new Cc52259769();

		try {
			leituraCoor coor = new leituraCoor();
			lendoLogHorm loghorm = new lendoLogHorm();
			coorLoghorm.registraNiveisHormonio(coor.lendoArquivo(), loghorm.LendoArquivoLoghorm());

		} catch (IOException ex) {
			Logger.getLogger(Cc52259769.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

}

class leituraCoor {

	public String[] lendoArquivo() throws IOException {

		BufferedReader in = new BufferedReader(new FileReader(
				"/media/edgar/Novo volume/faculdade/AlgoritimoLogicaProgramacaoIV/testeLaboratorio/coor1"));

		String text = in.readLine();
		in.close();

		String[] coor = text.split(" ");
		return coor;
	}
}

class lendoLogHorm {

	public String[][] LendoArquivoLoghorm() throws IOException {

		BufferedReader leitura = new BufferedReader(new FileReader(
				"/media/edgar/Novo volume/faculdade/AlgoritimoLogicaProgramacaoIV/testeLaboratorio/logHorm"));
		String[][] logHorm = new String[100000][100];

		while (leitura.ready()) {
			String text = leitura.readLine();
			String logHormString[] = text.split(" ");

			/* linha */
			for (int i = 0; i < 100000; i++) {
				// /* quantidade de colunas */
				for (int j = 0; j < 100 && j < logHormString.length; j++) {
					if (logHormString[j] != null) {
						logHorm[i][j] = logHormString[j];
						logHormString[j] = null;
					}
				}
			}
		}
		leitura.close();
		return logHorm;
	}
}