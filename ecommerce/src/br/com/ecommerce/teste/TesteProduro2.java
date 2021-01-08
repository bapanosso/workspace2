package br.com.ecommerce.teste;

import javax.swing.JOptionPane;

import br.com.ecommerce.modelo.Produto;

public class TesteProduro2 {

	public static void main(String[] args) {

		Produto p = new Produto(
				Integer.parseInt(JOptionPane.showInputDialog("ID")), 
				JOptionPane.showInputDialog("Descrição"),
				Float.parseFloat(JOptionPane.showInputDialog("Valor de Venda")),
				Float.parseFloat(JOptionPane.showInputDialog("Valor de compra")),
				Integer.parseInt(JOptionPane.showInputDialog("Quantidade"))
				);
		
		System.out.println(p.getAll());

	}

}
