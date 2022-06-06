package Aulas.Arvore;

public class TesteArvore {

    public static void main(String[] args) {
        ArvoreBinaria ab = new ArvoreBinaria(20);
        ab.adicionaNo(new Node(30), ab.getArvoreBinaria());
        ab.adicionaNo(new Node(60), ab.getArvoreBinaria());
        ab.adicionaNo(new Node(25), ab.getArvoreBinaria());
        ab.adicionaNo(new Node(40), ab.getArvoreBinaria());
        ab.adicionaNo(new Node(65), ab.getArvoreBinaria());

        ab.imprimirEmOrdem(ab.getArvoreBinaria());
        
    }
}
