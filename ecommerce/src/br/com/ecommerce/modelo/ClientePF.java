package br.com.ecommerce.modelo;

import br.com.ecommerce.util.PadraoCliente;

public class ClientePF extends Cliente implements PadraoCliente{
		
	private String cpf;
	private String rg;
	
	public String getResumo() {
		return "Nome: " + super.getNome() + "\nCPF: " + cpf;
	}
	
	public void setAll(int id, String nome, String email, Endereco end, String cpf, String rg) {
		this.cpf = cpf;
		this.rg = rg;
	}	
	
	public ClientePF() {
		super();
	}	

	public ClientePF(int id, String nome, String email, Endereco end, String cpf, String rg) {
		super(id, nome, email, end);
		this.cpf = cpf;
		this.rg = rg;
	}

	@Override
	public String toString() {
		return "ClientePF [cpf=" + cpf + ", rg=" + rg + ", cliente=" + super.toString() +"]";
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}

	@Override
	public void setResumo(String p1, String p2) {
		cpf=p1;
		setNome(p2);
		
	}	
	
}
