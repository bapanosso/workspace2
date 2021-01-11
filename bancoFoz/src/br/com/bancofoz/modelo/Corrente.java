package br.com.bancofoz.modelo;

import br.com.bancofoz.utils.PadraoConta;

public class Corrente extends Conta implements PadraoConta{
	private float limite;
	private float taxa;
	
		
	public void debitarTaxa() {
		super.setSaldo(super.getSaldo()-taxa);
	}
	
	public void aumentarLimite(float porcent) {
		setLimite(getLimite() + getLimite() * (porcent/100));
		// limite = limite + limite * (porcent/100)
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	public float getTaxa() {
		return taxa;
	}

	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}

	public Corrente(float limite, float taxa) {
		super();
		this.limite = limite;
		this.taxa = taxa;
	}

	public Corrente(short num, byte digito, short ag, float saldo, Cliente cli,  float limite, float taxa) {
		super(num, digito, saldo, cli, ag);
		this.limite = limite;
		this.taxa = taxa;
	}

	public Corrente() {
		super();
	}

	public void setAll(short num, byte digito, float saldo, Cliente cli, short ag, float limite, float taxa) {
		super.setAll(num, digito, saldo, cli, ag);
		this.limite = limite;
		this.taxa = taxa;
	}

	@Override
	public String toString() {
		return "Corrente [limite=" + limite + ", taxa=" + taxa + "]";
	}

	@Override
	public boolean sacar(float valor) {
		if(valor>(super.getSaldo()+limite)) {
			return false;
		}
		super.setSaldo(super.getSaldo()-valor);
		return true;
	}

	@Override
	public boolean depositar(float valor) {
		super.setSaldo(super.getSaldo()+valor);
		return true;
	}
	
	public float verificarSaldo() {
		return super.getSaldo() + limite;
	}
	

}
