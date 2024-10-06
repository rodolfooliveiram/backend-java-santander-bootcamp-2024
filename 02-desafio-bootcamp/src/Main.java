import java.time.LocalDate;

import br.com.bootcamp.dominio.Curso;
import br.com.bootcamp.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();		
		curso1.setTitulo("Java com Spring Boot");
		curso1.setDescricao("Aprenda Java do básico até práticas avançadas com Spring.");
		curso1.setCargaHoraria(75);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Testes e Gestão de Dependências em Projetos Java");
		curso2.setDescricao("Aprenda testar corretamente suas aplicações e fazer a gestão de depenências do jeito certo.");
		curso2.setCargaHoraria(8);
		
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Estude e tire suas dúvidas diretamente com especialistas Java.");
		mentoria.setData(LocalDate.now());
		
		
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		

	}

}
