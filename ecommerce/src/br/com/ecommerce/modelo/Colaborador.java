package br.com.ecommerce.modelo;

import br.com.ecommerce.util.PadraoCliente;

public class Colaborador extends Cliente implements PadraoCliente{
	
	private String cargo;
	private String dataAdmissao;
	
	
	
	public Colaborador() {
		super();
	}
	public void setAll(int id, String nome, String email, Endereco end, String cargo, String dataAdmissao) {
		super.setAll(id, nome, email, end);
		this.cargo = cargo;
		this.dataAdmissao = dataAdmissao;
	}
	public Colaborador(int id, String nome, String email, Endereco end) {
		super(id, nome, email, end);
	}
	@Override
	public String toString() {
		return "Colaborador [cargo=" + cargo + ", dataAdmissao=" + dataAdmissao + ", colaborador=" + super.toString() + "]";
	}
	public Colaborador(int id, String nome, String email, Endereco end, String cargo, String dataAdmissao) {
		super(id, nome, email, end);
		this.cargo = cargo;
		this.dataAdmissao = dataAdmissao;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	@Override
	public void setResumo(String p1, String p2) {
		cargo=p1;
		setNome(p2);
		
	}
	


}
