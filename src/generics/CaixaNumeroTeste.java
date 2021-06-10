package generics;

public class CaixaNumeroTeste {
    public static void main(String[] args) {
        
        CaixaNumero<Double> caixaA = new CaixaNumero<>();
        caixaA.setCoisa(4.654);
        System.out.println(caixaA.getCoisa());
    }
}
