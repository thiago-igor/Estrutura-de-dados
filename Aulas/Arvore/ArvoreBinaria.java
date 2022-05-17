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
        if(novoNo.valor > raiz.valor)
            if(raiz.right != null){
                adicionaNo(novoNo, raiz.right);
            }else{
                raiz.right = novoNo;
            }
    }

}
