package br.com.tecnonoticias.usina.Usina;

public class SistemaSeguraca {

	public static void main(String[] args) throws Exception {

		try {
			if (args[0].equals("falha")) {
			}
		} catch (Exception e) {
			new SistemaSeguranca1();
		}
	}
}
class SistemaSeguranca1 {
	public SistemaSeguranca1() throws IllegalArgumentException {
		try {
			throw new IllegalArgumentException("falha");
		} catch (Exception e) {
			new SistemaSeguranca2();
		}
	}
}
class SistemaSeguranca2 {
	public SistemaSeguranca2() throws IllegalArgumentException {
		try {
			throw new IllegalArgumentException("falha");
		} catch (Exception e) {
			new SistemaSeguranca3();
		}
	}
}
class SistemaSeguranca3 {
	public SistemaSeguranca3() throws IllegalArgumentException {
		try {
			throw new IllegalArgumentException("falha");
		} catch (Exception e) {
			new SistemaSeguranca4();
		}
	}
}
class SistemaSeguranca4 {
	public SistemaSeguranca4() throws IllegalArgumentException {
		try {
			throw new IllegalArgumentException("falha");
		} catch (Exception e) {
			new SistemaSeguranca5();
		}
	}
}
class SistemaSeguranca5 {
	public SistemaSeguranca5() throws IllegalArgumentException {
		try {
			throw new IllegalArgumentException("falha");
		} catch (Exception e) {
			System.out.println("Todo o sistema está em falha motivo " + e);
		}
	}
}