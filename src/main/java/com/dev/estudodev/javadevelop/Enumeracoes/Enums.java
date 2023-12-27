package com.dev.estudodev.javadevelop.Enumeracoes;
public class Enums {
    public static void main(String[] args) {
       for(EstadoBrasileiro e : EstadoBrasileiro.values()){
           System.out.println(e.getSiglaEstado() + " - " +e.getNomeMaiusculo() + " DDD  " + e.getDdd()+ "    Codigo IBGE "+ e.getIbge()); 
       }
        EstadoBrasileiro es = EstadoBrasileiro.AC;
        System.out.println(es.getSiglaEstado() + "DDD--->  "+es.getDdd());
    }
}
