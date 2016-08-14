package entidade;

public class ProdutoNaoPerecivel extends Produto {

	private Double altura;
	private Double largura;
	private Double peso;
	
	public ProdutoNaoPerecivel() {

	}

	public ProdutoNaoPerecivel(Double altura, Double largura, Double peso) {
		
		this.altura = altura;
		this.largura = largura;
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "ProdutoNaoPerecivel [altura=" + altura + ", largura=" + largura + ", peso=" + peso + "]";
	}
	
	
}
