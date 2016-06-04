package br.com.tecnonoticias.No;

/**
 *
 * @author alexandre
 */

public class Main {

	public static void main(String[] args) {

		No startNo = new No();
		ListNo li = new ListNo();
		int cont = (int) (Math.random() * 50);

		for (int i = 0; i < cont; i++) {

			startNo = li.insertNo(startNo, i);

		}

		System.out.println(li.readList(startNo));

		cont = (int) (Math.random() * 50);

		for (int i = 0; i < cont; i++) {

			startNo = li.insertNo(startNo, i);

		}

		System.out.println(li.readList(startNo));

	}

}

class No {

	public int value;
	public No nextNo = null;

}

class ListNo {

	public No insertNo(No noRoot, int value) {

		if (noRoot.nextNo == null) {

			No newNo = new No();
			newNo.value = value;
			newNo.nextNo = null;
			noRoot.nextNo = newNo;

		} else {

			No newNo = new No();
			No aux = new No();

			newNo.value = value;
			newNo.nextNo = null;

			aux = noRoot.nextNo;

			while (aux.nextNo != null) {

				aux = aux.nextNo;

			}

			aux.nextNo = newNo;

		}

		return noRoot;
	}

	public String readList(No no) {

		No aux = no.nextNo;
		String out = "";
		while (aux != null) {

			out = out + " " + aux.value;
			aux = aux.nextNo;

		}

		return out;
	}

}
