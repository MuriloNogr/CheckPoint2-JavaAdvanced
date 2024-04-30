package br.com.fiap.brinquedotecaonline.brinquedotecaonline.controller.dto;

import jakarta.validation.constraints.NotBlank;
public class BrinquedoDTO {

        @NotBlank
        private String nome;

        @NotBlank
        private String tipo;

        @NotBlank
        private String classificacao;

        @NotBlank
        private String tamanho;

        @NotBlank
        private Double preco;

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
