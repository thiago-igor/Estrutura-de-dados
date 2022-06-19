package CursoDio.projetoNo;

public class Main {
    public static void main(String[] args) {
        
        No<String> no1 = new No<>("conteudo no1");

        No<String> no2 = new No<>("conteudo no2");
        no1.setProximoNo(no2);

        No<String> no3 = new No<>("conteudo no3");
        no2.setProximoNo(no3);

        //No1->No2->No3-> null

        System.out.println(no1);
        System.out.println(no1.getProximoNo()); // acessando o No2
        System.out.println(no2);
        System.out.println(no3);
    }
}
