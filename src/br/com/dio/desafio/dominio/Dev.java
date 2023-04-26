package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

/**
 * Dev
 */
public class Dev {

  private String nome;
  private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
  private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

  public void inscreverBootcamp(Bootcamp bootcamp) {
    this.conteudosInscritos.addAll(bootcamp.getConteudos());
    bootcamp.getDevsInscritos().add(this);
  }

  public void progredir() {
    Optional<Conteudo> conteudo = conteudosInscritos.stream().findFirst();
    if (conteudo.isPresent()) {
      conteudosConcluidos.add(conteudo.get());
      conteudosInscritos.remove(conteudo.get());
    } else {
      System.err.println("Não há conteúdos para progredir");
    }
  }

  public double calcularTotalXp() {
    return this.conteudosConcluidos.stream()
      .mapToDouble(Conteudo::calcularXp)
      .sum();
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Set<Conteudo> getConteudosInscritos() {
    return conteudosInscritos;
  }

  public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
    this.conteudosInscritos = conteudosInscritos;
  }

  public Set<Conteudo> getConteudosConcluidos() {
    return conteudosConcluidos;
  }

  public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
    this.conteudosConcluidos = conteudosConcluidos;
  }

  @Override
  public int hashCode() {
    return Objects.hash(conteudosConcluidos, conteudosInscritos, nome);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Dev dev = (Dev) obj;
    return (
      Objects.equals(conteudosConcluidos, dev.conteudosConcluidos) &&
      Objects.equals(conteudosInscritos, dev.conteudosInscritos) &&
      Objects.equals(nome, dev.nome)
    );
  }
}
