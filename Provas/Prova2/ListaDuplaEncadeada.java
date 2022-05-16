package Provas.Prova2;

public class ListaDuplaEncadeada {
    No inicio;
    No fim;
    int tamanho;

    public void addInicio(String info){
        No no = new No(info);
        no.info = info;
        no.anterior =null;
        no.proximo = inicio;
        if(inicio != null){
            inicio.anterior = no;
        }
        inicio = no;
        if(tamanho == 0){
            fim = inicio;
        }
        tamanho++;

    }

    public void addFim(String info){
        No no = new No(info);
        no.info = info;
        no.proximo = null;
        no.anterior = fim;
        if(fim != null){
            fim.proximo = no;
        }
        fim = no;
        if(tamanho ==0){
            inicio = fim;
        }
        tamanho++;
    }

    public void addMeio(int indice, String info){
        if(indice<=0){
            addInicio(info);
        }
        else if(indice >= tamanho){
            addFim(info);
        }
        else{
            No local = inicio;
            for(int i=0; i< indice -1; i++){
                local = local.proximo;
            }
            No no = new No(info);
            no.info = info;
            no.anterior = local;
            no.proximo = local.proximo;
            local.proximo = no;
            no.proximo.anterior = no;
            tamanho++;

        }
    }

    public Boolean posicaoNome(String busca){ // obs: funçao nao funcioma
        if(inicio == null){
            return false;
        }
        No local = inicio;
        for(int i=0 ; i <= tamanho; i++){
            local = local.proximo;
            if(local.equals(busca)){
                return true;
            }
        }
        return false;
    } 

    @Override
    public String toString() {
        String str = "(Tamanho total: " + tamanho + ")\n";
        No local = inicio;
        int i=1;
        while(local != null){
            str += "(" + i + ")" + local.info + "\n";
            local = local.proximo;
            i++;
        }
        return str;
    }

}
