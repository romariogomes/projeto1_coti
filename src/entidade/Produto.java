package entidade;

public class Produto {

	private String nome;
	private String fabricante;
	private Integer quantidade;
	private Double preco; 
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Produto() {
		
	}

	public Produto(String nome, String fabricante, Integer quantidade, Double preco) {
		super();
		this.nome = nome;
		this.fabricante = fabricante;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", fabricante=" + fabricante + ", quantidade=" + quantidade + ", preco="
				+ preco + "]";
	}
	
	
	
}
