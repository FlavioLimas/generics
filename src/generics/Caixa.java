package generics;

public class Caixa<TIPO> {

    private TIPO coisa;

    public void setCoisa(TIPO coisa) {
        this.coisa = coisa;
    }

    public TIPO getCoisa() {
        return coisa;
    }
}
