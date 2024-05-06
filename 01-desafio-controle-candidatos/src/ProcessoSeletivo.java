import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;


public class ProcessoSeletivo {
	public static void main(String[] args) {
		
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
		int index = 0;
		
		ArrayList<Double> lista_pretensao_salarial = new ArrayList<>();
		ArrayList<String> lista_candidatos_selecionados = new ArrayList<>();
	
		while(lista_candidatos_selecionados.size() <= 5 &&  index < candidatos.length) {
			double pretensao_salarial = gerarPretensaoSalarial();
			
			boolean candidato_selecionado = verificarPrestensaoSalarial(pretensao_salarial);
			
			if(candidato_selecionado) {
				lista_pretensao_salarial.add(pretensao_salarial);
				lista_candidatos_selecionados.add(candidatos[index]);
			}
			
			index++;
		}
		
		listarCandidatosSelecionados(lista_candidatos_selecionados, lista_pretensao_salarial);
		contactarCandidato(lista_candidatos_selecionados);
		
	}
	
	
	
	static boolean verificarPrestensaoSalarial(double pretensao_salarial) {
		
		double salario_base = 2000.0;
		
		if(pretensao_salarial < salario_base) {
			System.out.println("Ligar para o candidato.");
			return true;
		} else if(pretensao_salarial == salario_base) {
			System.out.println("Ligar para o candidato com contraproposta.");
			return true;
		} else {
			System.out.println("Aguardar resultado dos demais candidatos");
			return false;
		}
	}
	
	static double gerarPretensaoSalarial() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	static void listarCandidatosSelecionados(ArrayList<String> candidatos_selecionados, ArrayList<Double> lista_pretensao_salarial) {
		System.out.println("Lista dos Candidatos Selecionados:");
		
		for(int i = 0; i < candidatos_selecionados.size(); i++) {
			System.out.println("Nome: " + candidatos_selecionados.get(i) + " / Pretensão Salarial: " + lista_pretensao_salarial.get(i));
		}
	}
	
	static void contactarCandidato(ArrayList<String> candidatos_selecionados) {
		for(int i = 0; i < candidatos_selecionados.size(); i++) {
			System.out.println("Tentando contato com o candidato " + candidatos_selecionados.get(i) + "...");
			
			boolean contato_realizado = false;
			int tentativa = 0;
			Random random = new Random();
			
			do {
				contato_realizado = random.nextBoolean();
				tentativa++;
			} while(contato_realizado == false && tentativa < 3);
			
			if(contato_realizado) {
				System.out.println("Contato com o candidato " + candidatos_selecionados.get(i) + " realizado com sucesso após " + tentativa + " tentativa(s).");
			} else {
				System.out.println("Não foi possível contactar o candidato " + candidatos_selecionados.get(i) + ".");
			}
		}
	}
}
