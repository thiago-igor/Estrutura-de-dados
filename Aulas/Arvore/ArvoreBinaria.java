package Aulas.Arvore;

public class ArvoreBinaria {
    
    Node root;

    public  ArvoreBinaria(int valor) {
        root = new Node(valor);
    }

    public  Node getArvoreBinaria(){
        return root;
    }

    //Metodo recursivo: 
    public void adicionaNo(Node novoNo, Node root ){
        if(novoNo.valor > root.valor){
            if(root.right != null){
                adicionaNo(novoNo, root.right);
            }else{
                root.right = novoNo;
            }
        }else{
            if(root.left != null){
                adicionaNo(novoNo, root.left);
            }
            else{
                root.left = novoNo;
            }
        }
    }

    //Imprimir em Ordem:(ERD)
    public void imprimirEmOrdem(Node root){
        if(root == null){
            return;
        }
        imprimirEmOrdem(root.left);
        System.out.print(root.valor + "\t");
        imprimirEmOrdem(root.right);
    }

}
