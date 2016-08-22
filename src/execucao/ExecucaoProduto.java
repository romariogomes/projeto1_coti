package execucao;

import entidade.Produto;
import entidade.ProdutoNaoPerecivel;

public class ExecucaoProduto {

public static void main(String[] args) {
		
		Produto p1 = new Produto();
		
		p1.setNome("Carne");
		p1.setFabricante("Friboi");
		p1.setQuantidade(2);
		p1.setPreco(20.00);
		
		p1.getCategoria().setNome("A�ougue");
		p1.getCategoria().setDescricao("Picanha");
		
		System.out.println(p1.toString() + "\n"); 
		System.out.println("TOTAL: R$" + p1.calculaPreco(p1.getQuantidade(), p1.getPreco()) + "\n");
		
		ProdutoNaoPerecivel p2 = new ProdutoNaoPerecivel();
		
		p2.setNome("Feij�o");
		p2.setFabricante("M�ximo");
		p2.setPreco(5.0);
		p2.setQuantidade(3);
		
		p2.getCategoria().setDescricao("Gr�os");
		p2.getCategoria().setNome("Carioca");
		
		p2.setPeso(1.0);
		p2.setAltura(0.20);
		p2.setLargura(0.05);
		
		System.out.println(p2.toString()+ p2.toString2() + "\n");
		System.out.println("TOTAL: R$" + p2.calculaPreco(p2.getQuantidade(), p2.getPreco()) + "\n");
		
	}
}
