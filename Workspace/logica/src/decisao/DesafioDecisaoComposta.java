package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoComposta {

	public static void main(String[] args) {
		
		String produto = JOptionPane.showInputDialog("Qual o produto?").toUpperCase(); // classe J
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade dispon�vel?"));
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor unit�rio do produto:"));
		
		if (quantidade>20) {
			System.out.println("Conceder 12% de desconto no valor unit�rio do produto");
			valor = valor  * (float) 0.88;
			
		}else if (quantidade<=5 && quantidade>=9) {
			System.out.println("Conceder 5% de desconto no valor unit�rio do produto");
			valor = valor * (float) 0.95;
			
		}else if (quantidade>=10 && quantidade<=20){  
			System.out.println("Conceder 10% de desconto no valor unit�rio do produto");
			valor = valor * (float) 0.9;
		}else
			System.out.println("N�o h� necessidade de redu��o no valor unit�rio do produto");
	
	System.out.println("O valor unit�rio do produto " + produto + " ser�: " + valor);

		}	
	}
