package com.dev.estudodev.Mokito;
import java.time.LocalDate;
    import lombok.Getter;
    import lombok.Setter;
    @Getter
    @Setter
    public class Pessoa {
        private String nome;
        private String documento;
        private LocalDate nascimento;
        private DadosLocalizacao endereco;

        public Pessoa(final String nome, final String documento, final LocalDate nascimento) {
            this.nome = nome;
            this.documento = documento;
            this.nascimento = nascimento;
        }
        public void adicionaDadosDeEndereco(DadosLocalizacao dadosLocalizacao) {
            this.endereco = dadosLocalizacao;
        }
}
