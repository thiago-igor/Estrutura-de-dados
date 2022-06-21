package CursoDio.ImplementacaoPilha;

public class pilha {
    
    private No refNoEntradaPilha;

    public pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo){// acrescenta no topo da pilha
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setReNo(refAuxiliar);
    }

    public No top(){ // retorna a referencia
        return refNoEntradaPilha;
    }
    
    public boolean isEmpty(){ //pilha esta nula ou nao
        if(refNoEntradaPilha == null){
            return true;
        }
        return false;
    }

}
