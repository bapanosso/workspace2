package br.com.bancofoz.modelo;

import br.com.bancofoz.utils.PadraoConta;

public class Conta implements PadraoConta{
	
	private short num;
	private byte digito;
	private float saldo;
	private Cliente cli;
	private short ag;
	
/*	public float verificarSaldo() {
		if(this instanceof  Poupanca) {
			return saldo;
		}else if (this instanceof Corrente) {
			return saldo + limite;
		}
		
	}	
	*/
	

	public void setAll(short num, byte digito, float saldo, Cliente cli, short ag) {
		this.num = num;
		this.digito = digito;
		this.saldo = saldo;
		this.cli = cli;
		this.ag = ag;
	}



	public Conta() {
		super();
	}



	@Override
	public String toString() {
		return "Conta [num=" + num + ", digito=" + digito + ", saldo=" + saldo + ", cli=" + cli + ", ag=" + ag + "]";
	}



	public Conta(short num, byte digito, float saldo, Cliente cli, short ag) {
		super();
		this.num = num;
		this.digito = digito;
		this.saldo = saldo;
		this.cli = cli;
		this.ag = ag;
	}



	public short getNum() {
		return num;
	}

	public void setNum(short num) {
		this.num = num;
	}

	public byte getDigito() {
		return digito;
	}

	public void setDigito(byte digito) {
		this.digito = digito;
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

	public short getAg() {
		return ag;
	}

	public void setAg(short ag) {
		this.ag = ag;
	}


	@Override
	public boolean sacar(float valor) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean depositar(float valor) {
		// TODO Auto-generated method stub
		return false;
	}



	public float verificarSaldo() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
