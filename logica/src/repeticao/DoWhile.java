package repeticao;

import javax.swing.JOptionPane;

public class DoWhile {

	public static void main(String[] args) {
		
		int v1 = 0;
		int v2 = 0;

		do {
			v1 = Integer.parseInt(JOptionPane.showInputDialog("Qual o primeiro valor?"));
			v2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o segundo valor?"));
			JOptionPane.showMessageDialog(null,"Resultado: " + (v1 + v2));
		}while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Pergunta", JOptionPane.YES_NO_OPTION)==0);
	}

}
