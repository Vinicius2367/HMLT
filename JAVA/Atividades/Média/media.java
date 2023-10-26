import java.util.Scanner;
public class media {
public static void main (String [] args){
    int cad = 0;
    
    Scanner sc = new Scanner (System.in);
        String[] nomes = new String[cad];
        double[] nota1 = new double[cad];
        double[] nota2 = new double[cad];
        double[] media = new double[cad];
      
      System.out.print("Quantos cadastros? : ");
        cad = sc.nextInt();
       
                  
    for(int i=0; i<cad; i++){
      System.out.print("Digite o nome: ");
        nomes[cad] = sc.next();
    
      System.out.print("Digite sua primeira nota: ");
        nota1[cad] = sc.nextDouble();
      System.out.print("Digite sua segunda nota: ");
        nota2[cad] = sc.nextDouble();
    }
    
    for(int i=0; i<cad; i++){
      media[i]=(nota1[cad]+nota2[cad])/2;
    }
    
    for(int i=0; i<cad; i++){
      System.out.println("Suas notas: "+nomes[i] +media[i]);
    }
}
}

