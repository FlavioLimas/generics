package generics;

public class CaixaIntTeste {
    
    public static void main(String[] args) {
        
        CaixaInt<String> caixaA = new CaixaInt<>();
        caixaA.setCoisa("Teste");
    
        String coisaA = caixaA.getCoisa();
        System.out.println(coisaA);
    }
}
