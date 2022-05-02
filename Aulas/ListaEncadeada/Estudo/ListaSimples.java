package Aulas.ListaEncadeada.Estudo;

public class ListaSimples {
    No inicio = null;
    int tamanho = 0;


    public void inserirInicio(String info){
        No no = new No();
        no.info = info;
        no.proximo = inicio;
        inicio = no;
        tamanho++;
    }

    public String retirarInicio(){
        if(inicio == null){
            return null;
        }
        String info = inicio.info;
        inicio = inicio.proximo;
        tamanho--;
        return info;
    }

    public String toString(){
        String str = "(" + tamanho + ")";
        No local = inicio;
        while(local!=null){
            str += local.info + " ";
            local = local.proximo;
        }
        return str;
    }

    public static void main(String[] args) {
         ListaSimples l = new ListaSimples();

            System.out.println(l);
            l.inserirInicio("A");

            System.out.println(l);
            l.inserirInicio("B");
            System.out.println(l);

            System.out.println(l);
            l.inserirInicio("C");
            System.out.println(l);
         
            while (l.retirarInicio() != null){
                System.out.println(l);
            }
    }
}
