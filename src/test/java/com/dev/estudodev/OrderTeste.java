package com.dev.estudodev;


import org.apiguardian.api.API;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderTeste {
    @Order(4)
    @Test
    void validarFluxoA(){
     Assertions.assertTrue(true);
    }
    @Order(3)
    @Test
    void validarFluxoB(){
        Assertions.assertTrue(true);
    }
    @Order(1)
    @Test
    void validarFluxoC(){
        Assertions.assertTrue(true);
    }
    @Order(2)
    @Test
    void validarFluxoD(){
        Assertions.assertTrue(true);
    }

}
