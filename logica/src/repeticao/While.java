package repeticao;

import javax.swing.JOptionPane;

public class While {

	public static void main(String[] args) {
		
		String email = JOptionPane.showInputDialog("Qual seu email?").toLowerCase();
		
		while (email.contains("@")==false) {
			email = JOptionPane.showInputDialog("Qual seu email?").toLowerCase();
		}
		System.out.println("Seja bem vindo(a), " + email.substring(0, email.indexOf("@")));
	}

}
