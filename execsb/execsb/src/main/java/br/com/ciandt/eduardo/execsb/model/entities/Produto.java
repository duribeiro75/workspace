package br.com.ciandt.eduardo.execsb.model.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    private String nome;
    @Min(value = 0)
    private double preco;
    @Min(0)
    @Max(1)
    private double desconto;

    public Produto(int id) {
        this.id = id;
    }

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }
}
