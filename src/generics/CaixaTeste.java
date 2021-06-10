package generics;

public class CaixaTeste {
    
    public static void main(String[] args) {
        Caixa<String> caixaA = new Caixa<>();
        caixaA.setCoisa("Segredo!");

        String coisaA = caixaA.getCoisa();
        System.out.println(coisaA);
    }
}
