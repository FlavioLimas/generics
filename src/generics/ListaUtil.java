package generics;

import java.util.List;

public class ListaUtil {
    
    public static Object getLastItem1(List<?> lista) {
        return lista.get(lista.size() -1);
    }

    public static <T> T getLastItem2(List<T> lista) {
        return lista.get(lista.size() -1);
    }

    public static <A, B, C> C teste(A paramA, B paramB) {
        C teste = null;
        return teste;
    }
}
