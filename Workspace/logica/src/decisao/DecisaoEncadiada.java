package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadiada {

	public static void main(String[] args) {

		String disciplina = JOptionPane.showInputDialog("Disciplina: ").toUpperCase(); // classe J
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Qual a quantidade de faltas do aluno(a): "));		

		if(faltas>=20) {
			System.out.println("Infelizmente você foi reprovado pelo número de " + faltas +" faltas. O máximo era de 20.");
		}else {
			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Qual a nota 1: "));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Qual a nota 2: "));
			float media = (nota1 + nota2) / 2;

			if (media >=6) {
				System.out.println("Parabéns, você foi aprovado na disciplina: " + disciplina);
			}else if (media>=4 && media<=6) {			
				System.out.println("Sua média na disciplina " + disciplina + " foi entre (E - &&) de 4,0 e 6,0: " + media);
				System.out.println("Você esta de exame na disciplina: " + disciplina);
			}else
				System.out.println("Sua média na disciplina " + disciplina + " foi abaixo de 4,0: " + media);
			System.out.println("Infelizmente você não foi aprovado na disciplina: " + disciplina);
		}
	}

}
