package org.example;

public class OperacionesMatematicas {
    public double calcularRaizCuadrada(double numero) {
        if (numero < 0) {
            System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo");
            return numero;
        }
        return Math.sqrt(numero);
    }
}
