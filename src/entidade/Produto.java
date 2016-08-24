package entidade;

public class Produto {

	private String nome;
	private String fabricante;
	private Integer quantidade;
	private Double preco; 
	private Categoria categoria;
	
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
		categoria = new Categoria();
	}
	
	public Categoria getCategoria() {
		return categoria;
	}

	public Produto(String nome, String fabricante, Integer quantidade, Double preco, String nome_cat, String desc_cat) {
		super();
		this.nome = nome;
		this.fabricante = fabricante;
		this.quantidade = quantidade;
		this.preco = preco;
		this.categoria = new Categoria(nome_cat, desc_cat);
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", fabricante=" + fabricante + ", quantidade=" + quantidade + ", preco="
				+ preco + ", \n" + categoria + "]";
	}
	
	public Double calculaPreco(Integer quantidade, Double preco) {
		
		Double total = quantidade*preco;
		return total;
		
	}
	
	public String maiorPreco (Produto p1, Produto p2) {
		
		if (p1.getPreco().equals(p2.getPreco())) {
			return p1.getNome() + " e " + p2.getNome() + " possuem preços iguais";
		} else
		
		if (p1.getPreco()>p2.getPreco()) {
			return p1.getNome() + " é o produto mais caro!";
		} else
		
		return p2.getNome() + " é o produto mais caro!";
	}
			
}
