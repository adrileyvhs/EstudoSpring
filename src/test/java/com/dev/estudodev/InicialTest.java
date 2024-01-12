package com.dev.estudodev;

import com.dev.estudodev.emtities.pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class InicialTest {
 @Test
  public void testes(){
     pessoa p = new pessoa("adriley francisco almeida pereira",25);
     Assertions.assertTrue(p.Maior(18));
  }


    @Test
    public void Multipl(){
        pessoa p = new pessoa("adriley francisco almeida pereira",25);
        Assertions.assertEquals(10,p.Multiplacao(1,10));
    }
    @Test
    public void testArray(){
        int[]valor1 = {1,2,3,41,5};
        int[]valor2 = {1,2,3,41,5};

        Assertions.assertArrayEquals(valor1,valor2);


    }
}
