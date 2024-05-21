import edu.java.poo.collections.list.carrinhodecompras.CarrinhoDeCompras;
import edu.java.poo.collections.list.listadetarefas.ListaTarefas;

public class Main {

	public static void main(String[] args) {
		
		ListaTarefas minhaLista = new ListaTarefas();
		
		minhaLista.adicionarTarefa("Tarefa 1");
		minhaLista.adicionarTarefa("Tarefa 2");
		minhaLista.adicionarTarefa("Tarefa 3");
		minhaLista.adicionarTarefa("Tarefa 4");
		minhaLista.adicionarTarefa("Tarefa 1");
		
		
		minhaLista.obterDescricoesTarefas();
		
		minhaLista.removerTarefa("Tarefa 1");
		
		minhaLista.obterDescricoesTarefas();
		
		CarrinhoDeCompras meuCarrinho = new CarrinhoDeCompras();
		
		meuCarrinho.adicionarItem("iPad 9 Wi-Fi 256gb", 2490.90, 2);
		meuCarrinho.adicionarItem("Macbook Pro 16' 16gb RAM 1TB SSD", 3990.90, 1);
		meuCarrinho.adicionarItem("Attack Shark K68 RGB Mechanical Keyboard", 49.90, 1);
				
		meuCarrinho.exibirItens();
		
		meuCarrinho.removerItem("iPad 9 Wi-Fi 256gb");
		
		meuCarrinho.exibirItens();
		meuCarrinho.calcularValorTotal();
		
	}

}
