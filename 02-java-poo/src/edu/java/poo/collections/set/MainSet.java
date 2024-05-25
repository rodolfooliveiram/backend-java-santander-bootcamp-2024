package edu.java.poo.collections.set;

import edu.java.poo.collections.set.agendadecontatos.AgendaContatos;
import edu.java.poo.collections.set.conjuntodeconvidados.ConjuntoConvidados;
import edu.java.poo.collections.set.conjuntodepalavrasunicas.ConjuntoPalavrasUnicas;
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
		meusContatos.adicionarContato("Rodolfo A.", 123456);
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
		
	}

}
