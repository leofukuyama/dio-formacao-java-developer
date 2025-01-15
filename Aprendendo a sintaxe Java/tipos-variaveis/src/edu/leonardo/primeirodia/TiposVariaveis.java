package edu.leonardo.primeirodia;

public class TiposVariaveis {
    public static void main(String[] args) {
        double salarioMinimo = 2500; // 2.500 não é dois mil e quinhentos, e sim dois e meio
        long cpf = 12345678900L; // Deve-se utilizar o L no final para indicar tipo long
        float pi = 3.14F; // Deve-se utilizar o F no final para indicar tipo float

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // Casting de número, causa possíveis erros de precisão. Não é boa prática

        // Declaração de constantes - Sempre em caixa alta e utilizar final
        final double VALOR_DE_PI = 3.14;


    }
}
