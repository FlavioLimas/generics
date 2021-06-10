package generics;

public class CaixaTeste {
    
    public static void main(String[] args) {
        Caixa<String> caixaA = new Caixa<>();
        caixaA.setCoisa("Segredo!");

        String coisaA = caixaA.getCoisa();
        System.out.println(coisaA);
        
        Caixa<Double> caixaB = new Caixa<>();
        caixaB.setCoisa(8.654897);

        Double coisaB = caixaB.getCoisa();
        System.out.println(coisaB);
    }
}
