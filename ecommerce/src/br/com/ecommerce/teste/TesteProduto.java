package br.com.ecommerce.teste;

import javax.swing.JOptionPane;

import br.com.ecommerce.modelo.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		
		Produto p = new Produto();
		p.setDescricao("Churros");
		p.setQuant(10);
		p.setValorCompra(5);
		p.setValorVenda(8);
		p.setId(1);
		
		System.out.println("Produto: " + p.getDescricao());
		System.out.println("Promoção: " + p.getPromocao(20));
		System.out.println("Valor Venda: " + p.getValorVenda());
		System.out.println("Valor Compra: " + p.getValorCompra());
		p.atualizarValores(10);
		
		System.out.println(p.getAll());
		System.out.println(p.verificarEstoque());
		System.out.println(p.getTotalCompras());
		System.out.println(p.getTotalVendas());
		
		p.setAll
			(Integer.parseInt(JOptionPane.showInputDialog("Código")), 
			JOptionPane.showInputDialog("Descrição"),
			Float.parseFloat(JOptionPane.showInputDialog("Valor de Venda")),
			Float.parseFloat(JOptionPane.showInputDialog("Valor de compra")),
			Integer.parseInt(JOptionPane.showInputDialog("Quantidade")));
		
		System.out.println(p.getAll());
		}

}
