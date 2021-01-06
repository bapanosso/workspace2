package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {

	public static void main(String[] args) {
		/*
		 * Existem dois tipos de dados
		 * - alfanum�rico: dado que n�o vai ser utilizado em uma express�o matem�tica (ex: CEP, CPF com d�gito)
		 * 
		 * - num�rico: dado que PODE ser utilizado em uma express�o matem�tica
		 * 
		 */
		
		String nome = JOptionPane.showInputDialog("Qual seu nome?"); // classe J
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Qual sua altura?"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Qual seu peso?"));		
		double imc = peso / (altura * altura);
		

		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("Peso: " + peso);
		System.out.println("IMC: " + imc);		
	}

}
