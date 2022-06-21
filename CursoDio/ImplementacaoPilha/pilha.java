package CursoDio.ImplementacaoPilha;

public class pilha {
    
    private No refNoEntradaPilha; // referencia de topo

    public pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo){// acrescenta no topo da pilha
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar); // o novo no se refere a quem antes era o topo
    }

    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
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

    @Override
    public String toString() {
        
        String stringRetorno = "-----------\n";
        stringRetorno += "pilha\n";
        stringRetorno +=  "-----------\n";

        No noAuxiliar = refNoEntradaPilha;

        while(true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() +"}[\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else
                break;
        }
        stringRetorno +=  "===========\n";
        return stringRetorno;
    }

    

}
