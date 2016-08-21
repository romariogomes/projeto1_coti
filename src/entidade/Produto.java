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
			
}
