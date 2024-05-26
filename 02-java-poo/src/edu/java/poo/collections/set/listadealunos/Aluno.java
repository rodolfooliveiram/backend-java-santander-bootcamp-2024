package edu.java.poo.collections.set.listadealunos;

import java.util.Objects;

public class Aluno implements Comparable<Aluno> {

	private long matricula;
	private String nome;
	private double media;
	
	public Aluno(long matricula, String nome, double media) {
		this.matricula = matricula;
		this.nome = nome;
		this.media = media;
	}

	@Override
	public String toString() {
		return "[" + matricula + ", " + nome + ", " + media + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Aluno))
			return false;
		Aluno other = (Aluno) obj;
		return matricula == other.matricula;
	}

	public long getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public double getMedia() {
		return media;
	}

	@Override
	public int compareTo(Aluno a) {
		return nome.compareToIgnoreCase(a.getNome());
	}	
	
}
