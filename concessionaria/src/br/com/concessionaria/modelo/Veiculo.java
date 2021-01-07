package br.com.concessionaria.modelo;

public class Veiculo {

	private String montadora;
	private String modelo;
	private float velocidadeMaxima;
	private float velocidadeAtual;
	private boolean status;
	private float valor;	
	
	public void acelerar(float x, float y) {
		if ((velocidadeAtual+x)<velocidadeMaxima && status==true) {
			velocidadeAtual+=x;
			velocidadeMaxima+=y;
		}		
	}
	
	public void acelerar(float x) {
		if (velocidadeAtual<velocidadeMaxima && status==true) {
			velocidadeAtual+=x;
		}		
	}
		
	public String verificarStatus() {
		return "Ligado?" + status + "\nVelocidade Atual: " + velocidadeAtual;
	}
	
	public void acelerar() {
		if (velocidadeAtual<velocidadeMaxima && status==true) {
			velocidadeAtual+=10;
		}		
	}
	
	public void desacelerar() {
		if (velocidadeAtual>0) {
			velocidadeAtual-=10;
		}		
	}
	
	public String desligar() {
		if (status==true) {
			status=false;
			velocidadeAtual=0;
			}
		return "Veículo desligado";
	}
	
	public String ligar() {
		if (status==false) {
			status=true;
			}
		return "Veículo ligado";
	}
	
	public void preencherValor(float x) {
		valor = x;
	}
	
	public float retornaValor() {
		return valor;
	}	
	
	public void preencherStatus(boolean x) {
		status = x;
	}
	
	public boolean retornaStatus() {
		return status;
	}	
	
	public void preencherVelocidadeAtual(float x) {
		velocidadeAtual = x;
	}
	
	public float retornaVelocidadeAtual() {
		return velocidadeAtual;
	}	
	
	public void preencherVelocidadeMaxima(float x) {
		velocidadeMaxima = x;
	}
	
	public float retornaVelocidadeMaxima() {
		return velocidadeMaxima;
	}	
	
	public void preencherModelo(String x) {
		modelo = x.toUpperCase();
	} 
	
	public String retornaModelo() {
		return modelo;
	}	
	
	public void preencherMontadora(String x) {
		montadora = x.toUpperCase();
	}
	
	public String retornaMontadora() {
		return montadora;
	}
}
