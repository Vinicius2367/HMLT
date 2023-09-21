



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class index {

        static int senha [] = new int[10];//Aloca um espaço de 10 na memoria que irá amazenar dados do tipo int
        static int codigo [] = new int[10];//Alocação de um espaço de 10 na memoria que irá amazenar dados do tipo int
        static String nome[] = new String[10]; //Alocação de um epaço de 10 na memória que irá amazenar dados do tipo String
        static String cargo [] = new String[10]; // Alocação de um espaço de 10 na memória que irá amazenar dados do tipo String
        static String pacienteO[] = new String [22];// Alocação de um espaço de 22 na memória que irá amazenar dados do tipo String
        static String pacienteo[] = new String [22];// Alocação de um espaço de 22 na memória que irá amazenar dados do tipo String
        static String pacienteA [] = new String [22];// Alocação de um espaço de 22 na memória que irá amazenar dados do tipo String
        static String pacientea [] = new String [22];// Alocação de um espaço de 22 na memória que irá amazenar dados do tipo String
        static String pacienteB [] = new String [22];// Alocação de um espaço de 22 na memória que irá amazenar dados do tipo String
        static String pacienteb [] = new String [22];// Alocação de um espaço de 22 na memória que irá amazenar dados do tipo String
        static String pacienteAB [] = new String [22];// Alocação de um espaço de 22 na memória que irá amazenar dados do tipo String
        static String pacienteab [] = new String [22];// Alocação de um espaço de 22 na memória que irá amazenar dados do tipo String
        
        
    public static void main(String[] args) {
        
        
        
        Scanner sc = new Scanner (System.in); // irá ler o teclado
            //declarando variáveis
            
        int indice1 = 5;
        int indice2 = 20;
        int indice3 = 20;
        int indice4 = 20;
        int indice5 = 20;
        int indice6 = 20;
        int indice7 = 20;
        int indice8 = 20;
        int indice9 = 20;
        int num; 
        int num_1;
        int number;
        int retirar;
        
        List<String> usuarios = new ArrayList<>();
        usuarios.add("Emanuel");
        usuarios.add("Wanderson");
        usuarios.add("Vinícius");
        usuarios.add("Eraldo");
        usuarios.add("Silvio");
        
        List<String> pacientes = new ArrayList<>();
        
        //declarando doadores AB+
                pacienteab[0]=("Gabriel Ferreira - AB+");
                pacienteab[1]=("Milena Nunes - AB+");
                pacienteab[2]=("Ash Almeida - AB+");
                pacienteab[3]=("Vinicius Oliveira - AB+");
                pacienteab[4]=("Danilo Martins - AB+");
                pacienteab[5]=("Eraldo Santos - AB+");
                pacienteab[6]=("Jackson Carvalho - AB+");
                pacienteab[7]=("Marilio Miranda - AB+");
                pacienteab[8]=("Karla Fernandes - AB+");
                pacienteab[9]=("Tiago Barbosa - AB+");
        
        //declarando doadores AB-
                pacienteAB[0]=("Bianca Ferreira - AB-");
                pacienteAB[1]=("Pedro Carvalho - AB-");
                pacienteAB[2]=("Vinicius Silva - AB-");
                pacienteAB[3]=("Ash Costa - AB-");
                pacienteAB[4]=("Pedro Almeida - AB-");
                pacienteAB[5]=("Zoe Pereira - AB-");
                pacienteAB[6]=("Gabriel Santos - AB-");
                pacienteAB[7]=("Isabela Ferreira - AB-");
                pacienteAB[8]=("Karla Rodrigues - AB-");
                pacienteAB[9]=("Tiago Almeida - AB-");
                
        //declarando doadores B+
                pacienteb[0]="Thays Silva - B+";
                pacienteb[1]="pedro Martins - B+";
                pacienteb[2]="Pierre Silva - B+";
                pacienteb[3]="Gizely Costa - B+";
                pacienteb[4]="Paulo Santos - B+";
                pacienteb[5]="marcos Oliveira - B+";
                pacienteb[6]="Flavio Pereira - B+";
                pacienteb[7]="Karla Rodrigues - B+";
                pacienteb[8]="Tiago Almeida - B+";
                pacienteb[9]="Kaique Borges - B+";
                
        //declarando doadores B-
                pacienteB[0]="Tharsila Silva - B-";
                pacienteB[1]="Sofia Martins - B-";
                pacienteB[2]="Lucas Silva - B-";
                pacienteB[3]="Isabella Costa - B-";
                pacienteB[4]="Gabriel Santos - B-";
                pacienteB[5]="Laura Oliveira - B-";
                pacienteB[6]="Matheus Pereira - B-";
                pacienteB[7]="Maria Rodrigues - B-";
                pacienteB[8]="Enzo Almeida - B-";
                pacienteB[9]="Michael Borges - B-";
                
        //declarando doadores A+
                 pacientea[0]=(" Socorro Oliveira - A+");
                 pacientea[1]=(" Dores Rodrigues - A+");
                 pacientea[2]=(" Ema Carvalho - A+");
                 pacientea[3]=(" Camila Gonçalves - A+");
                 pacientea[4]=(" Leandro Pereira - A+");
                 pacientea[5]=(" Alana Carvalho - A+");
                 pacientea[6]=(" Lucas Kerkie - A+");
                 pacientea[7]=("Bruno Pereira - A+");
                 pacientea[8]=(" Isadora Santos - A+");
                 pacientea[9]=(" Carlos Ferreira - A+");
                
        //declarando doadores A-
                pacienteA[0]= "Gustavo Ferreira - A-";
                pacienteA[1]= "Milena Nunes - A-";
                pacienteA[2]= "Leandro Almeida - A-";
                pacienteA[3]= "Hema Oliveira - A-";
                pacienteA[4]= "Danilo Martins - A-";
                pacienteA[5]= "Eraldo Santos - A-";
                pacienteA[6]= "Jackson Carvalho - A-";
                pacienteA[7]= "Marilio Miranda - A-";
                pacienteA[8]= "Carla Fernandes - A-";
                pacienteA[9]= "Júlio Barbosa - A-";
                
        //declarando doadores O+
                pacienteo[0]=("Gabriel Ferreira - O+");
                pacienteo[1]=("Isadora Nunes - O+");
                pacienteo[2]=("Leonardo Almeida - O+");
                pacienteo[3]=("Helena Oliveira - O+");
                pacienteo[4]=("Gustavo Martins - O+");
                pacienteo[5]=("Camila Santos - O+");
                pacienteo[6]=("João Carvalho - O+");
                pacienteo[7]=("Ana Miranda - O+");
                pacienteo[8]=("Lucas Fernandes - O+");
                pacienteo[9]=("Fernanda Barbosa - O+");
                
        //declarando doadores O-
                 pacienteO[0]=(" Pedro Oliveira - O-");
                 pacienteO[1]=(" Marcos Rodrigues - O-");
                 pacienteO[2]=(" Emilia Carvalho - O-");
                 pacienteO[3]=(" Carla Gonçalves - O-");
                 pacienteO[4]=(" Myke Pereira - O-");
                 pacienteO[5]=(" Aline Carvalho - O-");
                 pacienteO[6]=(" Lidia Kerkie - O-");
                 pacienteO[7]=("Bruna Pereira - O-");
                 pacienteO[8]=(" Isaias Santos - O-");
                 pacienteO[9]=(" Isabely Ferreira - O-");
        //declarando usuarios
                nome [0] = "Emanuel";
                nome [1] = "Wanderson";
                nome [2] = "Vinícius";
                nome [3] = "Eraldo";
                nome [4] = "Silvio";
                
          //declarando senha
                senha [0] = 1111;
                senha [1] = 2222;
                senha [2] = 3333;
                senha [3] = 4444;
                senha [4] = 5555;
                
           //declarando cargos
                cargo [0] = "Administrador";
                cargo [1] = "Supervisor";
                cargo [2] = "Supervisor";
                cargo [3] = "Médico";
                cargo [4] = "Médico";
                
                //declarando senha
                codigo [0] = 121;
                codigo [1] = 212;
                codigo [2] = 313;
                codigo [3] = 414;
                codigo [4] = 515;
        
              
            int senha_login;
            int codigo_login;

            System.out.println("\t\t\t\t     ==============================================");
            System.out.println("\t\t\t\t     ========= DH-Distribuidor Hospitalar =========");
            System.out.println("\t\t\t\t     ==============================================");
            System.out.println("\t\t\t\t     =========       DIGITE SEU Código    =========");
            System.out.println("\t\t\t\t     ==============================================");
            System.out.print("\t\t\t\t     Nome > ");// imprime na tela
            codigo_login = sc.nextInt();//armazena o nome digitado na variável codigo_login
            System.out.println("\t\t\t\t     ==============================================");
            System.out.println("\t\t\t\t     =========        DIGITE A SENHA      =========");
            System.out.println("\t\t\t\t     ==============================================");
            System.out.print("\t\t\t\t     Senha > ");// imprime na tela
             senha_login = sc.nextInt();//armazena a senha digitada na variável senha_login
             
             for(int i = 0;i <= indice1; i++){//laço for
                    if (codigo_login == codigo[i] && senha_login == senha[i]){ 
                        System.out.println("\n\n\t\t\t\t     Usuario logado...");//imprime na tela
                        System.out.println("\t\t\t\t     Nome: "+nome[i]);//imprime na tela o nome do cliente logado
                        System.out.println("\t\t\t\t     Cargo: "+cargo[i]);
                        
              System.out.println("\n____________________________________________________________________________________________________________________________________");
              
                        System.out.println("\t\t\t\t     Bem-Vindo ao DH-Distribuidor Hospitalar");
                        
                 if (codigo_login == codigo[0]){  // criando menu administrador 
                 
                     do{
                System.out.println("\t\t\t\t     ------------------------------");
                System.out.println("\t\t\t\t     --   ESCOLHA UMA OPÇÃO      --");
                System.out.println("\t\t\t\t     -- [1] Consultar Estoque    --");//Pronto 
                System.out.println("\t\t\t\t     -- [2] usuários registrados --");//pronto
                System.out.println("\t\t\t\t     -- [3] Deletar usuário      --");// 
                System.out.println("\t\t\t\t     -- [4] Sair do programa     --");//Pronto
                System.out.println("\t\t\t\t     ------------------------------");
                System.out.print("\t\t\t\t     Digite aqui > ");
                num = sc.nextInt();
                
                     if ((num>=1)&& (num<=4) ){
                         
                            switch(num){
                                 case 1:{//consultas
                                System.out.println("\t\t\t\t     --    Central de consultas   --");
                                System.out.println("\t\t\t\t     -- [1] para sangue tipo O    --");//feito
                                System.out.println("\t\t\t\t     -- [2] para sangue tipo A    --");//feito
                                System.out.println("\t\t\t\t     -- [3] para sangue tipo B    --");//feito
                                System.out.println("\t\t\t\t     -- [4] para sangue tipo AB   --");//feito
                                System.out.println("\t\t\t\t     -------------------------------");
                                System.out.print("\t\t\t\t     Digite aqui > ");
                                num_1 = sc.nextInt();
                                
                                    if(num_1==1){//tipo O
                                        System.out.println("\t\t\t\t     -- Central de consultas --");
                                        System.out.println("\t\t\t\t     --    [1] para Rh +     --");
                                        System.out.println("\t\t\t\t     --    [2] para Rh -     --");
                                        System.out.println("\t\t\t\t     --    [3] para sair     --");
                                        System.out.print("\t\t\t\t     Digite aqui > ");
                                        number = sc.nextInt();
                                        
                                        if(number>=1 && number<=3){
                                            switch(number){
                                                
                                                case 1:{
                                                     System.out.println("\t\t\t\t    Tipo O positivo (O+)");
                                                            for(int p=0;p<=indice2;p++){
                                                                System.out.println("\t\t\t\t"+pacienteo[p]);
                                                            }
                                                            break;
                                                }
                                                case 2:{
                                                    System.out.println("\t\t\t\t    Tipo O negativo (O-)");
                                                    for(int p=0;p<=indice3;p++){
                                                        System.out.println("\t\t\t\t"+pacienteO[p]);
                                                    }
                                                    break;
                                                }
                                                case 3:{
                                                }default:
                                                    System.out.println("Número invalido!! Digite de 1 - 3.");
                                            }
                                        }else{
                                            System.out.println("Opcão invalida!! Digite de 1 - 3.");
                                        }
                                    }
                                        if(num_1==2){
                                             System.out.println("\t\t\t\t-- Central de consultas --");
                                             System.out.println("\t\t\t\t--    [1] para Rh +     --");
                                             System.out.println("\t\t\t\t--    [2] para Rh -     --");
                                             System.out.println("\t\t\t\t--    [3] para sair     --");
                                             System.out.print("\t\t\t\t     Digite aqui > ");
                                             number = sc.nextInt();
                                             
                                                 switch(number){
                                                     case 1:{
                                                         System.out.println("\t\t\t\t    Tipo A positivo (A+)");
                                                         for(int p=0;p<=indice4;p++){
                                                             System.out.println("\t\t\t\t"+pacientea[p]);
                                                         }
                                                         break;
                                                     }
                                                     case 2:{
                                                         System.out.println("\t\t\t\t    Tipo A negativo (A-)");
                                                         for(int p=0;p<=indice5;p++){
                                                             System.out.println("\t\t\t\t"+pacienteA[p]);
                                                         }
                                                         break;
                                                     }
                                                     case 3:{
                                                     }default:
                                                         System.out.println("Número invalido!! Digite de 1 - 3.");
                                                 }
                                        }
                                        if(num_1==3){
                                             System.out.println("\t\t\t\t-- Central de consultas --");
                                             System.out.println("\t\t\t\t--    [1] para Rh +     --");
                                             System.out.println("\t\t\t\t--    [2] para Rh -     --");
                                             System.out.println("\t\t\t\t--    [3] para sair     --");
                                             System.out.print("\t\t\t\t     Digite aqui > ");
                                             number = sc.nextInt();
                                             
                                             switch(number){
                                                 case 1:{
                                                      System.out.println("\t\t\t\t    Tipo B positivo (B+)");
                                                      for(int p=0;p<=indice6;p++){
                                                          System.out.println("\t\t\t\t"+pacienteb[p]);
                                                      }
                                                      break;
                                                 }
                                                 case 2:{
                                                     System.out.println("\t\t\t\t    Tipo B negativo (B-)");
                                                     for(int p=0;p<=indice7;p++){
                                                         System.out.println("\t\t\t\t"+pacienteB[p]);
                                                     }
                                                 }
                                                 case 3:{ 
                                                     break;
                                                 }default:
                                                 System.out.println("Número invalido!! Digite de 1 - 3.");
                                                 
                                             }
                                        }
                                            if(num_1==4){
                                                 System.out.println("\t\t\t\t-- Central de consultas --");
                                             System.out.println("\t\t\t\t--    [1] para Rh +     --");
                                             System.out.println("\t\t\t\t--    [2] para Rh -     --");
                                             System.out.println("\t\t\t\t--    [3] para sair     --");
                                             System.out.print("\t\t\t\t     Digite aqui > ");
                                             number = sc.nextInt();
                                             
                                             switch(number){
                                                 case 1:{
                                                      System.out.println("\t\t\t\t   Tipo AB positivo (AB+)");
                                                      for(int p=0;p<=indice8;p++){
                                                          System.out.println("\t\t\t\t"+pacienteab[p]);
                                                      }
                                                      break;
                                                 }
                                                 case 2:{
                                                     System.out.println("\t\t\t\t    Tipo AB negativo (AB-)");
                                                        for(int p=0;p<=indice9;p++){
                                                            System.out.println("\t\t\t\t"+pacienteAB[p]);
                                                        }
                                                 }
                                                 case 3:{
                                                     break;
                                                 }default:
                                                   System.out.println("Número invalido!! Digite de 1 - 3.");  
                                             }
                                            }
                                        
                                   break;
                                 }
                                 case 2:{//usuarios registrados
                                     usuarios.contains(usuarios);
                                        System.out.println("\t\t\t\t     Usuarios registrados - "+"\n"+usuarios);
                                        
                                        break;
                                 }
                                 case 3:{//deletar usuario
                                     System.out.println("\t\t\t\t    ==========================");
                                     System.out.println("\t\t\t\t    Digite o nome de usuario: ");
                                     System.out.println("\t\t\t\t    ==========================");
                                     String usuario = sc.next();
                                     
                                        if(usuarios.contains(usuario)){
                                            usuarios.remove(usuario);
                                            System.out.println("\t\t\t\t     O usuário "+usuario+" foi removido!");
                                        }
                                        else{
                                            System.out.println("\t\t\t\t     O usuário "+usuario+" Não foi removido!");
                                        }
                                     break;
                                 }
                                 case 4:{//sair do programa
                                     System.out.println("\t\t\t\t    Sistema Finalizado!");
                                     System.exit(0);
                                 }
                         }
                     }
                     }while(num>=1 || num<=4);
                 }
                 
                 if (codigo_login == codigo[1] || codigo_login == codigo[2] ){//menu supervisor
                     
                     do{
                         System.out.println("\t\t\t\t    ------------------------------");
                         System.out.println("\t\t\t\t    --   ESCOLHA UMA OPÇÃO      --");
                         System.out.println("\t\t\t\t    -- [1] Consultar Estoque    --");//Pronto 
                         System.out.println("\t\t\t\t    -- [2] Armazenar Sangue     --");//pronto
                         System.out.println("\t\t\t\t    -- [3] Retirar Sangue       --");//pronto
                         System.out.println("\t\t\t\t    -- [4] Sair do programa     --");//pronto
                         System.out.println("\t\t\t\t    ------------------------------");
                         System.out.print("\t\t\t\t     Digite aqui > ");
                         num = sc.nextInt();
                         
                            if ((num>=1)&& (num<=4) ){
                                switch(num){
                                    case 1:{//consultas
                                      System.out.println("\t\t\t\t   --    Central de consultas   --");
                                System.out.println("\t\t\t\t     -- [1] para sangue tipo O    --");//feito
                                System.out.println("\t\t\t\t     -- [2] para sangue tipo A    --");//feito
                                System.out.println("\t\t\t\t     -- [3] para sangue tipo B    --");//feito
                                System.out.println("\t\t\t\t     -- [4] para sangue tipo AB   --");//feito
                                System.out.println("\t\t\t\t     -------------------------------");
                                System.out.print("\t\t\t\t     Digite aqui > ");
                                num_1 = sc.nextInt();
                                
                                    if(num_1==1){//tipo O
                                        System.out.println("\t\t\t\t     -- Central de consultas --");
                                        System.out.println("\t\t\t\t     --    [1] para Rh +     --");
                                        System.out.println("\t\t\t\t     --    [2] para Rh -     --");
                                        System.out.println("\t\t\t\t     --    [3] para sair     --");
                                        System.out.print("\t\t\t\t     Digite aqui > ");
                                        number = sc.nextInt();
                                        
                                        if(number>=1 && number<=3){
                                            switch(number){
                                                
                                                case 1:{
                                                     System.out.println("\t\t\t\t    Tipo O positivo (O+)");
                                                            for(int p=0;p<=indice2;p++){
                                                                System.out.println("\t\t\t\t"+pacienteo[p]);
                                                            }
                                                            break;
                                                }
                                                case 2:{
                                                    System.out.println("\t\t\t\t    Tipo O negativo (O-)");
                                                    for(int p=0;p<=indice3;p++){
                                                        System.out.println("\t\t\t\t"+pacienteO[p]);
                                                    }
                                                    break;
                                                }
                                                case 3:{
                                                }default:
                                                    System.out.println("Número invalido!! Digite de 1 - 3.");
                                            }
                                        }else{
                                            System.out.println("Opcão invalida!! Digite de 1 - 3.");
                                        }
                                    }
                                        if(num_1==2){
                                             System.out.println("\t\t\t\t    -- Central de consultas --");
                                             System.out.println("\t\t\t\t    --    [1] para Rh +     --");
                                             System.out.println("\t\t\t\t    --    [2] para Rh -     --");
                                             System.out.println("\t\t\t\t    --    [3] para sair     --");
                                             System.out.print("\t\t\t\t     Digite aqui > ");
                                             number = sc.nextInt();
                                             
                                                 switch(number){
                                                     case 1:{
                                                         System.out.println("\t\t\t\t    Tipo A positivo (A+)");
                                                         for(int p=0;p<=indice4;p++){
                                                             System.out.println("\t\t\t\t"+pacientea[p]);
                                                         }
                                                         break;
                                                     }
                                                     case 2:{
                                                         System.out.println("\t\t\t\t    Tipo A negativo (A-)");
                                                         for(int p=0;p<=indice5;p++){
                                                             System.out.println("\t\t\t\t"+pacienteA[p]);
                                                         }
                                                         break;
                                                     }
                                                     case 3:{
                                                     }default:
                                                         System.out.println("Número invalido!! Digite de 1 - 3.");
                                                 }
                                        }
                                        if(num_1==3){
                                             System.out.println("\t\t\t\t    -- Central de consultas --");
                                             System.out.println("\t\t\t\t    --    [1] para Rh +     --");
                                             System.out.println("\t\t\t\t    --    [2] para Rh -     --");
                                             System.out.println("\t\t\t\t    --    [3] para sair     --");
                                             System.out.print("\t\t\t\t     Digite aqui > ");
                                             number = sc.nextInt();
                                             
                                             switch(number){
                                                 case 1:{
                                                      System.out.println("\t\t\t\t    Tipo B positivo (B+)");
                                                      for(int p=0;p<=indice6;p++){
                                                          System.out.println("\t\t\t\t"+pacienteb[p]);
                                                      }
                                                      break;
                                                 }
                                                 case 2:{
                                                     System.out.println("\t\t\t\t    Tipo B negativo (B-)");
                                                     for(int p=0;p<=indice7;p++){
                                                         System.out.println("\t\t\t\t"+pacienteB[p]);
                                                     }
                                                     break;
                                                 }
                                                 case 3:{ 
                                                     break;
                                                 }
                                                 
                                                 
                                             }
                                        }
                                            if(num_1==4){
                                                 System.out.println("\t\t\t\t    -- Central de consultas --");
                                             System.out.println("\t\t\t\t    --    [1] para Rh +     --");
                                             System.out.println("\t\t\t\t    --    [2] para Rh -     --");
                                             System.out.println("\t\t\t\t    --    [3] para sair     --");
                                             System.out.print("\t\t\t\t     Digite aqui > ");
                                             number = sc.nextInt();
                                             
                                             switch(number){
                                                 case 1:{
                                                      System.out.println("\t\t\t\t   Tipo AB positivo (AB+)");
                                                      for(int p=0;p<=indice8;p++){
                                                          System.out.println("\t\t\t\t"+pacienteab[p]);
                                                      }
                                                      break;
                                                 }
                                                 case 2:{
                                                     System.out.println("\t\t\t\t    Tipo AB negativo (AB+)");
                                                        for(int p=0;p<=indice9;p++){
                                                            System.out.println("\t\t\t\t"+pacienteAB[p]);
                                                        }
                                                        break;
                                                 }
                                                 case 3:{
                                                     break;
                                                 }default:
                                                   System.out.println("Número invalido!! Digite de 1 - 3.");  
                                             }
                                            }
                                        
                                   break;
                                 }
                                  
                                    case 2:{//armazenar sangue
                                        System.out.println("\t\t\t\t     --         Cadastro de Doador             --");
                                        System.out.println("\t\t\t\t     escolha qual tipo sanguíneo deseja adicionar");
                                        System.out.println("\t\t\t\t     --       [1] para sangue tipo O           --");
                                        System.out.println("\t\t\t\t     --       [2] para sangue tipo A           --");
                                        System.out.println("\t\t\t\t     --       [3] para sangue tipo B           --");
                                        System.out.println("\t\t\t\t     --       [4] para sangue tipo AB          --");
                                        System.out.print("\t\t\t\t     Digite aqui > ");
                                        int ler = sc.nextInt();
                                        
                                                
                                            switch(ler){
                                                case 1:{//tipo O
                                                 System.out.println("\t\t\t\t    -- Central de consultas --");
                                             System.out.println("\t\t\t\t    --    [1] para Rh +     --");
                                             System.out.println("\t\t\t\t    --    [2] para Rh -     --");
                                             System.out.println("\t\t\t\t    --    [3] para sair     --");
                                             System.out.print("\t\t\t\t     Digite aqui > ");
                                             number = sc.nextInt();
                                             
                                             switch(number){
                                                 case 1:{//+
                                                     int quant=0;
                                                     int total=9;
                                                        System.out.println("\t\t\t\t     =================================");
                                                        System.out.println("\t\t\t\t     Digite a quantidade de cadastro: ");
                                                        System.out.println("\t\t\t\t     =================================");
                                                        System.out.print("\t\t\t\t     Digite aqui > ");
                                                         quant = sc.nextInt();
                                                        
                                                         total = total + quant;
                                                        
                                        for(int p=10;p<=total;p++){
                                            
                                                   System.out.println("\t\t\t\t  ===========================");
                                                   System.out.println("\t\t\t\t  ===     digite o nome   ===");
                                                   System.out.println("\t\t\t\t  = Ex: (Nome-Sobrenome-O+) =");
                                                   System.out.println("\t\t\t\t  ===========================");
                                                   System.out.print("\t\t\t\t     Digite aqui > ");
                                                   pacienteo[p]=sc.next();  
                                            
                                     
                                        }
                                         break;         
                                    
                                                 }
                                                 case 2:{//-
                                                     int quant=0;
                                                     int total=9;
                                                        System.out.println("\t\t\t\t     =================================");
                                                        System.out.println("\t\t\t\t     Digite a quantidade de cadastro: ");
                                                        System.out.println("\t\t\t\t     =================================");
                                                        System.out.print("\t\t\t\t     Digite aqui > ");
                                                         quant = sc.nextInt();
                                                        
                                                         total = total + quant;
                                                        
                                        for(int p=10;p<=total;p++){
                                            
                                                    System.out.println("\t\t\t\t  ===========================");
                                                   System.out.println("\t\t\t\t  ===     digite o nome   ===");
                                                   System.out.println("\t\t\t\t  = Ex: (Nome-Sobrenome-O-) =");
                                                   System.out.println("\t\t\t\t  ===========================");
                                                   System.out.print("\t\t\t\t     Digite aqui > ");                               
                                                    pacienteO[p]=sc.next();  
                                  
                                                    
                                        }
                                         break;         
                                    
                                                 }
                                                 case 3:{
                                                     break;
                                                 }default:
                                                   System.out.println("Número invalido!! Digite de 1 - 3.");  
                                             }
                                            }
                                                case 2:{//tipo A
                                                 System.out.println("\t\t\t\t-- Central de consultas --");
                                             System.out.println("\t\t\t\t--    [1] para Rh +     --");
                                             System.out.println("\t\t\t\t--    [2] para Rh -     --");
                                             System.out.println("\t\t\t\t--    [3] para sair     --");
                                             number = sc.nextInt();
                                             
                                             switch(number){
                                                 case 1:{//+
                                                     int quant=0;
                                                     int total=9;
                                                        System.out.println("\t\t\t\t=================================");
                                                        System.out.println("\t\t\t\tDigite a quantidade de cadastro: ");
                                                        System.out.println("\t\t\t\t=================================");
                                                        System.out.print("\t\t\t\t     Digite aqui > "); 
                                                         quant = sc.nextInt();
                                                        
                                                         total = total + quant;
                                                        
                                        for(int p=10;p<=total;p++){
                                            
                                                   System.out.println("\t\t\t\t  ===========================");
                                                   System.out.println("\t\t\t\t  ===     digite o nome   ===");
                                                   System.out.println("\t\t\t\t  = Ex: (Nome-Sobrenome-A+) =");
                                                   System.out.println("\t\t\t\t  ===========================");
                                                   System.out.print("\t\t\t\t     Digite aqui > ");                                    
                                                    pacientea[p]=sc.next();  
                                            
                                     
                                        }
                                         break;         
                                    
                                                 }
                                                 case 2:{//-
                                                     int quant=0;
                                                     int total=9;
                                                         System.out.println("\t\t\t\t     =================================");
                                                        System.out.println("\t\t\t\t     Digite a quantidade de cadastro: ");
                                                        System.out.println("\t\t\t\t     =================================");
                                                        System.out.print("\t\t\t\t     Digite aqui > ");
                                                         quant = sc.nextInt();
                                                        
                                                         total = total + quant;
                                                        
                                        for(int p=10;p<=total;p++){
                                            
                                                   System.out.println("\t\t\t\t  ===========================");
                                                   System.out.println("\t\t\t\t  ===     digite o nome   ===");
                                                   System.out.println("\t\t\t\t  = Ex: (Nome-Sobrenome-A-) =");
                                                   System.out.println("\t\t\t\t  ===========================");
                                                   System.out.print("\t\t\t\t     Digite aqui > ");                                      
                                                    pacienteA[p]=sc.next();  
                                  
                                                    
                                        }
                                         break;         
                                    
                                                 }
                                                 case 3:{
                                                     break;
                                                 }default:
                                                   System.out.println("Número invalido!! Digite de 1 - 3.");  
                                             }
                                            }
                                                case 3:{//tipo B
                                                 System.out.println("\t\t\t\t    -- Central de consultas --");
                                             System.out.println("\t\t\t\t    --    [1] para Rh +     --");
                                             System.out.println("\t\t\t\t    --    [2] para Rh -     --");
                                             System.out.println("\t\t\t\t    --    [3] para sair     --");
                                             System.out.print("\t\t\t\t     Digite aqui > "); 
                                             number = sc.nextInt();
                                             
                                             switch(number){
                                                 case 1:{//+
                                                     int quant=0;
                                                     int total=9;
                                                        System.out.println("\t\t\t\t=================================");
                                                        System.out.println("\t\t\t\tDigite a quantidade de cadastro: ");
                                                        System.out.println("\t\t\t\t=================================");
                                                        System.out.print("\t\t\t\t     Digite aqui > ");
                                                         quant = sc.nextInt();
                                                        
                                                         total = total + quant;
                                                        
                                        for(int p=10;p<=total;p++){
                                            
                                                  System.out.println("\t\t\t\t  ===========================");
                                                  System.out.println("\t\t\t\t  ===     digite o nome   ===");
                                                  System.out.println("\t\t\t\t  = Ex: (Nome-Sobrenome-B+) =");
                                                  System.out.println("\t\t\t\t  ===========================");
                                                  System.out.print("\t\t\t\t     Digite aqui > ");                                    
                                                    pacienteb[p]=sc.next();  
                                            
                                     
                                        }
                                         break;         
                                    
                                                 }
                                                 case 2:{//-
                                                     int quant=0;
                                                     int total=9;
                                                         System.out.println("\t\t\t\t=================================");
                                                        System.out.println("\t\t\t\tDigite a quantidade de cadastro: ");
                                                        System.out.println("\t\t\t\t=================================");
                                                        System.out.print("\t\t\t\t     Digite aqui > ");
                                                         quant = sc.nextInt();
                                                        
                                                         total = total + quant;
                                                        
                                        for(int p=10;p<=total;p++){
                                            
                                                   System.out.println("\t\t\t\t  ===========================");
                                                  System.out.println("\t\t\t\t  ===     digite o nome   ===");
                                                  System.out.println("\t\t\t\t  = Ex: (Nome-Sobrenome-B-) =");
                                                  System.out.println("\t\t\t\t  ===========================");
                                                  System.out.print("\t\t\t\t     Digite aqui > ");                                    
                                                    pacienteB[p]=sc.next();  
                                  
                                                    
                                        }
                                         break;         
                                    
                                                 }
                                                 case 3:{
                                                     break;
                                                 }default:
                                                   System.out.println("Número invalido!! Digite de 1 - 3.");  
                                             }
                                            }
                                                case 4:{//tipo AB
                                                 System.out.println("\t\t\t\t    -- Central de consultas --");
                                             System.out.println("\t\t\t\t    --    [1] para Rh +     --");
                                             System.out.println("\t\t\t\t    --    [2] para Rh -     --");
                                             System.out.println("\t\t\t\t    --    [3] para sair     --");
                                             System.out.print("\t\t\t\t     Digite aqui > ");
                                             number = sc.nextInt();
                                             
                                             switch(number){
                                                 case 1:{//+
                                                     int quant=0;
                                                     int total=9;
                                                        System.out.println("\t\t\t\t=================================");
                                                        System.out.println("\t\t\t\tDigite a quantidade de cadastro: ");
                                                        System.out.println("\t\t\t\t=================================");
                                                        System.out.print("\t\t\t\t     Digite aqui > "); 
                                                         quant = sc.nextInt();
                                                        
                                                         total = total + quant;
                                                        
                                        for(int p=10;p<=total;p++){
                                            
                                                    System.out.println("\t\t\t\t  ===========================");
                                                  System.out.println("\t\t\t\t  ===     digite o nome   ===");
                                                  System.out.println("\t\t\t\t  = Ex: (Nome-Sobrenome-AB+) =");
                                                  System.out.println("\t\t\t\t  ===========================");
                                                  System.out.print("\t\t\t\t     Digite aqui > ");                                    
                                                    pacienteab[p]=sc.next();  
                                            
                                     
                                        }
                                         break;         
                                    
                                                 }
                                                 case 2:{//-
                                                     int quant=0;
                                                     int total=9;
                                                        System.out.println("\t\t\t\t=================================");
                                                        System.out.println("\t\t\t\tDigite a quantidade de cadastro: ");
                                                        System.out.println("\t\t\t\t=================================");
                                                        System.out.print("\t\t\t\t     Digite aqui > ");
                                                         quant = sc.nextInt();
                                                        
                                                         total = total + quant;
                                                        
                                        for(int p=10;p<=total;p++){
                                            
                                                    System.out.println("\t\t\t\t  ===========================");
                                                  System.out.println("\t\t\t\t  ===     digite o nome   ===");
                                                  System.out.println("\t\t\t\t  = Ex: (Nome-Sobrenome-AB-) =");
                                                  System.out.println("\t\t\t\t  ===========================");
                                                  System.out.print("\t\t\t\t     Digite aqui > ");                                    
                                                    pacienteAB[p]=sc.next();  System.out.print("\t\t\t\t     Digite aqui > ");
                                  
                                                    
                                        }
                                         break;         
                                    
                                                 }
                                                 case 3:{
                                                     break;
                                                 }default:
                                                   System.out.println("Número invalido!! Digite de 1 - 3.");  
                                             }
                                            }
                                                
                                               
                                                
                                               
                                                
                                                
                                            }
                                                
                                        
                                         break;         
                                    }
                                      case 3:{// retirar sangue
                                          
                                               System.out.println("\t\t\t\t  --    Central para reservar  --");
                                               System.out.println("\t\t\t\t  -- [1] para sangue tipo O    --");//feito
                                               System.out.println("\t\t\t\t  -- [2] para sangue tipo A    --");//feito
                                               System.out.println("\t\t\t\t  -- [3] para sangue tipo B    --");//feito
                                               System.out.println("\t\t\t\t  -- [4] para sangue tipo AB   --");//feito
                                               System.out.println("\t\t\t\t  -------------------------------");
                                               System.out.print("\t\t\t\t     Digite aqui > "); 
                                               retirar = sc.nextInt();
                                
                                    switch(retirar){
                                            
                                        case 1:{//tipo O
                                            
                                                if(retirar==1){
                                                    System.out.println("\t\t\t\t     ================");
                                                    System.out.println("\t\t\t\t     == [1] tipo + ==");
                                                    System.out.println("\t\t\t\t     == [2] tipo - ==");
                                                    System.out.println("\t\t\t\t     ================");
                                                    System.out.print("\t\t\t\t     Digite aqui > ");
                                                    int apagar = sc.nextInt();
                                                    
                                                        if (apagar==1){//tipo Rh +
                                                            
                                                            System.out.println("\t\t\t\t     ======================");
                                                            System.out.println("\t\t\t\t     == Digite o indice: ==");
                                                            System.out.println("\t\t\t\t     ======================");
                                                            System.out.print("\t\t\t\t     Digite aqui > ");
                                                            int r =sc.nextInt();
                         
                                                            for(int p=r;p<=indice2;p++){
                                                            
                                                                
                                                                pacienteo[p] = pacienteo[p+1];
                                                                
                                                            }
                                                                
                                                                break;
                                                            
                                                        }
                                                        if (apagar==2){//tipo Rh -
                                                            
                                                            System.out.println("\t\t\t\t     ======================");
                                                            System.out.println("\t\t\t\t     == Digite o indice: ==");
                                                            System.out.println("\t\t\t\t     ======================");
                                                            System.out.print("\t\t\t\t     Digite aqui > ");
                                                            int r =sc.nextInt();
                         
                                                             for(int p=r;p<=indice3;p++){
                                                            
                                                                
                                                                pacienteO[p] = pacienteO[p+1];
                                                                
                                                            }
                                                                
                                                                break;
                                                            
                                                        }else{
                                                            return;
                                                        }
                                                } 
                                                break;
                                        }
                                                
                                            case 2:{//tipo A
                                            
                                                if(retirar==2){
                                                    
                                                    System.out.println("\t\t\t\t     ================");
                                                    System.out.println("\t\t\t\t     == [1] tipo + ==");
                                                    System.out.println("\t\t\t\t     == [2] tipo - ==");
                                                    System.out.println("\t\t\t\t     ================");
                                                    System.out.print("\t\t\t\t     Digite aqui > ");
                                                    int apagar = sc.nextInt();
                                                    
                                                        if (apagar==1){//tipo Rh +
                                                            
                                                            System.out.println("\t\t\t\t     ======================");
                                                            System.out.println("\t\t\t\t     == Digite o indice: ==");
                                                            System.out.println("\t\t\t\t     ======================");
                                                            System.out.print("\t\t\t\t     Digite aqui > ");
                                                            int r =sc.nextInt();
                         
                                                             for(int p=r;p<=indice4;p++){
                                                            
                                                                
                                                                pacientea[p] = pacientea[p+1];
                                                                
                                                            }
                                                                
                                                                break;
                                                            
                                                        }
                                                        if (apagar==2){//tipo Rh -
                                                            
                                                            System.out.println("\t\t\t\t     ======================");
                                                            System.out.println("\t\t\t\t     == Digite o indice: ==");
                                                            System.out.println("\t\t\t\t     ======================");
                                                            System.out.print("\t\t\t\t     Digite aqui > ");

                                                            int r =sc.nextInt();
                         
                                                             for(int p=r;p<=indice5;p++){
                                                            
                                                                
                                                                pacienteA[p] = pacienteA[p+1];
                                                                
                                                            }
                                                                
                                                                break;
                                                            
                                                        }else{
                                                            return;
                                                        }
                                                } 
                                                break;
                                        }
                                                case 3:{//tipo B
                                            
                                                if(retirar==3){
                                                    
                                                    
                                                    System.out.println("\t\t\t\t     ================");
                                                    System.out.println("\t\t\t\t     == [1] tipo + ==");
                                                    System.out.println("\t\t\t\t     == [2] tipo - ==");
                                                    System.out.println("\t\t\t\t     ================");
                                                    System.out.print("\t\t\t\t     Digite aqui > ");
                                                    int apagar = sc.nextInt();
                                                    
                                                        if (apagar==1){//tipo Rh +
                                                            
                                                            System.out.println("\t\t\t\t     ======================");
                                                            System.out.println("\t\t\t\t     == Digite o indice: ==");
                                                            System.out.println("\t\t\t\t     ======================");
                                                            System.out.print("\t\t\t\t     Digite aqui > ");

                                                            int r =sc.nextInt();
                         
                                                            for(int p=r;p<=indice6;p++){
                                                            
                                                                
                                                                pacienteb[p] = pacienteb[p+1];
                                                                
                                                            }
                                                                break;
                                                            
                                                        }
                                                        if (apagar==2){//tipo Rh -
                                                            
                                                            System.out.println("\t\t\t\t     ======================");
                                                            System.out.println("\t\t\t\t     == Digite o indice: ==");
                                                            System.out.println("\t\t\t\t     ======================");
                                                            System.out.print("\t\t\t\t     Digite aqui > ");
                                                            int r =sc.nextInt();
                         
                                                             for(int p=r;p<=indice7;p++){
                                                            
                                                                
                                                                pacienteB[p] = pacienteB[p+1];
                                                                
                                                            }
                                                                
                                                                
                                                                break;
                                                            
                                                        }else{
                                                            return;
                                                        }
                                                } 
                                                break;
                                        }
                                                    case 4:{//tipo AB
                                            
                                                if(retirar==4){
                                                    
                                                    System.out.println("\t\t\t\t     ================");
                                                    System.out.println("\t\t\t\t     == [1] tipo + ==");
                                                    System.out.println("\t\t\t\t     == [2] tipo - ==");
                                                    System.out.println("\t\t\t\t     ================");
                                                    System.out.print("\t\t\t\t     Digite aqui > ");
                                                    int apagar = sc.nextInt();
                                                    
                                                        if (apagar==1){//tipo Rh +
                                                            
                                                            System.out.println("\t\t\t\t     ======================");
                                                            System.out.println("\t\t\t\t     == Digite o indice: ==");
                                                            System.out.println("\t\t\t\t     ======================");
                                                            System.out.print("\t\t\t\t     Digite aqui > ");
                                                            int r =sc.nextInt();
                         
                                                             for(int p=r;p<=indice8;p++){
                                                            
                                                                
                                                                pacienteab[p] = pacienteab[p+1];
                                                                
                                                            }
                                                                break;
                                                            
                                                        }
                                                        if (apagar==2){//tipo Rh -
                                                            
                                                            System.out.println("\t\t\t\t     ======================");
                                                            System.out.println("\t\t\t\t     == Digite o indice: ==");
                                                            System.out.println("\t\t\t\t     ======================");
                                                            System.out.print("\t\t\t\t     Digite aqui > ");
                                                            int r =sc.nextInt();
                         
                                                             for(int p=r;p<=indice9;p++){
                                                            
                                                                
                                                                pacienteAB[p] = pacienteAB[p+1];
                                                                
                                                            }
                                                                
                                                                
                                                                break;
                                                            
                                                        }else{
                                                            return;
                                                        }
                                                } 
                                                break;
                                        }
                                        
                                    }
                                          
                                        
                                           
                                        
                                        
                                        break;
                                    }
                                    
                                    case 4:{//sair do programa
                                        System.out.println("\t\t\t\t     ===================");
                                        System.out.println("\t\t\t\t     Sistema Finalizado!");
                                        System.out.println("\t\t\t\t     ===================");
                                        System.exit(0);
                                        
                                        break;
                                    }
                                  
                                    
                                }
                            }
                     }while(num!=4);
                 }
                     if (codigo_login == codigo[3] || codigo_login == codigo[4] ){//menu médico
                         
                         do{
                              System.out.println("\t\t\t\t   ------------------------------");
                         System.out.println("\t\t\t\t    --   ESCOLHA UMA OPÇÃO      --");
                       
                         
                             if ((num>=1)&& (num<=2)){
                                 
                                    switch(num){
                                        case 1:{//consultas
                                      System.out.println("\t\t\t\t   --    Central de consultas   --");
                                System.out.println("\t\t\t\t     -- [1] para sangue tipo O    --");//feito
                                System.out.println("\t\t\t\t     -- [2] para sangue tipo A    --");//feito
                                System.out.println("\t\t\t\t     -- [3] para sangue tipo B    --");//feito
                                System.out.println("\t\t\t\t     -- [4] para sangue tipo AB   --");//feito
                                System.out.println("\t\t\t\t     -------------------------------");
                                System.out.print("\t\t\t\t     Digite aqui > "); 

                                num_1 = sc.nextInt();
                                
                                    if(num_1==1){
                                        System.out.println("\t\t\t\t     -- Central de consultas --");
                                        System.out.println("\t\t\t\t     --    [1] para Rh +     --");
                                        System.out.println("\t\t\t\t     --    [2] para Rh -     --");
                                        System.out.println("\t\t\t\t     --    [3] para sair     --");
                                        System.out.print("\t\t\t\t     Digite aqui > "); 

                                        number = sc.nextInt();
                                        
                                        if(number>=1 && number<=3){
                                            switch(number){
                                                
                                                case 1:{
                                                     System.out.println("\t\t\t\t    Tipo O positivo (O+)");
                                                            for(int p=0;p<=indice2;p++){
                                                                System.out.println("\t\t\t\t"+pacienteO[p]);
                                                            }
                                                            break;
                                                }
                                                case 2:{
                                                    System.out.println("\t\t\t\t    Tipo O negativo (O-)");
                                                    for(int p=0;p<=indice3;p++){
                                                        System.out.println("\t\t\t\t"+pacienteo[p]);
                                                    }
                                                    break;
                                                }
                                                case 3:{
                                                }default:
                                                    System.out.println("Número invalido!! Digite de 1 - 3.");
                                            }
                                        }else{
                                            System.out.println("Opcão invalida!! Digite de 1 - 3.");
                                        }
                                    }
                                        if(num_1==2){//tipo A
                                             System.out.println("\t\t\t\t    -- Central de consultas --");
                                             System.out.println("\t\t\t\t    --    [1] para Rh +     --");
                                             System.out.println("\t\t\t\t    --    [2] para Rh -     --");
                                             System.out.println("\t\t\t\t    --    [3] para sair     --");
                                             System.out.print("\t\t\t\t     Digite aqui > "); 

                                             number = sc.nextInt();
                                             
                                                 switch(number){
                                                     case 1:{
                                                         System.out.println("\t\t\t\t    Tipo A positivo (A+)");
                                                         for(int p=0;p<=indice4;p++){
                                                             System.out.println("\t\t\t\t"+pacientea[p]);
                                                         }
                                                         break;
                                                     }
                                                     case 2:{
                                                         System.out.println("\t\t\t\t    Tipo A negativo (A-)");
                                                         for(int p=0;p<=indice5;p++){
                                                             System.out.println("\t\t\t\t"+pacienteA[p]);
                                                         }
                                                         break;
                                                     }
                                                     case 3:{
                                                     }default:
                                                         System.out.println("Número invalido!! Digite de 1 - 3.");
                                                 }
                                        }
                                        if(num_1==3){//tipo B
                                             System.out.println("\t\t\t\t    -- Central de consultas --");
                                             System.out.println("\t\t\t\t    --    [1] para Rh +     --");
                                             System.out.println("\t\t\t\t    --    [2] para Rh -     --");
                                             System.out.println("\t\t\t\t    --    [3] para sair     --");
                                             System.out.print("\t\t\t\t     Digite aqui > "); 

                                             number = sc.nextInt();
                                             
                                             switch(number){
                                                 case 1:{
                                                      System.out.println("\t\t\t\t    Tipo B positivo (B+)");
                                                      for(int p=0;p<=indice6;p++){
                                                          System.out.println("\t\t\t\t"+pacienteb[p]);
                                                      }
                                                      break;
                                                 }
                                                 case 2:{
                                                     System.out.println("\t\t\t\t    Tipo B negativo (B-)");
                                                     for(int p=0;p<=indice7;p++){
                                                         System.out.println("\t\t\t\t"+pacienteB[p]);
                                                     }
                                                 }
                                                 case 3:{ 
                                                     break;
                                                 }default:
                                                 System.out.println("Número invalido!! Digite de 1 - 3.");
                                                 
                                             }
                                        }
                                            if(num_1==4){
                                                 System.out.println("\t\t\t\t    -- Central de consultas --");
                                             System.out.println("\t\t\t\t    --    [1] para Rh +     --");
                                             System.out.println("\t\t\t\t    --    [2] para Rh -     --");
                                             System.out.println("\t\t\t\t    --    [3] para sair     --");
                                             System.out.print("\t\t\t\t     Digite aqui > "); 

                                             number = sc.nextInt();
                                             
                                             switch(number){
                                                 case 1:{
                                                      System.out.println("\t\t\t\t   Tipo AB positivo (AB+)");
                                                      for(int p=0;p<=indice8;p++){
                                                          System.out.println("\t\t\t\t"+pacienteab[p]);
                                                      }
                                                      break;
                                                 }
                                                 case 2:{
                                                     System.out.println("\t\t\t\t    Tipo AB negativo (AB+)");
                                                        for(int p=0;p<=indice9;p++){
                                                            System.out.println("\t\t\t\t"+pacienteAB[p]);
                                                        }
                                                 }
                                                 case 3:{
                                                     break;
                                                 }default:
                                                   System.out.println("Número invalido!! Digite de 1 - 3.");  
                                             }
                                            }
                                        
                                   break;
                                 }
                                        case 2:{//sair do programa
                                                System.out.println("\t\t\t\t     ===================");
                                                System.out.println("\t\t\t\t     Sistema Finalizado!");
                                                System.out.println("\t\t\t\t     ===================");
                                                System.exit(0);
                                        }
                                    }
                             }
                         
                         }while(num>=1 || num<=2);
                     }
                    }
                    
             }
    }
}