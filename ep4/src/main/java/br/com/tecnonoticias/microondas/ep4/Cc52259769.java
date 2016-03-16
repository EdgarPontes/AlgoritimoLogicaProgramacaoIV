package br.com.tecnonoticias.microondas.ep4;

/*
 *Uma empresa de micro-ondas pretende lançar no mercado três modelos de um novo produto. 
 *Os modelos são padrão, econômico e potente. Você foi contratado para desenvolver o software
 *que será usado nos três modelos. Durante a reunião com o cliente ficou acordado que o modelo 
 *econômico e potente possuem as mesmas funções que o modelo padrão (descongelar, cozinhar, timer, 
 *fazer pipoca, fazer chá e grelhar). Porém,  o modelo econômico possui uma função definida como 
 *“cozimento baixo” e o potente possui uma função denominada “cozimento alto”. Ambos os modelos, 
 *possuem como características em comum tempo máximo de cozimento e potência máxima. Também ficou
 *acordado que, um conjunto de funções novas serão implementadas futuramente e atribuídas ao modelo
 *econômico, estas funções são “pesarCarne”, “pesarPeixe” e “pesarAves”. Destas três, a função
 *“pesarPeixe” já está implementada. Por sua vez, para o modelo potente serão implementadas 
 *futuramente as funções “superDescongelante” e “superTostado”. Todas as funções recebem uma 
 *string e devolvem um inteiro no valor 1.  Construa um código em Java que atenda as especificações 
 *acima. O código não precisa executar nada, mas necessita ser compilado corretamente.

 */

public class Cc52259769 {
	public static void main(String[] args) {
		Padrao mPadrao = new Padrao();
		System.out.println("A potencia maxima do microondas padrão é: "+mPadrao.potenciaMaxima);
		
		Economoco mEconomico = new Economoco();
		System.out.println(mEconomico.pesarPeixes("peixe"));
		System.out.println("O tempo maxima de cozimento do microondas economico é: "+mEconomico.tempoMaxiomodeCozimneot);
		
		Potente mPotente = new Potente();
		System.out.println(mPotente.cozinhar("frango"));
	}
}

class Padrao {
	public int tempoMaxiomodeCozimneot = 100;
	public int potenciaMaxima = 100;

	public int descongelar(String string) {
		return 1;
	}

	public int cozinhar(String string) {
		return 1;
	}

	public int timer(String string) {
		return 1;
	}

	public int fazerPipoca(String string) {
		return 1;
	}

	public int fazerCha(String string) {
		return 1;
	}

	public int grelhar(String string) {
		return 1;
	}
}

abstract class NovaFuncao extends Padrao {
	public abstract int pesarCarnes(String string);

	public int pesarPeixes(String string){
		return 1;
	}

	public abstract int pesarAves(String string);
}

class Economoco extends NovaFuncao {
	public int cozimentoBaixo(String string) {
		return 1;
	}

	@Override
	public int pesarCarnes(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int pesarAves(String string) {
		return 0;
	}
}

interface NovaFucao{
	public abstract int superDescongelante(String string); 
	public abstract int superTostado(String string);
}

class Potente extends Padrao implements NovaFucao{
	public int cozimentoAlto(String string) {
		return 1;
	}

	public int superDescongelante(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int superTostado(String string) {
		// TODO Auto-generated method stub
		return 0;
	}
}
