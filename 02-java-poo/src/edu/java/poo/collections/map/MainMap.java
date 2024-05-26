package edu.java.poo.collections.map;

import edu.java.poo.collections.map.agendadecontatos.AgendaContatos;
import edu.java.poo.collections.map.dicionario.Dicionario;

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
	}

}
