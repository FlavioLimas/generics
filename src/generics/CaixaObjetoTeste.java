package generics;

public class CaixaObjetoTeste {
    public static void main(String[] args) {
        CaixaObjeto caixaA = new CaixaObjeto();

        caixaA.setCoisa(2.3); // double -> Double

        Double coisaA = (Double) caixaA.getCoisa();
        System.out.println(coisaA);
        
        CaixaObjeto caixaB = new CaixaObjeto();
    
        caixaB.setCoisa("Olá");
    
        String coisaB = (String) caixaB.getCoisa();
        System.out.println(coisaB);
    }
}
