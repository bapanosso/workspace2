package br.com.banco.modelo;

public class Agencia {
	
	private String nome;
	private int  num;
	private Endereco end;
	private String tefefone;
	private int id;
	
	
	@Override
	public String toString() {
		return "Agencia [nome=" + nome + ", num=" + num + ", end=" + end + ", tefefone=" + tefefone + ", id=" + id
				+ "]";
	}
	
	public void getAll(String nome, int num, Endereco end, String tefefone, int id) {
		this.nome = nome;
		this.num = num;
		this.end = end;
		this.tefefone = tefefone;
		this.id = id;
	}
	
	public Agencia() {
		super();
	}
	
	public Agencia(String nome, int num, Endereco end, String tefefone, int id) {
		super();
		this.nome = nome;
		this.num = num;
		this.end = end;
		this.tefefone = tefefone;
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Endereco getEnd() {
		return end;
	}
	public void setEnd(Endereco end) {
		this.end = end;
	}
	public String getTefefone() {
		return tefefone;
	}
	public void setTefefone(String tefefone) {
		this.tefefone = tefefone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
