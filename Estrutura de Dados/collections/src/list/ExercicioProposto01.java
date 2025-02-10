package list;

/*Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();

        double soma = 0d;

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite a temperatura do mês " + (i + 1) + ": ");
            double temp = sc.nextDouble();

            temperaturas.add(temp);
            soma += temp;
        }

        System.out.println("-------------------------------");

        double mediaTemperatura = soma / temperaturas.size();

        for (int i = 0; i < temperaturas.size(); i++) {
            if(temperaturas.get(i) > mediaTemperatura) {

                switch (i) {
                    case 0:
                        System.out.println((i + 1) + " - JANEIRO: " + temperaturas.get(i) + " ºC");
                        break;
                    case 1:
                        System.out.println((i + 1) + " - FEVEREIRO: " + temperaturas.get(i) + " ºC");
                        break;
                    case 2:
                        System.out.println((i + 1) + " - MARÇO: " + temperaturas.get(i) + " ºC");
                        break;
                    case 3:
                        System.out.println((i + 1) + " - ABRIL: " + temperaturas.get(i) + " ºC");
                        break;
                    case 4:
                        System.out.println((i + 1) + " - MAIO: " + temperaturas.get(i) + " ºC");
                        break;
                    case 5:
                        System.out.println((i + 1) + " - JUNHO: " + temperaturas.get(i) + " ºC");
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
