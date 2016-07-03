package br.com.tecnonoticias.Hash;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		/*
		 * metodo put insere a key e o valor que será ligado a ele
		 */
		map.put(1, "edgar");
		map.put(2, "paula");
		map.put(3, "vitor");
		map.put(null, "fatima");
		map.put(5, null);
		map.put(3, "eder");
		
		/*
		 * metodo get() retorna o valor que esta ligado a chave map
		 */
		System.out.println("Valor da key 3: " + map.get(3));
		
		/*
		 * metodo remove, remove o elemento do valor da key que foi informado
		 */
		map.remove(3);
		System.out.println("Valor da key 3 apos remoção: " + map.get(3));
		
		/*
		 * metodo containsKey retorna true ou false, verificando se contem ou nao o valor da busca
		 */
		System.out.println("Busca pela key 3: " + map.containsKey(3));
		
		/*
		 * metodo continsValue retorna true ou false, verifica se no mapa contem o nome pesquisado
		 */
		System.out.println("Buscando por edgar: " + map.containsValue("edgar"));
		
		for (Object string : map.values()) {
			System.out.print(string + " ");
		} 
		
	}

}
