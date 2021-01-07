package br.com.elevador.aplicacao;

import br.com.elevador.modelo.Elevador;

public class AplicacaoElevador {
	
	public static void main(String[] args) {
	
		Elevador obj = new Elevador();
	
		obj.inicializar((short) 10,(short) 10, (short) 10);
		System.out.println(obj.verificaStatus());
		obj.subir();
		obj.descer();
		System.out.println(obj.verificaStatus());
		obj.entrar((short)5);
		obj.entrar((short)15);
		obj.descer();
		System.out.println(obj.verificaStatus());
	}

}
