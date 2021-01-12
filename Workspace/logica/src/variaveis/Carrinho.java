package variaveis;

import javax.swing.JOptionPane;

public class Carrinho {

	public static void main(String[] args) {
		/*
		 * Nome do produto
		 * Categoria; alimenticio, aletrodomestico, ...
		 * Valor do produto
		 * Quantidade do produto
		 * Imposto do produto
		 */
		
		String nomeProd = JOptionPane.showInputDialog("Qual o produto?");
		String categProd = JOptionPane.showInputDialog("Qual a categoria do produto?");
		double valorProd = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do produto?"));
		int contProd = Integer.parseInt(JOptionPane.showInputDialog("Quantos produtos deseja?"));
		double impostoProd = Double.parseDouble(JOptionPane.showInputDialog("Qual a porcentagem de imposto sobre o produto?"));
		double impostoReal = ((valorProd * impostoProd) / 100);
		
		System.out.println("Produto:" + nomeProd);
		System.out.println("Categoria:" + categProd);
		System.out.println("Brinquedo:" + valorProd);
		System.out.println("Quantidade:" + contProd);
		System.out.println("Imposto:" + impostoProd);
		
		System.out.println("Custo total sem imposto: " + (valorProd));
		System.out.println("Custo total do imposto: " + impostoReal);
		System.out.println("Custo total com imposto a prazo: " + (valorProd + impostoReal));
		System.out.println("Custo total com imposto a vista (10% OFF): " + ((valorProd + impostoReal) * 0.9));

		




	}

}
