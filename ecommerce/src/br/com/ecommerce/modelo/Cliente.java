package br.com.ecommerce.modelo;

import br.com.ecommerce.util.PadraoCliente;

public class Cliente implements PadraoCliente{
	private int id;
	private String nome;
	private String email;
	private Endereco end;
	
	
	public String getServidor() {
		if (email.contains("@")) {
			return email.substring(email.indexOf("@")+1);
		}
		return email;
		
	}
	
	public String getResumo() {		
		return null;
	}

	public void setAll(int id, String nome, String email, Endereco end) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.end = end;
	}

	public Cliente(int id, String nome, String email, Endereco end) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.end = end;
	}
	
	public Cliente() {
		super();
	}
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + ", end=" + end + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}
	

	public void setEmail(String email) {
		this.email = email;
	}


	public Endereco getEnd() {
		return end;
	}


	public void setEnd(Endereco end) {
		this.end = end;
	}

	@Override
	public void setResumo(String p1, String p2) {
		// TODO Auto-generated method stub
		
	}
	
	

}
