package map;

import java.util.Comparator;
import java.util.Map;

public class ComparatorPaginas implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> o1, Map.Entry<String, Livro> o2) {
        return o1.getValue().getPaginas().compareTo(o2.getValue().getPaginas());
    }
}
