package edu.leonardo.primeirodia;

public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Olá turma, sejam bem-vindos");

        final String BR = "Brasil";
        // BR = "Brazil"; Exibe erro

        String meuNome = "Leonardo";
        int anoFabricacao = 2025;
        boolean verdadeira = true;
        anoFabricacao = 2018;

        String primeiroNome = "Leonardo";
        String segundoNome = "Oliveira";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
