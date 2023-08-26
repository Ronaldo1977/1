package entities;

public class Produto {
	
	//ATRIBUTOS//
	private String nome;
	private double preco;
	private int quantidade;
		
	        //METODOS//
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;	
		
	}        
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}


	        //METODOS ADICIONAIS//

	public double valorTotalEmEstoque() {
		return preco * quantidade;
	}
	public void addProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	public void removerProduto(int quantidade) {
		this.quantidade -= quantidade;
	}


	
	public String toString() {
		return "Produto = " 
	           + nome 
	           + ", preco = R$" 
	           + String.format("%.2f", preco) 
	           + ", quantidade = " 
	           + quantidade 
	           + ", valor total = R$ "
			   + String.format("%.2f", valorTotalEmEstoque());
	}

	



   
}