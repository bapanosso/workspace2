package br.com.ecommerce.modelo;

import br.com.ecommerce.util.PadraoCliente;

public class ClientePJ extends Cliente implements PadraoCliente{
	
	private String cnpj;
	private String contato;
	private String dataAbertura;
	
	public ClientePJ() {
		super();
	}
	public void setAll(int id, String nome, String email, Endereco end, String cnpj, String contato,
			String dataAbertura) {
		super.setAll(id, nome, email, end);
		this.cnpj = cnpj;
		this.contato = contato;
		this.dataAbertura = dataAbertura;
	}
	public ClientePJ(int id, String nome, String email, Endereco end, String cnpj, String contato,
			String dataAbertura) {
		super(id, nome, email, end);
		this.cnpj = cnpj;
		this.contato = contato;
		this.dataAbertura = dataAbertura;
	}
	@Override
	public String toString() {
		return "ClientePJ [cnpj=" + cnpj + ", contato=" + contato + ", dataAbertura=" + dataAbertura + ", cliente=" + super.toString() + "]";
	}
	public ClientePJ(int id, String nome, String email, Endereco end) {
		super(id, nome, email, end);
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public String getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	@Override
	public void setResumo(String p1, String p2) {
		cnpj=p1;
		setNome(p2);
		
	}
	
	

}
