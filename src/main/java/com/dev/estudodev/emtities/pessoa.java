package com.dev.estudodev.emtities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
public class pessoa   {
    @Setter
    @Getter
    private String pessoa;
    @Getter
    private int Idade;

    public boolean Maior(int idade){
        return this.Idade >=18;
    }

    public double Multiplacao(double vl1, double vl2){
         double total= vl1*vl2;
           return total;
    }

}
