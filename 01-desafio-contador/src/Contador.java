import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Digite o primeiro número:");
		num1 = scanner.nextInt();
		
		System.out.println("Digite o segundo número:");
		num2 = scanner.nextInt();
		
		try {
			realizarContagem(num1, num2);
		} catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
		}
			
	}
	
	static void realizarContagem(int num1, int num2) throws ParametrosInvalidosException {
		if(num2 > num1) {
			for(int i = 1; i <= num2 - num1; i++) {
				System.out.println(i);
			}
		} else {
			throw new ParametrosInvalidosException();
		}
	}
}
