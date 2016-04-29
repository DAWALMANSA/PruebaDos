
/**
 * Factorial de un numero introducido por teclado
 * 
 * @author (Javier&Juan&Mihaela) 
 * @version (1.1)
 */
import java.util.Scanner;
public class Factorial
{
   public static void main(){
       
       Scanner sc=new Scanner(System.in);
       int n=1;
       
       while (n>=0){
           System.out.println(" Introduce un numero");
       
           n=sc.nextInt(); 
       
           if (n>-1){
                System.out.println("El factorial :"+factorial(n));}
           else {
               System.out.println("Fin programa");}
    }}
    
   
    public static double factorial(int n){
       double  aux=1;       
       for(int i=1;i<=n;i++){
       aux=aux*i;
       }
      
       return aux;}
    }
            


