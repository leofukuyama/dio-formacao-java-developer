package set;

import java.util.Comparator;

public class ComparatorAnoNome implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int anoDeCriacao = Integer.compare(o1.anoDeCriacao, o2.anoDeCriacao);
        if (anoDeCriacao != 0) return anoDeCriacao;

        return o1.nome.compareToIgnoreCase(o2.nome);
    }
}
