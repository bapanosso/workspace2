package dexercicios;

import javax.swing.JOptionPane;

public class ex3 {

	public static void main(String[] args) {

		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Qual o primeiro n�mero? "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o segundo n�mero? "));
		int op = Integer.parseInt(JOptionPane.showInputDialog("Escolha a op��o:\n1) Soma\n2) Subtra��o\n3) Multiplica��o\n4) Divis�o "));
		int valor = 0;

		if(op>4 || op==0) {
			System.out.println("Op��o escolhida � invalida.");

		}else{
			if(op==1) {
				valor = n1 + n2;
				System.out.println("A opera��o escolhida foi Soma de n1 e n2 com total de " + valor);
				
			}else if (op==2) {
				valor = n1 - n2;
				System.out.println("A opera��o escolhida foi Subtra��o de n1 e n2 com total de " + valor);
				
			}else if (op==3) {
				valor = n1 * n2;
				System.out.println("A opera��o escolhida foi Multiplica��o de n1 e n2 com total de " + valor);
				
			}else {
				valor = n1 / n2;
				System.out.println("A oepra��o escolhida foi  Divis�o de n1 e n2 com total de" + valor);
			}
			
		}

	}

}
