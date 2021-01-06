package repeticao;

import javax.swing.JOptionPane;

public class DesafioDoWhile {

	public static void main(String[] args) {
		
		int j1 = Integer.parseInt(JOptionPane.showInputDialog("Qual o número?"));
		int j2 = 0;
		int cont = 0;

		do {
			
			j2 = Integer.parseInt(JOptionPane.showInputDialog("Chute! Qual o número?"));
			
			if(j1>j2) {
				JOptionPane.showMessageDialog(null,"Você está chutando baixo!");
			} else if (j1<j2) {
				JOptionPane.showMessageDialog(null,"Você está chutando alto!");
			}
			cont = cont+1;
			
		}while (j2!=j1);
		
		System.out.print("Parabens, você acertou o número " + j1 + " em " + cont + " tentativas!");
	}

}
