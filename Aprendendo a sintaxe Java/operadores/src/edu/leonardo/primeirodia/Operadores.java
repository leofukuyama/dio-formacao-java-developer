package edu.leonardo.primeirodia;

public class Operadores {
    public static void main(String[] args) {
        //classe Operadores.java
        String nomeCompleto = "LINGUAGEM" + "JAVA";

        //qual o resultado das expressoes abaixo?
        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

        int numero = 15;
        numero = -numero;
        System.out.println(-numero);
        numero = -numero;
        System.out.println(numero);

        // x repetições
        int valor = 5;
        valor++; // O mesmo de valor = valor + 1 ou valor += 1
        System.out.println(valor);

        System.out.println(valor++);
        System.out.println(valor);
        System.out.println(++valor);
        System.out.println(valor);

        System.out.println();

        System.out.println(valor--);
        System.out.println(valor);
        System.out.println(--valor);
        System.out.println(valor);

        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);
        System.out.println(!variavel);

        int a, b;
        a = 16;
        b = 16;

        String resultado = a == b ? "verdadeiro" : "falso";
        System.out.println(resultado);

        int numero1 = 1;
        int numero2 = 2;

        if (numero1 < numero2) {
            System.out.println("a nossa condição é verdadeira");
        }

        boolean simNao = numero1 == numero2;
        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numeroUm é maior que numeroDois? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        String nomeUm = "Leonardo";
        String nomeDois = new String("Leonardo");

        System.out.println(nomeUm.equals(nomeDois));

        System.out.println();

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && (7 > 4)) {
            System.out.println("as duas condinções são verdadeiras");
        }

        if (condicao1 || condicao2) {
            System.out.println("Uma das condinções é verdadeira");
        }

        System.out.println("fim");

    }
}
