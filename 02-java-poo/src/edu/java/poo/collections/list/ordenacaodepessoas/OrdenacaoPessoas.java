package edu.java.poo.collections.list.ordenacaodepessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

	private List<Pessoa> pessoasLista;
	
	public OrdenacaoPessoas() {
		this.pessoasLista = new ArrayList<>();
	}
	
	@Override
	public String toString() {
		return "OrdenacaoPessoas "
				+ pessoasLista;
	}
	
	public void exibirLista() {
		System.out.println(pessoasLista);
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoasLista.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoasLista);
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura() {
		List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoasLista);
		Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
		return pessoasPorAltura;
	}
}
