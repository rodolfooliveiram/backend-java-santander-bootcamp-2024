
public interface IConta {

	void depositar(double valor);	
	void sacar(double valor);	
	void transferir(double valor, Conta contaBeneficiario);	
	void imprimirExtrato();	
	void pagarBoleto(double valorBoleto);
}
