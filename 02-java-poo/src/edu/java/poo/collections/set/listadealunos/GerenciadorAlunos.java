package edu.java.poo.collections.set.listadealunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

	private Set<Aluno> alunosSet;
	
	public GerenciadorAlunos() {
		this.alunosSet = new HashSet<>();
	}
	
	public void adicionarAluno(long matricula, String nome, double media) {
		alunosSet.add(new Aluno(matricula, nome, media));
	}
	
	public void removerAluno(long matricula) {
		Aluno alunoParaRemocao = null;
		if(!alunosSet.isEmpty()) {
			for(Aluno a : alunosSet) {
				if(a.getMatricula() == matricula) {
					alunoParaRemocao = a;
					break;
				}
			}
			
			alunosSet.remove(alunoParaRemocao);
			System.out.println("Aluno removido com sucesso.");
		} else {
			System.out.println("A lista de alunos está vazia!");
		}		
	}
	
	public Set<Aluno> exibirAlunosPorNome() {
		if(!alunosSet.isEmpty()) {
			Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
			return alunosPorNome;
		} else {
			throw new RuntimeException("A lista de alunos está vazia!");
		}	
	}
	
	public Set<Aluno> exibirAlunosPorNota() {
		if(!alunosSet.isEmpty()) {
			Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
			alunosPorNota.addAll(alunosSet);
			return alunosPorNota;
		} else {
			throw new RuntimeException("A lista de alunos está vazia!");
		}
	}
	
	public void exibirAlunos() {
		System.out.println(alunosSet);
	}
}
