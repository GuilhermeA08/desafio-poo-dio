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
  }
}
