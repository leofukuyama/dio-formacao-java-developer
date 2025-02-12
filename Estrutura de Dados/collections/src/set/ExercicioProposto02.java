package set;

import java.util.*;

public class ExercicioProposto02 {
    public static void main(String[] args) {
        Set<LinguagemFavorita> minhasLinguagensFavoritas = new HashSet<>();

        minhasLinguagensFavoritas.add(new LinguagemFavorita("Python", 1991, "Pycharm"));
        minhasLinguagensFavoritas.add(new LinguagemFavorita("JavaScript", 1995, "IntelliJ"));
        minhasLinguagensFavoritas.add(new LinguagemFavorita("Java", 1991, "Visual Studio Code"));

        System.out.println("--------\tOrdem de Inserção\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritasLinked = new LinkedHashSet<>(
                Arrays.asList(
                        new LinguagemFavorita("Python", 1991, "Pycharm"),
                        new LinguagemFavorita("JavaScript", 1995, "IntelliJ"),
                        new LinguagemFavorita("Java", 1991, "Visual Studio Code")
                )
        );

        for (LinguagemFavorita linguagemFavorita : minhasLinguagensFavoritasLinked)
            System.out.println(linguagemFavorita);

        System.out.println("\n--------\tOrdem Natural: Nome\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritasNome = new TreeSet<>(minhasLinguagensFavoritas);

        for (LinguagemFavorita linguagemFavorita : minhasLinguagensFavoritasNome)
            System.out.println(linguagemFavorita);

        System.out.println("\n--------\tOrdem IDE\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritasIde = new TreeSet<>(new ComparatorIDE());
        minhasLinguagensFavoritasIde.addAll(minhasLinguagensFavoritas);

        for (LinguagemFavorita linguagemFavorita : minhasLinguagensFavoritasIde) System.out.println(linguagemFavorita);

        System.out.println("\n--------\tOrdem Ano de Criacao e Nome\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritasAnoNome = new TreeSet<>(new ComparatorAnoNome());
        minhasLinguagensFavoritasAnoNome.addAll(minhasLinguagensFavoritas);

        for (LinguagemFavorita linguagemFavorita : minhasLinguagensFavoritasAnoNome)
            System.out.println(linguagemFavorita);

        System.out.println("\n--------\tOrdem Nome - Ano de Criacao - IDE\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritasNomeAnoIde = new TreeSet<>(new ComparatorNomeAnoIDE());
        minhasLinguagensFavoritasNomeAnoIde.addAll(minhasLinguagensFavoritas);

        for (LinguagemFavorita linguagemFavorita: minhasLinguagensFavoritasNomeAnoIde)
            System.out.println(linguagemFavorita);
    }
}
