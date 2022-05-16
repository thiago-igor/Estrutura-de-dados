package Provas.Prova2;

public class TesteListaDupla {
    public static void main(String[] args) {
        ListaDuplaEncadeada listaDupla = new ListaDuplaEncadeada();

        listaDupla.addFim("Joao");
        listaDupla.addFim("Maria");
        listaDupla.addFim("Antonio");
        listaDupla.addMeio(0, "Thiago");
        listaDupla.addFim("Sabrina");
        System.out.println(listaDupla);

        listaDupla.posicaoNome("Thiago"); // obs: funçao nao funcioma
    }
}
