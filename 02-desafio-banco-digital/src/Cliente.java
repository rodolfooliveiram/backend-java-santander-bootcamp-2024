import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
public class Cliente {
	
	private @Getter @Setter String nome;
	private @Getter @Setter String cpf;
	private @Getter @Setter String endereco;
	private @Getter List<String> telefones;
	
	public Cliente(String nome, String cpf, String endereco, List<String> telefones) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefones = telefones;
	}
	
	public void adicionarNovoTelefone(String telefone) {
		this.telefones.add(telefone);
		System.out.println("Novo número adicionado com sucesso!");
	}
	
	public void excluirTelefone(String telefone) {
		List<String> telefonesAtualizados = this.telefones.stream().filter(n -> n != telefone).toList();
		this.telefones = telefonesAtualizados;
		System.out.println("Número excluído.");
	}
	
	public void imprimirCadastro() {
		System.out.println("=== Cadastro Cliente ===");
		System.out.println(String.format("Nome: %s", this.nome));
		System.out.println(String.format("CPF: %s", this.cpf));
		System.out.println(String.format("Endereço: %s", this.endereco));
		System.out.println("Telefone(s): ");
		for(String numero : telefones) {
			System.out.println(numero);
		}		
	}
	
}
