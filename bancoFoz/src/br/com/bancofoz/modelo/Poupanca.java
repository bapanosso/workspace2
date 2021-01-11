package br.com.bancofoz.modelo;

import br.com.bancofoz.utils.PadraoConta;

public class Poupanca extends Conta  implements PadraoConta{

	private float rend;


	public void creditarRendimentos() {
		super.setSaldo(super.getSaldo()+super.getSaldo()*(rend/100));
	}

	public float getRend() {
		return rend;
	}

	public void setRend(float rend) {
		this.rend = rend;
	}

	@Override
	public String toString() {
		return "Poupanca [rend=" + rend + "]";
	}

	public Poupanca() {
		super();
	}

	public Poupanca(float rend) {
		super();
		this.rend = rend;
	}

	public Poupanca(short num, byte digito,  short ag, float saldo, Cliente cli, float rend) {
		super(num, digito, saldo, cli, ag);
		this.rend = rend;
	}

	public void setAll(short num, byte digito, float saldo, Cliente cli, short ag, float rend) {
		super.setAll(num, digito, saldo, getCli(), ag);
		this.rend = rend;
	}

	@Override
	public boolean sacar(float valor) {
		if (valor>0 && valor>super.getSaldo()) {
			return false;
		}

		super.setSaldo(super.getSaldo()-valor);
		return true;
	}

	@Override
	public boolean depositar(float valor) {
		if (valor<=0) {
			return false;
		}

		super.setSaldo(valor+super.getSaldo());
		return true;
	}	
	
	public float verificarSaldo() {
		return super.getSaldo();
	}

}
