package com.dev.estudodev.javadevelop.Listas;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String>stringListaEncadeadas = new ListaEncadeada<>();
        stringListaEncadeadas.add("Teste1");
        stringListaEncadeadas.add("Teste2");
        stringListaEncadeadas.add("Teste3");
        stringListaEncadeadas.add("Teste4");
        stringListaEncadeadas.add("Teste5");
        System.out.println(stringListaEncadeadas.get(0));
        System.out.println(stringListaEncadeadas);
    }
}
