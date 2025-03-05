package exceptions;

import javax.swing.*;

public class ExceptionCustomizada_2 {
    public static void main(String[] args) {
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++) {
            try {
                if (numerador[i] % 2 != 0)
                    throw new DivisaoNaoExataException("Divisão não exata!", numerador[i], denominador[i]);

                if (denominador[i] == 0)
                    throw new DivisaoPorZeroException("Divisão por zero!", numerador[i], denominador[i]);

                if (numerador.length - 1 == i) {
                    throw new TamanhoDoArrayException("Tamanho do Array Excedido!");
                }

                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);

            } catch (DivisaoNaoExataException | DivisaoPorZeroException | TamanhoDoArrayException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

        System.out.println("O programa continua...");
    }
}