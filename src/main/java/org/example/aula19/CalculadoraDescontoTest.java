package org.example.aula19;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculadoraDescontoTest {
    @Test
    void deveRetornarValorSemDesconto(){
        CalculadoraDesconto calculadora = new CalculadoraDesconto(); //arrange
        double resultado = calculadora.aplicarDesconto(50.0, false); //act
        assertEquals(50.0, resultado, 0.001); //assert
    }

    @Test
    void deveAplicarDescontoParaClienteVip(){
        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        double resultado = calculadora.aplicarDesconto(200.0, true);
        assertEquals(180.0, resultado, 0.001);
    }

    @Test
    void deveLancarExcecaoParaValorNegativo(){
        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        assertThrows(IllegalArgumentException.class,
                () -> calculadora.aplicarDesconto(-10, false));
    }
}
