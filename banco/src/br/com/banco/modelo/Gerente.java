package br.com.banco.modelo;

public class Gerente {
	
	private String nome;
	private String tel;
	private String email;
	private int func;	
	
	
	public void getAll(String nome, String tel, String email, int func) {
		this.nome = nome;
		this.tel = tel;
		this.email = email;
		this.func = func;
	}
	
	public Gerente() {
		super();
	}
	
	@Override
	public String toString() {
		return "Gerente [nome=" + nome + ", tel=" + tel + ", email=" + email + ", func=" + func + "]";
	}
	
	public Gerente(String nome, String tel, String email, int func) {
		super();
		this.nome = nome;
		this.tel = tel;
		this.email = email;
		this.func = func;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getFunc() {
		return func;
	}
	public void setFunc(int func) {
		this.func = func;
	}	

}
