package generics;

public class Caixa<T> {

    private T coisa;

    public void setCoisa(T coisa) {
        this.coisa = coisa;
    }

    public T getCoisa() {
        return coisa;
    }
}
