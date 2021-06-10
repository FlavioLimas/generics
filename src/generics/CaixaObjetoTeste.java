package generics;

public class CaixaObjetoTeste {
    public static void main(String[] args) {
        CaixaObjeto caixaA = new CaixaObjeto();

        caixaA.setCoisa(2.3); // double -> Double

        Integer coisa = (Integer) caixaA.getCoisa();
        System.out.println(coisa);
    }
}
