package br.com.colecoes.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteList {

	public static void main(String[] args) {

			
			
			/*
			int numeros[] = new int[9];
			numeros[0] = 165;
			numeros[1] = 0;
			Cliente cliente = new ClientePF();
			List<Integer> lista = new ArrayList<Integer>();	
			
			
			for(int i=0; i<lista.size(); i++) {
				System.out.println("Cargo: " + lista.get(i));
			}
			
						Collections.reverse(lista);
						
						 for(String cargo : lista) {
				System.out.println("Cargo: " + cargo);
			}

			*/			
			
		
			List<String> lista = new ArrayList<String>();
			lista.add("18561");
			lista.add("sdf");
			lista.add("1.5");
			lista.add("true");
			
			System.out.println(lista);
			System.out.println("Elemento 1: " + lista.get(0));
			lista.remove(0);
			System.out.println("Novo Elemento 1: " + lista.get(0));
			Collections.sort(lista);
			System.out.println("Lista Ordenada: " + lista);
			
			for(int i=0; i<lista.size(); i+=2) {
				System.out.println("Cargo: " + lista.get(i));
			}
			
	}

}
