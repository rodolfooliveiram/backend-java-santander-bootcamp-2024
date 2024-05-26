package edu.java.poo.collections.map;

import edu.java.poo.collections.map.agendadecontatos.AgendaContatos;
import edu.java.poo.collections.map.contagemdepalavras.ContagemPalavras;
import edu.java.poo.collections.map.dicionario.Dicionario;
import edu.java.poo.collections.map.estoquedeprodutos.EstoqueProdutos;

public class MainMap {

	public static void main(String[] args) {

		AgendaContatos agendaTelefonica = new AgendaContatos();
		
		agendaTelefonica.adicionarContato("Rodolfo", 1234567);
		agendaTelefonica.adicionarContato("Renata", 7890123);
		agendaTelefonica.adicionarContato("Bruno", 3456789);
		agendaTelefonica.adicionarContato("André", 9012345);
		agendaTelefonica.adicionarContato("Rodolfo", 9012345);
		
		agendaTelefonica.exibirContatos();
		
		System.out.println(agendaTelefonica.pesquisarPorNome("Rodolfo"));
		
		agendaTelefonica.removerContato("Bruno");
		agendaTelefonica.exibirContatos();
		
		
		Dicionario dicionario = new Dicionario();
		
		dicionario.adicionarPalavra("Objeto", "Conceito da Programação Orientada a Objetos que descreve um objeto real, criado a partir de uma Classe, e que traz atributos e métodos contendo valores específicos.");
		dicionario.adicionarPalavra("Classe", "Conceito da Programação Orientada a Objetos que descreve uma abstração de um grupo de objetos reais, representados através de suas características (atributos) e comportamentos (métodos) essenciais à aplicação da qual faz parte.");
		dicionario.adicionarPalavra("Interface", "Conceito da Programação Orientada a Objetos que descreve uma classe de métodos abstratos e que devem ser implementados pela classe que a implementa.");
		dicionario.adicionarPalavra("Método", "Conceito da Programação Orientada a Objetos que descreve uma função que representa um comportamento/ação de uma classe ou objeto.");
		dicionario.adicionarPalavra("Java", "Lingaguem de programação orientada a objetos, fortemente tipada, compilada e interpretada, desenvolvida por James Gosling em 1991.");
		
		dicionario.exibirPalavras();
		
		System.out.println(dicionario.pesquisarPorPalavra("Java"));
		
		dicionario.removerPalavra("Classe");
		dicionario.exibirPalavras();
		
		dicionario.removerPalavra("Atributo");
		
		
		EstoqueProdutos estoque = new EstoqueProdutos();
		
		estoque.adicionarProduto(120l, "Monitor IPS Full-HD", 2, 699.90);
		estoque.adicionarProduto(121l, "Teclado Mecânico", 4, 249.90);
		estoque.adicionarProduto(122l, "Mouse Wireless", 3, 199.90);
		estoque.adicionarProduto(123l, "Headset", 5, 159.90);
		estoque.adicionarProduto(124l, "Notebook", 2, 3599.90);
		
		estoque.exibirProdutos();
		
		System.out.printf("Valor Total do Estoque: R$ %.2f\n", estoque.calcularValorTotalEstoque());
		
		System.out.println("Produto Mais Caro: " + estoque.obterProdutoMaisCaro());
		System.out.println("Produto Mais Barato: " + estoque.obterProdutoMaisBarato());
		System.out.println("Produto de Maior Valor Total no Estoque: " + estoque.obterProdutoMaiorValorTotalNoEstoque());
		
		
		ContagemPalavras contadorPalavras = new ContagemPalavras();
		
		contadorPalavras.adicionarPalavra("Objeto", 7);
		contadorPalavras.adicionarPalavra("Classe", 5);
		contadorPalavras.adicionarPalavra("Método", 3);
		contadorPalavras.adicionarPalavra("Atributo", 4);
		
		contadorPalavras.exibirContagemPalavras();
		contadorPalavras.encontrarPalavraMaisFrequente();
		
		contadorPalavras.removerPalavra("Classe");
		contadorPalavras.exibirContagemPalavras();
		
	}
}
