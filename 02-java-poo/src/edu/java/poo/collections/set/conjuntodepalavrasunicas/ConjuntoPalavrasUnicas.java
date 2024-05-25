package edu.java.poo.collections.set.conjuntodepalavrasunicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

	Set<String> palavrasUnicasSet;
	
	public ConjuntoPalavrasUnicas() {
		this.palavrasUnicasSet = new HashSet<>();
	}
	
	public void adicionarPalavra(String palavra) {
		palavrasUnicasSet.add(palavra);
	}
	
	public void removerPalavra(String palavra) {
		palavrasUnicasSet.remove(palavra);
	}
	
	public boolean verificarPalavra(String palavra) {
		return palavrasUnicasSet.contains(palavra);
	}
	
	public void exibirPalavrasUnicas() {
		System.out.println(palavrasUnicasSet);
	}
	
}
