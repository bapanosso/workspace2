package dexercicios;

import javax.swing.JOptionPane;

public class ex1 {

	public static void main(String[] args) {

		int dias = Integer.parseInt(JOptionPane.showInputDialog("Quantos dias voc� ficou no hotel? "));
		int diarias = dias - (int) 1;
		float custo = 80;

		if(diarias>15) {
			custo = (custo + (int) 8)  * diarias;

		}else if(diarias<15) {
			custo = (custo + (int) 6)  * diarias;

		}else {
			custo = (custo + (float) 5.5)  * diarias;

		}

		System.out.println("O valor total da sua estadia � R$ " + custo + " referente a " + diarias + " di�rias. Lembramos que o n� de di�rias � a quantidade total de dias menos 1.");
	}

}
