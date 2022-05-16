package Provas.Prova2;

public class TesteListaDupla {
    public static void main(String[] args) {
        ListaDuplaEncadeada listaDupla = new ListaDuplaEncadeada();

        listaDupla.addFim("Joao");
        listaDupla.addFim("Maria");
        listaDupla.addFim("Antonio");
        listaDupla.addFim("Sabrina");

        //TODO: add na frente
        listaDupla.addInicio("Gustavo");

        //TODO: add em uma posição específica um determinado no
        listaDupla.addMeio(0, "Thiago");

        //TODO: imprimir a lista com quebra de linha e o numero da posição
        System.out.println(listaDupla);

        //TODO: dizer qual posicao foi encontrado o nome?
        System.out.println(listaDupla.posicaoNome("Antonio"));
    }
}
