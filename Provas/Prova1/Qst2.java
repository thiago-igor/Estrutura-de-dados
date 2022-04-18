package Provas.Prova1;

public class Qst2 {

   public static void main(String[] args) {
    
    System.out.println(ContadorPar(5));

   }

   //contador par:
   public static int ContadorPar(int num){
        if(num<2){
            return 1;
        }
        return 1 + ContadorPar(num - 2);
     
    }
   


}
