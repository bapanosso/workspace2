package br.com.banco.modelo;

public class Conta {
	private int num;
	private float saldo;
	private Cliente cli;
	private Agencia ag;
	private Gerente ger;
	
	public void depositar(float valor) {
		if(valor>0) {
			saldo+=valor;
		}
	}
		
	public void getAll(int num, float saldo, Cliente cli, Agencia ag, Gerente ger) {
		this.num = num;
		this.saldo = saldo;
		this.cli = cli;
		this.ag = ag;
		this.ger = ger;
	}

	@Override
	public String toString() {
		return "Conta [num=" + num + ", saldo=" + saldo + ", cli=" + cli + ", ag=" + ag + ", ger=" + ger + "]";
	}

	public Conta() {
		super();
	}

	public Conta(int num, float saldo, Cliente cli, Agencia ag, Gerente ger) {
		super();
		this.num = num;
		this.saldo = saldo;
		this.cli = cli;
		this.ag = ag;
		this.ger = ger;
		
		}


	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public Cliente getCli() {
		return cli;
	}

	public void setCli(Cliente cli) {
		this.cli = cli;
	}

	public Agencia getAg() {
		return ag;
	}

	public void setAg(Agencia ag) {
		this.ag = ag;
	}

	public Gerente getGer() {
		return ger;
	}

	public void setGer(Gerente ger) {
		this.ger = ger;
	}
	

}
