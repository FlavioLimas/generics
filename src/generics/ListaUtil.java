package generics;

import java.util.List;

public class ListaUtil {
    
    public static Object getLastItem(List<?> lista) {
        return lista.get(lista.size() -1);
    }

    public static <T> T getLastItemNew(List<T> lista) {
        return lista.get(lista.size() -1);
    }
}
