package br.com.banco.modelo;

import java.util.ArrayList;

public class Cliente {
	private int id;
	private String nome;
	private String email;
	private String cpf;
	private Endereco end;	
	ArrayList<String> fone = new ArrayList<String>();
	
	
	public void setAll(int id, String nome, String email, String cpf, Endereco end, ArrayList<String> fone) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.end = end;
		this.fone = fone;
	}
	
	public Cliente() {
		super();
	}
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + ", cpf=" + cpf + ", end=" + end + ", fone="
				+ fone + "]";
	}
	
	public Cliente(int id, String nome, String email, String cpf, Endereco end, ArrayList<String> fone) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.end = end;
		this.fone = fone;
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEnd() {
		return end;
	}
	public void setEnd(Endereco end) {
		this.end = end;
	}
	public ArrayList<String> getFone() {
		return fone;
	}
	public void setFone(ArrayList<String> fone) {
		this.fone = fone;
	}
	
}