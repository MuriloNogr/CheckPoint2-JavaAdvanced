package br.com.fiap.brinquedotecaonline.brinquedotecaonline.model;

import jakarta.persistence.*;
@Entity
@Table(name = "TB_BRINQUEDOS")
public class Brinquedo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_BRINQUEDO")
    private Long id;

    @Column(name = "NOME_BRINQUEDO")
    private String nome;

    @Column(name = "TIPO_BRINQUEDO")
    private String tipo;

    @Column(name = "CLASSIFICACAO_BRINQUEDO")
    private String classificacao;

    @Column(name = "TAMANHO_BRINQUEDO")
    private String tamanho;

    @Column(name = "PRECO_BRINQUEDO")
    private Double preco;

    public Brinquedo() {}

    public Brinquedo(Long id, String nome, String tipo, String classificacao, String tamanho, Double preco) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.classificacao = classificacao;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}




