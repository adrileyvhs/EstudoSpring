package com.dev.estudodev.Mokito;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DadosLocalizacao {
    private String uf;
    private String cidade;
    private String logradouro;
    private String complemento;
    private String bairro;
}
