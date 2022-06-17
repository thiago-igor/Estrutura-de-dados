package Faculdade.Recursividade;

public class Recurssao_Aula {
    
    public static void main (String[] args){

        System.out.println("--Decrementar For--");
        decrementarRecursivo(5);
        
        System.out.println("--Decrementar Recursivo--");
        decrementarRecursivo(5);

        System.out.println("--Incrementar Recursivo--");
        incrementarRecursivo(5);

    }

    public static void decrementarfor(int cons){
        for(int i=cons;i>0;i--){
            System.out.println(i);
        }
    }

    public static void decrementarRecursivo(int cons){
        System.out.println(cons);
        if(cons>0)
            decrementarRecursivo(--cons);
    }

    public static void incrementarRecursivo(int cons){
        int aux = cons;
        int op;
        if(cons>=0){
            op = aux - cons;
            incrementarRecursivo(--cons);
            System.out.println(op);
        }
    }

}
