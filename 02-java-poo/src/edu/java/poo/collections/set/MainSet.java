package edu.java.poo.collections.set;

import edu.java.poo.collections.set.agendadecontatos.AgendaContatos;
import edu.java.poo.collections.set.cadastrodeprodutos.CadastroProdutos;
import edu.java.poo.collections.set.conjuntodeconvidados.ConjuntoConvidados;
import edu.java.poo.collections.set.conjuntodepalavrasunicas.ConjuntoPalavrasUnicas;
import edu.java.poo.collections.set.listadealunos.GerenciadorAlunos;
import edu.java.poo.collections.set.listadetarefas.ListaTarefas;

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
		
		
		AgendaContatos meusContatos = new AgendaContatos();
		
		meusContatos.adicionarContato("Rodolfo O.", 123456);
		meusContatos.adicionarContato("Renata G.", 789012);
		meusContatos.adicionarContato("Lucas A.", 345678);
		meusContatos.adicionarContato("Carlos C.", 901234);
		meusContatos.adicionarContato("Rodolfo A.", 123456); // Contato não adicionado porque tem outro contato com o mesmo telefone
		meusContatos.adicionarContato("Rodolfo O.", 567890);
		
		meusContatos.exibirContatos();
		
		System.out.println(meusContatos.atualizarTelefoneContato("Rodolfo O.", 567890));
		
		meusContatos.exibirContatos();
		
		System.out.println(meusContatos.pesquisarPorNome("Rodolfo"));

		
		ListaTarefas minhasTarefas = new ListaTarefas();
		
		minhasTarefas.adicionarTarefa("Fazer exercícios de Java.");
		minhasTarefas.adicionarTarefa("Resolver desafios de algoritmos.");
		minhasTarefas.adicionarTarefa("Listar ideias para projeto pessoal.");
		minhasTarefas.adicionarTarefa("Reformular currículo.");
		
		minhasTarefas.exibirTarefas();
		
		minhasTarefas.removerTarefa("Reformular currículo.");
		
		minhasTarefas.exibirTarefas();
		
		System.out.println(minhasTarefas.contarTarefas());
		
		minhasTarefas.marcarTarefaConcluida("Fazer exercícios de Java.");
		minhasTarefas.marcarTarefaConcluida("Resolver desafios de algoritmos.");
		
		minhasTarefas.exibirTarefas();
		
		System.out.println(minhasTarefas.obterTarefasConcluidas());
		System.out.println(minhasTarefas.obterTarefasPendentes());
		
		minhasTarefas.limparListaTarefas();
		minhasTarefas.exibirTarefas();
		
		
		CadastroProdutos produtos = new CadastroProdutos();
		
		produtos.adicionarProduto(1L, "Monitor IPS Full-HD", 699.90, 2);
		produtos.adicionarProduto(10L, "Teclado Mecânico", 249.90, 4);
		produtos.adicionarProduto(11L, "Mouse Wireless", 199.90, 3);
		produtos.adicionarProduto(100L, "Headset", 159.90, 5);
		produtos.adicionarProduto(101L, "Notebook", 3599.90, 2);
		
		System.out.println(produtos.exibirProdutosPorNome());
		System.out.println(produtos.exibirProdutosPorPreco());
		
		
		GerenciadorAlunos alunosSet = new GerenciadorAlunos();
		
		alunosSet.adicionarAluno(2345l, "Rodolfo", 9.8);
		alunosSet.adicionarAluno(6789l, "Renata", 10.0);
		alunosSet.adicionarAluno(6789l, "Carlos", 8.5); // Aluno não adicionado porque a matrícula já existe
		alunosSet.adicionarAluno(0123l, "Lucas", 6.5);
		alunosSet.adicionarAluno(4567l, "André", 7.0);
		
		System.out.println(alunosSet.exibirAlunosPorNome());
		System.out.println(alunosSet.exibirAlunosPorNota());
		
		alunosSet.removerAluno(0123l);
		alunosSet.exibirAlunos();
		
	}

}
