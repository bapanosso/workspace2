package br.com.ecommerce.teste;

import javax.swing.JOptionPane;

import br.com.ecommerce.modelo.Cliente;
import br.com.ecommerce.modelo.ClientePF;
import br.com.ecommerce.modelo.ClientePJ;
import br.com.ecommerce.modelo.Colaborador;


public class TestePessoa {

	public static void main(String[] args) {
		
		Cliente pessoa = null;
		String resp = JOptionPane.showInputDialog("Digite>\n<F> F�sica\n Jur�dica\n<C> Colaborador").toUpperCase();
		
		if(resp=="F") {
			pessoa = new ClientePF();			
		}else if (resp=="J") {
			pessoa = new ClientePJ();	
		}else if (resp=="C") {
			pessoa = new Colaborador();	
		}else {
			System.out.println("Op��o inv�lida!!!");
		}
		pessoa.setResumo("", "");
		
		System.out.println(pessoa.getResumo());
	}
}
