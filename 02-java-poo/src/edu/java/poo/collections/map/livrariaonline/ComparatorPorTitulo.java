package edu.java.poo.collections.map.livrariaonline;

import java.util.Comparator;
import java.util.Map;

public class ComparatorPorTitulo implements Comparator<Map.Entry<String, Livro>> {

	@Override
	public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
		return l1.getValue().getTitulo().compareToIgnoreCase(l2.getValue().getTitulo());
	}

}
