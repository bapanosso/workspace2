package br.com.elevador.modelo;

public class Elevador {

	private short capMaxima;
	private short andarMax;
	private short andarMin;
	private short quantPessoas;
	private short andarAtual;



	public void sair() {
		if(quantPessoas>=0) {
			quantPessoas-=quantPessoas;
		}		
	}
	
	public void sair(short quant) {
		short result = (short) (quantPessoas - quant);
		if(result>=0) {
			quantPessoas-=quant;
		}		
	}

	public void entrar(short quant) {
		short result = (short) (quant + quantPessoas);
		if(result<=capMaxima) {
			quantPessoas+=quant;
		}
	}

	public void descer() {
		if (andarAtual>andarMin) {
			andarAtual--;
		}
	}

	public void subir() {
		if (andarAtual<andarMax) {
			andarAtual++;
		}
	}

	public String verificaStatus() {
		return 
				"Quantidade de pessoas " + quantPessoas + "\nAndar Atual " + andarAtual + "\nCapacidade Máxima de pessoas " + capMaxima;
	}

	public void inicializar(short cap, short maior, short menor) {
		capMaxima = cap;
		andarMax=maior;
		andarMin=menor;
	}


}
