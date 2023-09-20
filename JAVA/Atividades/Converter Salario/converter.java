import java.util.Scanner;
public class cadastro {
    
    public static void main (String [] args){    
    
    byte opcao=1;
    String nome = null, endereco = null, cpf = null, data_nasc = null, telefone = null;
    Scanner sc = new Scanner (System.in);
    while ((opcao !=4) && (opcao<=4) && (opcao>=1)){
        
         System.out.println("(1) Cadastrar");
         System.out.println("(2) Mostrar Cadstro");
         System.out.println("(3) Apagar Cadastro");
         System.out.println("(4) Sair");
         System.out.print("Escolha uma opção: ");
         opcao = sc.nextByte();
         
    if (opcao==1){
         System.out.print("Digite seu nome: ");
         nome = sc.next();
         
         System.out.print("Endereço ");
         endereco = sc.next();
         
         System.out.print("Telefone: ");
         telefone = sc.next();
         
         System.out.print("CPF: ");
         cpf = sc.next();
         
         System.out.print("Data de nascimento: ");
         data_nasc = sc.next();
         
         System.out.print("Bem Vindo "+nome);
   
    }if (opcao==2){
        System.out.println("Suas Informações");
        System.out.println("Nome: " +nome);
        System.out.println("Endereço: " +endereco);
        System.out.println("Telefone: "+telefone);
        System.out.println("CPF: "+cpf);
        System.out.println("Data de nascimento: "+data_nasc);       
    
    }if (opcao==3){
        nome=" ";
        endereco= " ";
        telefone=" ";
        cpf=" ";
        data_nasc=" ";        
    }    
    }

    
    }
}
