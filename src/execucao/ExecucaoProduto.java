package execucao;

import entidade.Produto;

public class ExecucaoProduto {

public static void main(String[] args) {
		
		Produto p1 = new Produto();
		
		p1.setNome("Carne");
		p1.setFabricante("Friboi");
		p1.setQuantidade(2);
		p1.setPreco(20.00);
		
		p1.getCategoria().setNome("Açougue");
		p1.getCategoria().setDescricao("Picanha");
		
		System.out.println(p1.toString()); 
	}
}
