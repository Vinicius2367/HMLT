import java.util.Scanner;

public class par {
    
    public static void main (String [] args) {
        int num1, num2, soma;
           Scanner sc  = new Scanner(System.in); 
           
        System.out.print("Digite o primeiro número: ");
                           num1 = sc.nextInt();
        System.out.print("digite o segundo numero: ");
                           num2 = sc.nextInt();
         soma = num1 + num2;                  
         
         if(soma%2==0){ 
             System.out.print("Número Par: ");}
         else{
             System.out.print("Número Ímpar: ");
         }       
         System.out.println(+soma);
                    
                    
                    
}
}
