package br.com.colecoes.modelo;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {

		Set<String> lista = new HashSet<String>(); //não aceita elementos iguais, ordenação crescente 
		
		lista.add("18561");
		lista.add("sdf");
		lista.add("1.5");
		lista.add("true");
		
		System.out.println(lista);
		
		System.out.println("Cargo? " + lista.contains("sdf"));
		
		for(String cargo : lista) {
			System.out.println("Cargo: " + cargo);
		}

	}

}
