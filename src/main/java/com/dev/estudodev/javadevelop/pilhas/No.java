package com.dev.estudodev.javadevelop.pilhas;
import lombok.*;
@Getter
@Setter
@ToString
@AllArgsConstructor
public class No<T> {
    private int dado;
    private No refNo = null;
    public No(int dado) {
        this.dado = dado;
    }
}
