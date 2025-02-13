package map;

import java.util.*;

public class ExercicioProposto02 {
    public static void main(String[] args) {
        int quantidadeLancamentos = 100;

        List<Integer> valores = new ArrayList<>();
        Random randomizador = new Random();

        for (int i = 0; i < quantidadeLancamentos; i++) {
            int numero = randomizador.nextInt(6) + 1;
            valores.add(numero);
        }

        Map<Integer, Integer> lancamentoDados = new HashMap<>();

        for (Integer resultado : valores) {
            if (lancamentoDados.containsKey(resultado))
                lancamentoDados.put(resultado, (lancamentoDados.get(resultado) + 1));
            else lancamentoDados.put(resultado, 1);
        }

        System.out.println("\nValor " + " Quantidade de vezes:");

        for (Map.Entry<Integer, Integer> entry : lancamentoDados.entrySet()) {
            System.out.printf("%3d %10d\n", entry.getKey(), entry.getValue());
        }
    }
}
