package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual seu nome e sobrenome?").toUpperCase();		
			
		while (nome.length()<5 || nome.length()>20) {
			nome = JOptionPane.showInputDialog("Qual seu nome e sobrenome?").toUpperCase();
		}
		
		System.out.println("Seu nome é: " + nome);
		System.out.println("Seja bem vindo(a), " + nome.substring(0, nome.indexOf(" ")));
		
		short idade = Short.parseShort(JOptionPane.showInputDialog("Qual sua idade?"));
		
		while (idade<18 || idade>80) {
			idade = Short.parseShort(JOptionPane.showInputDialog("Qual sua idade?"));
		}
		System.out.println("Sua idade é: " + idade);
	}

}
