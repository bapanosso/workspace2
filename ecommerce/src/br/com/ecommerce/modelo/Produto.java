package br.com.ecommerce.modelo;

public class Produto {
	
	private int id;
	private String descricao;
	private float valorVenda;
	private float valorCompra;
	private int quant;
	
	 
	
	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", valorVenda=" + valorVenda + ", valorCompra="
				+ valorCompra + ", quant=" + quant + "]";
	}

	public void setAll(int id, String descricao, float valorVenda, float valorCompra, int quant) {
		this.id = id;
		this.descricao = descricao;
		this.valorVenda = valorVenda;
		this.valorCompra = valorCompra;
		this.quant = quant;
	}

	public Produto() {
		super();
	}

	public Produto(int id, String descricao, float valorVenda, float valorCompra, int quant) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valorVenda = valorVenda;
		this.valorCompra = valorCompra;
		this.quant = quant;
	}

	/*public Produto(int id, String descricao, float valorVenda, float valorCompra,  int quant) {
		this.id = id;
		this.descricao = descricao;
		this.quant = quant;
		this.valorCompra = valorCompra;
		this.valorVenda = valorVenda;
		
	}
	
	public Produto() {
		
	}
	*/
	
	public float getPromocao(float porcentagem) {
		return valorVenda - valorVenda * (porcentagem/100);
	}
	
	public String verificarEstoque() {
		if(quant>20) {
			return "Estoque alto";
		}else if(quant<5) {
			return "Estoque baixo";
		}else {
			return "Estoque normal";
		}
	}
	
	public void atualizarValores(float porcentagem) {
		valorVenda = valorVenda + valorVenda * (porcentagem/100);
		valorCompra = valorCompra + valorCompra * (porcentagem/100);
	}
	
	public float getTotalCompras() {
		return valorCompra * quant;
	}	
	
	public float getTotalVendas() {
		return valorVenda * quant;
	}
	
	public float getPromocao() {
		return valorVenda * (float) 0.9;
	}
	
	public String getAll() {
		return "Código " + id + "\nDecrição " + descricao + "\nValor de venda " + valorVenda + "\nValor compra " + valorCompra + "\n Quantidade " + quant;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}
	public float getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	
	
	
	
}
