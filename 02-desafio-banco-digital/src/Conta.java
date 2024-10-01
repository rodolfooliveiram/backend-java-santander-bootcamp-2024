import lombok.Getter;

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected @Getter int agencia;
	protected @Getter int numero;
	protected @Getter double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}	

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
	}

	@Override
	public void transferir(double valor, Conta contaBeneficiario) {
		this.sacar(valor);
		contaBeneficiario.depositar(valor);
	}
	
	protected void imprimirDadosConta() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Número: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	@Override
	public void pagarBoleto(double valorBoleto) {
		if(this.saldo >= valorBoleto) {
			this.saldo -= valorBoleto;
			System.out.println("Boleto pago com sucesso!");
		} else {
			System.out.println("Você não tem saldo suficiente para realizar o pagamento.");
		}
		
	}
	
}
