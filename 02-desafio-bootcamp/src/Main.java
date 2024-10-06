import java.time.LocalDate;

import br.com.bootcamp.dominio.Bootcamp;
import br.com.bootcamp.dominio.Curso;
import br.com.bootcamp.dominio.Dev;
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
		
		Bootcamp bootcamp = new Bootcamp();
		
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descricao do Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev dev1 = new Dev();
		dev1.setNome("Rodolfo");
		dev1.inscreverBootcamp(bootcamp);
		System.out.println("Dev: " + dev1.getNome());
		System.out.println("Conteudos Inscritos: " + dev1.getConteudosInscritos());
		dev1.progredir();
		dev1.progredir();
		dev1.progredir();
		System.out.println("Conteudos Inscritos: " + dev1.getConteudosInscritos());
		System.out.println("Conteudos Concluídos: " + dev1.getConteudosConcluidos());
		System.out.println("XP: " + dev1.calcularTotalXp());
		
		
		Dev dev2 = new Dev();
		dev2.setNome("João");	
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Dev: " + dev2.getNome());
		System.out.println("Conteudos Inscritos:" + dev2.getConteudosInscritos());
		dev2.progredir();
		System.out.println("Conteudos Inscritos: " + dev2.getConteudosInscritos());
		System.out.println("Conteudos Concluídos: " + dev2.getConteudosConcluidos());
		System.out.println("XP: " + dev2.calcularTotalXp());		

	}

}
