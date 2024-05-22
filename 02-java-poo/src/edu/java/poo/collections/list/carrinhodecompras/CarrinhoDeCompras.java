package edu.java.poo.collections.list.carrinhodecompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	List<Item> meuCarrinho;
	
	public CarrinhoDeCompras() {
		this.meuCarrinho = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		meuCarrinho.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item> itemsParaRemocao = new ArrayList<>();
		
		if(!meuCarrinho.isEmpty()) {
			for(Item i : meuCarrinho) {
				if(i.getNome().equalsIgnoreCase(nome)) {
					itemsParaRemocao.add(i);
				}
			}
			
			meuCarrinho.removeAll(itemsParaRemocao);
			
		} else {
			System.out.println("Não foi possível remover itens pois seu carrinho está vazio!");
		}
	}
	
	public void calcularValorTotal() {
		double total = 0;
		
		if(!meuCarrinho.isEmpty()) {
			for(Item i : meuCarrinho) {
				double totalItem = i.getPreco() * i.getQuantidade();
				total += totalItem;
			}
			
			System.out.println("Valor Total: R$ " + total);
			
		} else {
			System.out.println("Não foi possível calcular o valor total pois seu carrinho está vazio!");
		}
	}
	
	public void exibirItens() {
		if(!meuCarrinho.isEmpty()) {
			System.out.println(meuCarrinho);			
		} else {
			System.out.println("Seu carrinho está vazio!");
		}
	}
	
	
}
