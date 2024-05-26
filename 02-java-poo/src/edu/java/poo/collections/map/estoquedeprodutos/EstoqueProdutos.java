package edu.java.poo.collections.map.estoquedeprodutos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

	private Map<Long, Produto> estoque;
	
	public EstoqueProdutos() {
		this.estoque = new HashMap<>();
	}
	
	public void adicionarProduto(long codigo, String nome, int quantidade, double preco) {
		estoque.put(codigo, new Produto(nome, quantidade, preco));
	}
	
	public void exibirProdutos() {
		System.out.println(estoque);
	}
	
	public double calcularValorTotalEstoque() {
		double total = 0d;
		for(Produto p : estoque.values()) {
			total += p.getPreco() * p.getQuantidade();
		}
		return total;
	}
	
	public Map.Entry<Long, Produto> obterProdutoMaisCaro() {
		Map.Entry<Long, Produto> produtoMaisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		
		for(Map.Entry<Long, Produto> p : estoque.entrySet()) {
			if(p.getValue().getPreco() > maiorPreco) {
				maiorPreco = p.getValue().getPreco();
				produtoMaisCaro = p;
			}
		}
		
		return produtoMaisCaro;
	}
	
	public Map.Entry<Long, Produto> obterProdutoMaisBarato() {
		Map.Entry<Long, Produto> produtoMaisBarato = null;
		double menorPreco = Double.MAX_VALUE;
		
		for(Map.Entry<Long, Produto> p : estoque.entrySet()) {
			if(p.getValue().getPreco() < menorPreco) {
				menorPreco = p.getValue().getPreco();
				produtoMaisBarato = p;
			}
		}
		
		return produtoMaisBarato;
	}
	
	public Map.Entry<Long, Produto> obterProdutoMaiorValorTotalNoEstoque() {
		Map.Entry<Long, Produto> produtoMaiorValorTotal = null;
		double maiorValorNoEstoque = Double.MIN_VALUE;
		
		for(Map.Entry<Long, Produto> p : estoque.entrySet()) {
			if(p.getValue().getPreco() * p.getValue().getQuantidade() > maiorValorNoEstoque) {
				maiorValorNoEstoque = p.getValue().getPreco() * p.getValue().getQuantidade();
				produtoMaiorValorTotal = p;
			}
		}
		
		return produtoMaiorValorTotal;		
	}
}
