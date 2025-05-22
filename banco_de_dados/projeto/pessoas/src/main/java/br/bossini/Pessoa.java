package br.bossini;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {
  private int codigo;
  private String nome;
  private String fone;
  private String email;

  public Pessoa(String nome, String fone, String email){
    this.nome = nome;
    this.fone = fone;
    this.email = email;
  }
}
