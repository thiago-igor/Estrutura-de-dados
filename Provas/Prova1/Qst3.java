//Formula de fibonacci
package Provas.Prova1;

public class Qst3 {
    public static void main(String[] args){
       int num = 5;

       for(int i=0;i<num;i++){
           System.out.println(fibonacciRecursivo(i));
       }
        
    }

    public static int fibonacciRecursivo(int num){
        if (num <2){
            return 1;
        }
        return fibonacciRecursivo(num-1) + fibonacciRecursivo(num-2);
    }






}
