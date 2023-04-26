import br.com.dio.desafio.dominio.*;
import java.time.LocalDate;

public class Main {

  public static void main(String[] args) throws Exception {
    Curso curso1 = new Curso();
    curso1.setTitulo("Curso Java Básico");
    curso1.setDescricao("Descrição do curso de Java básico");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("Curso Java Intermediário");
    curso2.setDescricao("Descrição do curso de Java intermediário");
    curso2.setCargaHoraria(16);

    Mentoria mentoria1 = new Mentoria();
    mentoria1.setTitulo("Mentoria de Java");
    mentoria1.setDescricao("Descrição da mentoria de Java");
    mentoria1.setData(LocalDate.now());

    Mentoria mentoria2 = new Mentoria();
    mentoria2.setTitulo("Mentoria de JavaScript");
    mentoria2.setDescricao("Descrição da mentoria de JavaScript");
    mentoria2.setData(LocalDate.now());

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao("Descrição do bootcamp Java Developer");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria1);
    bootcamp.getConteudos().add(mentoria2);

    Dev dev1 = new Dev();
    dev1.setNome("João");
    dev1.inscreverBootcamp(bootcamp);
    System.out.println(
      "Conteúdos Inscritos João: " + dev1.getConteudosInscritos()
    );

    dev1.progredir();
    dev1.progredir();
    System.out.println("-");
    System.out.println(
      "Conteúdos Inscritos João: " + dev1.getConteudosInscritos()
    );
    System.out.println(
      "Conteúdos Concluídos João: " + dev1.getConteudosConcluidos()
    );

    System.out.println("--------------------------------");

    Dev dev2 = new Dev();
    dev2.setNome("Pedro");
    dev2.inscreverBootcamp(bootcamp);

    dev2.progredir();
    dev2.progredir();
    dev2.progredir();
    dev2.progredir();
    System.out.println("-");
    System.out.println(
      "Conteúdos Inscritos Pedro: " + dev2.getConteudosInscritos()
    );
    System.out.println(
      "Conteúdos Concluídos Pedro: " + dev2.getConteudosConcluidos()
    );
  }
}
