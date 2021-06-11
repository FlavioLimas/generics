package generics;

import java.util.List;

public class ListaUtil {
    
    public static Object getLastItem(List<? extends Object> lista) {
        return lista.get(lista.size() -1);
    }
}
