package Provas.Prova2;

public class ListaDuplaEncadeada {
    No inicio;
    No fim;
    int tamanho;

    public void incerirInicio(String info){
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

    public void add(String info){
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

    @Override
    public String toString() {
        String str = "(" + tamanho + ")";
        No local = inicio;
        while(local != null){
            str += local.info + " ";
            local = local.proximo;
        }
        return str;
    }

}
