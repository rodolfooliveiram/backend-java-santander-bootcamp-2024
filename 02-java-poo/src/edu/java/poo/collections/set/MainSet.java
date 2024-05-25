package edu.java.poo.collections.set;

import edu.java.poo.collections.set.conjuntodeconvidados.ConjuntoConvidados;
import edu.java.poo.collections.set.conjuntodepalavrasunicas.ConjuntoPalavrasUnicas;

public class MainSet {

	public static void main(String[] args) {

		ConjuntoConvidados listaConvidados = new ConjuntoConvidados();
		
		listaConvidados.adicionarConvidado("Rodolfo", 1);
		listaConvidados.adicionarConvidado("Renata", 2);
		listaConvidados.adicionarConvidado("Laura", 2);
		listaConvidados.adicionarConvidado("Pedro", 3);
		listaConvidados.adicionarConvidado("Lucas", 4);
		
		listaConvidados.exibirConvidados();
		
		listaConvidados.removerConvidado(1);
		listaConvidados.exibirConvidados();
		
		System.out.println(listaConvidados.contarConvidados());	
		
		
		ConjuntoPalavrasUnicas palavrasUnicasSet = new ConjuntoPalavrasUnicas();
		
		palavrasUnicasSet.adicionarPalavra("Objeto");
		palavrasUnicasSet.adicionarPalavra("Classe");
		palavrasUnicasSet.adicionarPalavra("Interface");
		palavrasUnicasSet.adicionarPalavra("Método");
		palavrasUnicasSet.adicionarPalavra("Java");
		
		palavrasUnicasSet.exibirPalavrasUnicas();

	}

}
