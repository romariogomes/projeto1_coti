package execucao;

import entidade.Produto;
import entidade.ProdutoNaoPerecivel;

public class ExecucaoProduto {

public static void main(String[] args) {
		
		Produto p1 = new Produto();
		Double valor_desconto;
		
		p1.setNome("Carne");
		p1.setFabricante("Friboi");
		p1.setQuantidade(2);
		p1.setPreco(20.00);
		
		p1.getCategoria().setNome("Açougue");
		p1.getCategoria().setDescricao("Picanha");
		
		System.out.println(p1.toString() + "\n"); 
		System.out.println("TOTAL: R$" + p1.calculaPreco(p1.getQuantidade(), p1.getPreco()) + "\n");
		
		ProdutoNaoPerecivel p2 = new ProdutoNaoPerecivel();
		
		p2.setNome("Feijão");
		p2.setFabricante("Máximo");
		p2.setPreco(5.0);
		p2.setQuantidade(3);
		
		p2.getCategoria().setDescricao("Grãos");
		p2.getCategoria().setNome("Carioca");
		
		p2.setPeso(1.0);
		p2.setAltura(0.20);
		p2.setLargura(0.05);
		
		System.out.println(p2.toString()+ p2.toString2() + "\n");
		
		//CALCULA SUBTOTAL
		System.out.println("TOTAL: R$" + p1.calculaPreco(p1.getQuantidade(), p1.getPreco()) + "\n");
		
		//VERIFICA MAIOR PREÇO ENTRE DOIS PRODUTOS
		System.out.println(p1.maiorPreco(p1, p2));
		
		//DESCONTO FIXO 5%
		System.out.println("Preço com 5% de desconto fixo: "+ p1.calculaDesconto(p1.calculaPreco(p1.getQuantidade(), p1.getPreco())));
		
		//SETAR VALOR DESCONTO
		valor_desconto = 10.0;
		
		System.out.println("Desconto de " + valor_desconto + "% aplicado: " + p1.calculaDesconto(p1.calculaPreco(p1.getQuantidade(), p1.getPreco()), valor_desconto));
		
	}
}
