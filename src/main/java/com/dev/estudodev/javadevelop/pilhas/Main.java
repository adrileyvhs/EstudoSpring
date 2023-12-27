package com.dev.estudodev.javadevelop.pilhas;

public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        for (int i = 1; i <=10 ; i++) {
            pilha.push(new No(i));
        }

        System.out.println(pilha);
        for (int i = 1; i <=1 ; i++) {
            pilha.pop();
        }
        System.out.println(pilha);
    }
}
