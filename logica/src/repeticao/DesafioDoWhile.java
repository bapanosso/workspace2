package repeticao;

import javax.swing.JOptionPane;

public class DesafioDoWhile {

	public static void main(String[] args) {
		
		int j1 = Integer.parseInt(JOptionPane.showInputDialog("Qual o n�mero?"));
		int j2 = 0;
		int cont = 0;

		do {
			
			j2 = Integer.parseInt(JOptionPane.showInputDialog("Chute! Qual o n�mero?"));
			
			if(j1>j2) {
				JOptionPane.showMessageDialog(null,"Voc� est� chutando baixo!");
			} else if (j1<j2) {
				JOptionPane.showMessageDialog(null,"Voc� est� chutando alto!");
			}
			cont = cont+1;
			
		}while (j2!=j1);
		
		System.out.print("Parabens, voc� acertou o n�mero " + j1 + " em " + cont + " tentativas!");
	}

}
