package edu.java.poo.collections.list;
import edu.java.poo.collections.list.carrinhodecompras.CarrinhoDeCompras;
import edu.java.poo.collections.list.catalogodelivros.CatalogoLivros;
import edu.java.poo.collections.list.listadetarefas.ListaTarefas;
import edu.java.poo.collections.list.ordenacaodenumeros.OrdenacaoNumeros;
import edu.java.poo.collections.list.ordenacaodepessoas.OrdenacaoPessoas;
import edu.java.poo.collections.list.somanumeros.SomaNumeros;

public class MainList {

	public static void main(String[] args) {
		
		// Lista de Tarefas
		ListaTarefas minhaLista = new ListaTarefas();
		
		minhaLista.adicionarTarefa("Tarefa 1");
		minhaLista.adicionarTarefa("Tarefa 2");
		minhaLista.adicionarTarefa("Tarefa 3");
		minhaLista.adicionarTarefa("Tarefa 4");
		minhaLista.adicionarTarefa("Tarefa 1");
				
		minhaLista.obterDescricoesTarefas();		
		minhaLista.removerTarefa("Tarefa 1");		
		minhaLista.obterDescricoesTarefas();
		
		
		// Carrinho de Compras
		CarrinhoDeCompras meuCarrinho = new CarrinhoDeCompras();
		
		meuCarrinho.adicionarItem("iPad 9 Wi-Fi 256gb", 2490.90, 2);
		meuCarrinho.adicionarItem("Macbook Pro 16' 16gb RAM 1TB SSD", 3990.90, 1);
		meuCarrinho.adicionarItem("Attack Shark K68 RGB Mechanical Keyboard", 49.90, 1);
				
		meuCarrinho.exibirItens();
		
		meuCarrinho.removerItem("iPad 9 Wi-Fi 256gb");
		
		meuCarrinho.exibirItens();
		meuCarrinho.calcularValorTotal();
		
		
		// Catálogo de Livros
		CatalogoLivros meusLivros = new CatalogoLivros();
		
		meusLivros.adicionarLivro("Duna", "Frank Herbert", 1965);
		meusLivros.adicionarLivro("Senhor dos Anéis", "J.R.R. Tolkien", 1954);
		meusLivros.adicionarLivro("O Hobbit", "J.R.R. Tolkien", 1937);
		meusLivros.adicionarLivro("A Educação da Vontade", "Jules Payot", 1894);
		meusLivros.adicionarLivro("Ponto de Inflexão", "Flávio Augusto", 2019);
		
		System.out.println(meusLivros.pesquisarPorAutor("J.R.R. Tolkien"));
		System.out.println(meusLivros.pesquisarPorIntervaloAnos(1950, 1970));
		System.out.println(meusLivros.pesquisarPorTitulo("Duna"));
		
		
		// Soma Números
		SomaNumeros soma = new SomaNumeros();
		
		soma.adicionarNumero(2);
		soma.adicionarNumero(4);
		soma.adicionarNumero(8);
		soma.adicionarNumero(16);
		
		System.out.println(soma.calcularSoma());
		System.out.println(soma.encontrarMaiorNumero());
		System.out.println(soma.encontrarMenorNumero());
		System.out.println(soma.exibirNumeros());
		System.out.println(soma);
		
		
		// Ordenação de Pessoas
		OrdenacaoPessoas listaPessoas = new OrdenacaoPessoas();
		
		listaPessoas.adicionarPessoa("Rodolfo", 32, 1.69);
		listaPessoas.adicionarPessoa("Renata", 30, 1.53);
		listaPessoas.adicionarPessoa("Pedro", 24, 1.72);
		
		System.out.println(listaPessoas.ordenarPorIdade());
		System.out.println(listaPessoas.ordenarPorAltura());
		
		
		// Ordenação de Números
		OrdenacaoNumeros listaNumeros = new OrdenacaoNumeros();
		
		listaNumeros.adicionarNumero(2);
		listaNumeros.adicionarNumero(6);
		listaNumeros.adicionarNumero(20);
		listaNumeros.adicionarNumero(4);
		listaNumeros.adicionarNumero(8);
		
		System.out.println(listaNumeros.getListaNumeros());
		System.out.println(listaNumeros.ordenarAscendente());
		System.out.println(listaNumeros.ordenarDescendente());
		
	}

}
