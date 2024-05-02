import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		ContaBancaria conta = new ContaBancaria();
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("\nBem-vindo ao DIO Bank! \n");
		
		System.out.println("Para criar sua conta, digite seu nome:");
		conta.nomeCliente = scanner.next();
		
		double deposito;
		
		do {
			System.out.println("\nDigite um valor para o seu primeiro depósito (valor mínimo: R$ 100,00):");

			deposito = scanner.nextDouble();
			
			if(deposito < 100.0) {
				System.out.println("\nNão é possível depositar valores abaixo de R$ 100,00 como seu primeiro depósito");
			} else {
				conta.saldo = deposito;
			}

		} while(deposito < 100.0);
		
		conta.agencia = "067-8";
		
		// Generates a random number between 1000 and 9999
		conta.numero = (int) Math.floor(Math.random() * (9999 - 1000 + 1) + 1000);
		
		System.out.println("\nParabéns, " + conta.nomeCliente + ", sua conta foi criada com sucesso! \n");
		System.out.println("Sua agência é " + conta.agencia);
		System.out.println("O número da sua conta é " + conta.numero);
		System.out.println("E o seu saldo no valor de R$ " + String.format("%.2f", conta.saldo) + " já está disponível para saque.");
		System.out.println("\nObrigado por se tornar um cliente DIO Bank!");
		

	}

}
