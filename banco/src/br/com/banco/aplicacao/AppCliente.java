package br.com.banco.aplicacao;

import javax.swing.JOptionPane;

import br.com.banco.modelo.Endereco;
import br.com.banco.modelo.Cliente;

public class AppCliente {

	public static void main(String[] args) {
		
		Cliente c = new Cliente(
		Integer.parseInt(JOptionPane.showInputDialog("C�digo")),
		JOptionPane.showInputDialog("Nome"),
		JOptionPane.showInputDialog("E-Mail"),
		
		new Endereco(
				JOptionPane.showInputDialog("Logradouro "),
				JOptionPane.showInputDialog("Bairro "),
				JOptionPane.showInputDialog("Cidade "),
				JOptionPane.showInputDialog("UF "),
				JOptionPane.showInputDialog("CEP "),
				JOptionPane.showInputDialog("N�mero "),
				JOptionPane.showInputDialog("Complemento ")
			)
		);
		System.out.println(c.getEnd().getBairro());
		}

}
