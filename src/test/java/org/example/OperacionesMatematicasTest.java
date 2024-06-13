package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesMatematicasTest {

    private final OperacionesMatematicas operaciones = new OperacionesMatematicas();


    double resultado = operaciones.calcularRaizCuadrada(2);


    @Test
    public void TestRaiz() {

        if (resultado > 0) {
            assertTrue(resultado>0);
            System.out.println("Numero Es Positivo :) ");
        }
        else if (resultado < 0) {
            assertThrows(IllegalArgumentException.class, () -> {
                operaciones.calcularRaizCuadrada(resultado);
            });
        }
        else {
            assertEquals(0.0, operaciones.calcularRaizCuadrada(resultado));
            System.out.println("Numero == 0");
        }
    }
}