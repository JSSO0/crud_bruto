package crud_bruto;
import java.util.Scanner;

import crud_bruto.Minerio;

public class App { 
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o que você deseja fazer: ");
        System.out.println("1 - Para declarar novos dados");
        System.out.println("2 - Para editar valores já declarados");
        System.out.println("3 - Para apagar valores já declarados");
        
        Minerio minerio = new Minerio();

        int opcao = scanner.nextInt();
        if(opcao == 1) {
            Receber_Valores(minerio); // Passa o objeto para o método Receber_Valores
        } else if(opcao == 2) {
            Editar_Valores(minerio); // Passa o objeto para o método Editar_Valores
        } else if(opcao == 3) {
            Deletar_Valores(minerio); // Passa o objeto para o método Deletar_Valores
        }



    }/* */

    
    public static void Receber_Valores(Minerio minerio){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do minério: ");
        minerio.nome_minerio = scanner.nextLine();

        System.out.print("Digite o tamanho do minério: ");
        minerio.tamanho_minerio = scanner.nextInt();
        
        System.out.print("Digite o valor do minério: ");
        minerio.valor_minerio = scanner.nextInt();
    }
    public static void Editar_Valores(Minerio minerio){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dados atuais são:" + "\n"+
        "Nome do minerio:"+minerio.nome_minerio+ "\n"+
        "Tamanho do Minerio:"+ minerio.tamanho_minerio+ "\n"+
        "Valor do Minério:"+minerio.valor_minerio+ "\n");

        System.out.print("Escolha a opção que deseja realizar"+"\n"+
        "1 - Para editar o nome do Minerio"+"\n"
        +"2 - Para editar o Tamanho do Minerio"+"\n"+ 
        "3 - Para editar o valor do Minerio");
        int opcao = scanner.nextInt();

        if(opcao==1){
            System.out.print("o Nome do Minerio é"+minerio.nome_minerio);
            System.out.print("Digite o novo nome do Minerio");
            minerio.nome_minerio = scanner.nextLine();
        }
        else if(opcao==2){
            System.out.print("O Tamanho do minério é:"+minerio.tamanho_minerio);
            System.out.print("Digite o novo nome do Tamanho do minério");
            minerio.tamanho_minerio = scanner.nextInt();
        }
        else{
            System.out.print("O valor do minério é:"+minerio.valor_minerio);
            System.out.print("Digite o novo Valor do minério");
            minerio.valor_minerio = scanner.nextInt();
        }
    }
    public static void Deletar_Valores (Minerio minerio){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Diga de qual dado você deseja apagar um valor?\n"+
        "1 - Para editar o nome do Minerio"+"\n"
        +"2 - Para editar o Tamanho do Minerio\n"+
        "3 - Para editar o valor do Minerio");

        int opcao = scanner.nextInt();

        if(opcao==1){         
            System.out.print("Digite o novo nome do Minerio");
            minerio.nome_minerio = null;
            System.out.print("o Nome do Minerio é"+minerio.nome_minerio);
        }
        else if(opcao==2){
            System.out.print("Digite o novo nome do Tamanho do minério");
            minerio.tamanho_minerio = 0;
            System.out.print("O Tamanho do minério é:"+minerio.tamanho_minerio);
        }
        else if(opcao==3){
            System.out.print("Digite o novo Valor do minério");
            minerio.valor_minerio = 0;
            System.out.print("O valor do minério é:"+minerio.valor_minerio);
        }
    }

   
    
}


