package com.dev.estudodev.javadevelop.Enumeracoes;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.text.Normalizer;

@Getter
@AllArgsConstructor
public enum EstadoBrasileiro {
    AC("Rio Branco", "AC", 68, 12),
    AL("Maceió", "AL", 82, 27),
    AP("Macapá", "AP", 96, 16),
    AM("Manaus", "AM", 92, 13),
    BA("Salvador", "BA", 71, 29),
    CE("Fortaleza", "CE", 85, 23),
    DF("Brasília", "DF", 61, 53),
    ES("Vitória", "ES", 27, 32),
    GO("Goiânia", "GO", 62, 52),
    MA("São Luís", "MA", 98, 21),
    MT("Cuiabá", "MT", 65, 51),
    MS("Campo Grande", "MS", 67, 50),
    MG("Belo Horizonte", "MG", 31, 31),
    PA("Belém", "PA", 91, 15),
    PB("João Pessoa", "PB", 83, 25),
    PR("Curitiba", "PR", 41, 41),
    PE("Recife", "PE", 81, 26),
    PI("Teresina", "PI", 86, 22),
    RJ("Rio de Janeiro", "RJ", 21, 33),
    RN("Natal", "RN", 84, 24),
    RS("Porto Alegre", "RS", 51, 43),
    RO("Porto Velho", "RO", 69, 11),
    RR("Boa Vista", "RR", 95, 14),
    SC("Florianópolis", "SC", 48, 42),
    SP("São Paulo", "SP", 11, 35),
    SE("Aracaju", "SE", 79, 28),
    TO("Palmas", "TO", 63, 17);
    private final String nomeCidade;
    private final String siglaEstado;
    private final int ddd;
    private final int ibge;
    public   String getNomeMaiusculo(){
        return removerAcentos(nomeCidade.toUpperCase());
     }
    public static String removerAcentos(String texto) {
        if (texto == null||texto.isEmpty()) {
       return texto;
     }
        //Substitui os caracteres acentuados por caracteres não acentuados
     String textoSemAcentos = Normalizer.normalize(texto, Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
      return textoSemAcentos;
     }
   }