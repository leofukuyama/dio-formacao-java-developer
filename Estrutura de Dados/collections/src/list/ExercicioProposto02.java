package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto02 {
    public static void main(String[] args) {
        List<String> respostas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Perguntas: ");
        System.out.print("\nTelefonou para a vítima? ");
        String resposta = sc.next();
        respostas.add(resposta.toLowerCase());

        System.out.print("\nEsteve no local do crime? ");
        resposta = sc.next();
        respostas.add(resposta.toLowerCase());

        System.out.print("\nMora perto da vítima? ");
        resposta = sc.next();
        respostas.add(resposta.toLowerCase());

        System.out.print("\nDevia para vítima? ");
        resposta = sc.next();
        respostas.add(resposta.toLowerCase());

        System.out.print("\nJá trabalhou com a vítima? ");
        resposta = sc.next();
        respostas.add(resposta.toLowerCase());

        System.out.println(respostas);

        int count = 0;
        Iterator<String> contador = respostas.iterator();

        while (contador.hasNext()) {
            if (contador.next().contains("s")) count++;
        }

        switch (count) {
            case 2:
                System.out.println(">> SUSPEITA <<");
                break;
            case 3:
            case 4:
                System.out.println(">> CÚMPLICE <<");
                break;
            case 5:
                System.out.println(">> ASSASSINO <<");
                break;
            default:
                System.out.println(">> INOCENTE <<");
                break;
        }
    }
}
