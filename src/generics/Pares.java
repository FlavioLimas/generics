package generics;

import java.util.Set;
import java.util.TreeSet;

public class Pares<C extends Number, V> {
    
    private final Set<Par<C, V>> itens = new TreeSet<>();

    public void adicionar(C chave, V valor) {
        if(chave == null) return;  // = null para a execução
        Par<C, V> novoPar = new Par<C, V>(chave, valor);

        if(itens.contains(novoPar)) { // tem um valor igual no set?
            itens.remove(novoPar); // remove
        }
        itens.add(novoPar); // add novo valor OU SEJA atualiza a chave
    }
}
