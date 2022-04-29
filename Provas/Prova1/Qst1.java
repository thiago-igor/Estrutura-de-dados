//Transformar decimal para binario
package Provas.Prova1;

public class Qst1 {
    
    public static void main(String[] args) {
        DecimalParaBinario(12);
    }

    public static void DecimalParaBinario(int n){
        if(n>0){
            DecimalParaBinario(n/2);
            System.out.print(n%2);
        }

    }
}

