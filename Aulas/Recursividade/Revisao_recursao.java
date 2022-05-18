package Aulas.Recursividade;

public class Revisao_recursao {
    public static void main(String[] args) {

    //chamando fatorial recursivo:
    System.out.println("Fatorial: "+ fatorial_Recursivo(5));

    //chamando primo recursivo
    System.out.println(primo_Recursivo(15, 2));

    //chamando somador:
    System.out.println(somatorio_Recursivo(6)); 

    }

    //decremento:
    


    //somador normal:
    public static void somador(int num){
        int res=0;
        for(int i=1; i <= num;i++){
            res = res + i;
        }
        System.out.println("somatorio: " + res);
    }

    //somatorio recursivo:

    public static int somatorio_Recursivo(int num){
        if(num>=1){
            return num + somatorio_Recursivo(num -1);
        }
        return num;
        

    }
    

    // numero primo normal:
    public static void primo(int num){
        for(int i=2;i<=num;i++){
            if(num == i){
                System.out.println("Numero eh primo!");
                break;
            }
            else if (num % i==0){
                System.out.println("numero "+num +" nao eh primo!");
                break;
            }
        }
    }
    public static Boolean multiplos(int a, int b){
        return a % b == 0 ;

    }

    //primo recursivo:
    public static Boolean primo_Recursivo(int num, int cont){
        if(num == cont){
            return true;
        }
        else if( multiplos(num,cont)){
            return false; 
        }
        else 
            return primo_Recursivo(num, cont + 1 );
        
    }



      //fatorial normal
      public static void fatorial(int numero) {
          int fator =1;
          System.out.println("Fatorial de "+numero +":");
          for(int i = numero; i>=1 ;i--){
           fator = fator * i;
            System.out.print(i +" x ");
          }
        System.out.println(" = " + fator);
    }

    //fatorial recursivo
        public static int fatorial_Recursivo(int numero){
            if(numero > 1){
               return numero * fatorial_Recursivo(--numero);
            }
            return numero;
        }

}
