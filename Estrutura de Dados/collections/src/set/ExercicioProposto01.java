package set;

import java.util.*;

public class ExercicioProposto01 {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto contendo as cores do arco-íris:");

        Set<String> coresArcoIris = new HashSet<>();

        coresArcoIris.add("violeta");
        coresArcoIris.add("anil");
        coresArcoIris.add("azul");
        coresArcoIris.add("verde");
        coresArcoIris.add("amarelo");
        coresArcoIris.add("laranja");
        coresArcoIris.add("vermelho");

        System.out.println(coresArcoIris);

        System.out.println("\nExiba todas as cores do arco-íris um abaixo da outra:");
        for (String cor : coresArcoIris) System.out.println(cor);

        System.out.println("\nA quantidade de cores que o arco-íris tem: " + coresArcoIris.size());

        System.out.println("\nExiba as cores em ordem alfabética:");
        Set<String> coresArcoIrisOrdem = new TreeSet<>(coresArcoIris);
        System.out.println(coresArcoIrisOrdem);

        System.out.println("\nExiba as cores na ordem inversa da que foi informada:");
        Set<String> coresArcoIrisInverso = new LinkedHashSet<>(coresArcoIris);

        System.out.println(coresArcoIrisInverso);

        List<String> coresArcoIrisInversoList = new ArrayList<>(coresArcoIrisInverso);
        Collections.reverse(coresArcoIrisInversoList);

        System.out.println(coresArcoIrisInversoList);

        System.out.println("\nExiba todas as cores que começam com a letra 'v':");
        for (String cor : coresArcoIris) {
            if (cor.startsWith("v")) System.out.println(cor);
        }

        System.out.println("\nRemova todas as cores que não começam com a letra 'v':");
        Iterator<String> iterator = coresArcoIris.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().startsWith("v")) iterator.remove();
        }

        System.out.println(coresArcoIris);

        System.out.println("\nLimpe o conjunto:");
        coresArcoIris.clear();

        System.out.println("Confira se o conjunto está vazio: " + coresArcoIris.isEmpty());
    }
}
