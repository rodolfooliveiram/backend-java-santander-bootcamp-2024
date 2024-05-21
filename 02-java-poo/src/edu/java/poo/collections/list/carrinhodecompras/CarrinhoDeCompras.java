package edu.java.poo.collections.list.carrinhodecompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	List<Item> meuCarrinho = new ArrayList<>();
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		meuCarrinho.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item> itemsParaRemocao = new ArrayList<>();
		
		for(Item i : meuCarrinho) {
			if(i.getNome().equalsIgnoreCase(nome)) {
				itemsParaRemocao.add(i);
			}
		}
		
		meuCarrinho.removeAll(itemsParaRemocao);
	}
	
	public void calcularValorTotal() {
		double total = 0;
		
		for(Item i : meuCarrinho) {
			total += i.getPreco();
		}
		
		System.out.println("Valor Total: R$ " + total);
	}
	
	public void exibirItens() {
		System.out.println(meuCarrinho);
	}
	
	
}
