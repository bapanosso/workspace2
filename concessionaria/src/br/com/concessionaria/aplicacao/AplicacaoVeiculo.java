package br.com.concessionaria.aplicacao;

import javax.swing.JOptionPane;

import br.com.concessionaria.modelo.Veiculo;

public class AplicacaoVeiculo {
	
	public static void main(String[] args) {
		Veiculo obj = new Veiculo();
		
		obj.preencherMontadora(JOptionPane.showInputDialog("Digite a montadora:"));
		obj.preencherModelo("UNO");
		obj.preencherVelocidadeMaxima(180);
		obj.preencherVelocidadeAtual(150);
		obj.preencherValor(30000);
		
		System.out.println("Montadora: + " + obj.retornaMontadora());
		System.out.println("Modelo: " + obj.retornaModelo());
		System.out.println("Velocidade Máxima: " + obj.retornaVelocidadeMaxima());
		System.out.println("Velocidade Atual: "+ obj.retornaVelocidadeAtual());
		System.out.println("Valor: " + obj.retornaValor());
		
		System.out.println(obj.ligar());
		System.out.println(obj.desligar());
		
	}
}