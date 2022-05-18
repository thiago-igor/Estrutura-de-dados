package Aulas.Arvore;

public class ArvoreBinaria {
    
    No raiz;

    public ArvoreBinaria(int valor) {
        raiz = new No(valor);
    }

    public No getArvoreBinaria(){
        return raiz;
    }

    //Metodo recursivo: 
    public void adicionaNo(No novoNo, No raiz ){
        if(novoNo.valor > raiz.valor){
            if(raiz.right != null){
                adicionaNo(novoNo, raiz.right);
            }else{
                raiz.right = novoNo;
            }
        }else{
            if(raiz.left != null){
                adicionaNo(novoNo, raiz.left);
            }
            else{
                raiz.left = novoNo;
            }
        }
    }

    //Imprimir em Ordem:(ERD)
    public void imprimirEmOrdem(No raiz){
        if(raiz == null){
            return;
        }
        imprimirEmOrdem(raiz.left);
        System.out.print(raiz.valor + "\t");
        imprimirEmOrdem(raiz.right);
    }

}
