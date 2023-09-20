
import java.util.Scanner;
public class calculadora {
    
    public static void main (String [] args) {
        
      double num1, num2, resultado;  
      Scanner sc  = new Scanner(System.in);
      byte opcao =1;
      while((opcao !=0)&&(opcao<=4)){
          
                       
                        System.out.println("(0) Sair");
                        System.out.println("(1) Soma"); 
                        System.out.println("(2) Subtração"); 
                        System.out.println("(3) Mulltiplicar");        
                        System.out.println("(4) Dividir");
                        System.out.println("Escolha uma opção: ");
                        opcao = sc.nextByte();
                                   
if(opcao==1){ 
                                       System.out.println("DIgite o primeiro numero: ");
                                       num1 = sc.nextDouble();
     
                                       System.out.println("Digite o segundo numero: ");
                                        num2 = sc.nextDouble();
           resultado= num1+num2;          
                                       System.out.println("Aqui esta o resultado: "+resultado);                                      
}                                  
if(opcao==2){
                                       System.out.println("DIgite o primeiro numero: ");
                                       num1 = sc.nextDouble();
     
                                       System.out.println("Digite o segundo numero: ");
                                        num2 = sc.nextDouble();
           resultado= num1-num2;          
                                       System.out.println("Aqui esta o resultado: "+resultado);
}                                  
if(opcao==3){
                                        System.out.println("DIgite o primeiro numero: ");
                                       num1 = sc.nextDouble();
     
                                       System.out.println("Digite o segundo numero: ");
                                        num2 = sc.nextDouble();
           resultado= num1*num2;          
                                       System.out.println("Aqui esta o resultado: "+resultado);    
}                                  
if(opcao==4){
                                        System.out.println("DIgite o primeiro numero: ");
                                       num1 = sc.nextDouble();
     
                                       System.out.println("Digite o segundo numero: ");
                                        num2 = sc.nextDouble();
           resultado= num1/num2;          
                                       System.out.println("Aqui esta o resultado: "+resultado);
}
      }}}