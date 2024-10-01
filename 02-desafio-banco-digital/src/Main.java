import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Rodolfo", "001.002.003-04", "Rua da Casa, 321, Moradia, 97000-000", Arrays.asList("(99) 98877-6655", "(11) 12233-4455", "(33) 34455-6677"));
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);
		
		cliente.imprimirCadastro();
		cliente.excluirTelefone("(11) 12233-4455");
		
		cliente.imprimirCadastro();		
		
		cc.depositar(100);
		cc.transferir(60, poupanca);
		cc.imprimirExtrato();
		
		cc.pagarBoleto(24);		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		System.out.println(cliente.toString());
	}
	
}
