package Aulas.Arvore;

public class TesteArvore {

    public static void main(String[] args) {
        ArvoreBinaria ab = new ArvoreBinaria(20);
        ab.adicionaNo(new No(30), ab.getArvoreBinaria());
        ab.adicionaNo(new No(60), ab.getArvoreBinaria());
        ab.adicionaNo(new No(25), ab.getArvoreBinaria());
        ab.adicionaNo(new No(40), ab.getArvoreBinaria());
        ab.adicionaNo(new No(65), ab.getArvoreBinaria());

        ab.imprimirEmOrdem(ab.getArvoreBinaria());
        
    }
}
