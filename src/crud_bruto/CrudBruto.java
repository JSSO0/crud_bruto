package crud_bruto;
import java.util.Scanner;

import crud_bruto.Minerio;

public class CrudBruto { 
    
    public static void main(String[] args) throws Exception {
        Minerio minerio = new Minerio();
        Scanner scanner = new Scanner(System.in);

        while (true) {
        System.out.println("Digite o que você deseja fazer: ");
        System.out.println("1 - Para declarar novos dados");
        System.out.println("2 - Para editar valores já declarados");
        System.out.println("3 - Para apagar valores já declarados");
        System.out.println("0 - Para sair");
        int opcao = scanner.nextInt();

        if(opcao == 1) {
            Receber_Valores(minerio); // Passa o objeto para o método Receber_Valores
        } else if(opcao == 2) {
            Editar_Valores(minerio); // Passa o objeto para o método Editar_Valores
        } else if(opcao == 3) {
            Deletar_Valores(minerio); // Passa o objeto para o método Deletar_Valores
        } else if (opcao == 0) {
            break; // Encerra o loop e sai do método main
        } else {
            System.out.println("Opção inválida, digite novamente");
        }
    }
    }

    public static void Receber_Valores(Minerio minerio){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do minério: \n");
        String nome = scanner.nextLine();
        minerio.setNomeMinerio(nome);

        System.out.print("Digite o tamanho do minério: \n");
        int tamanho = scanner.nextInt();
        minerio.setTamanhoMinerio(tamanho);
        
        System.out.print("Digite o valor do minério: \n");
        int valor = scanner.nextInt();
        minerio.setValorMinerio(valor);


        System.out.print("Agora o que irá fazer?\n");
        System.out.print("1 - Para retornar ao menu anterior\n");
        System.out.print("2 - Para retornar ao menu inicial\n");
        int retorno = scanner.nextInt();
        if(retorno ==1){
            Receber_Valores(minerio);
        }
        else if(retorno==2){
            return;

        }

        
    }

    public static void Editar_Valores(Minerio minerio){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dados atuais são:\n" +
        "Nome do minério: " + minerio.getNomeMinerio() + "\n" +
        "Tamanho do minério: " + minerio.getTamanhoMinerio() + "\n" +
        "Valor do minério: " + minerio.getValorMinerio() + "\n");

        System.out.print("Escolha a opção que deseja realizar"+"\n"+
        "1 - Para editar o nome do Minerio"+"\n"
        +"2 - Para editar o Tamanho do Minerio"+"\n"+ 
        "3 - Para editar o valor do Minerio\n");
        int opcao = scanner.nextInt();

        if(opcao==1){
            System.out.println("O nome atual do minério é: " + minerio.getNomeMinerio());
            System.out.println("Digite o novo nome do minério:");
            String novoNome = scanner.next();
            minerio.setNomeMinerio(novoNome);
            System.out.println("O nome do minério foi atualizado para: " + minerio.getNomeMinerio());
        }
        else if(opcao==2){
            System.out.println("O tamanho atual do minério é: " + minerio.getTamanhoMinerio());
            System.out.println("Digite o novo tamanho do minério:");
            int novoTamanho = scanner.nextInt();
            minerio.setTamanhoMinerio(novoTamanho);
            System.out.println("O tamanho do minério foi atualizado para: " + minerio.getTamanhoMinerio());    
        }
        else{
            System.out.println("O valor atual do minério é: " + minerio.getValorMinerio());
            System.out.println("Digite o novo valor do minério:");
            int novoValor = scanner.nextInt();
            minerio.setValorMinerio(novoValor);
            System.out.println("O valor do minério foi atualizado para: " + minerio.getValorMinerio());
       }
       while (true) {
        System.out.println("Agora o que irá fazer?\n" +
            "1 - Para retornar ao menu anterior\n" +
            "2 - Para retornar ao menu inicial\n");
        int retorno = scanner.nextInt();
        if (retorno == 1) {
            return;
        } else if (retorno == 2) {
            break;
        }
    }


    }

    public static void Deletar_Valores (Minerio minerio){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Diga de qual dado você deseja apagar um valor?\n"+
        "1 - Para editar o nome do Minerio"+"\n"
        +"2 - Para editar o Tamanho do Minerio\n"+
        "3 - Para editar o valor do Minerio\n");

        int opcao = scanner.nextInt();

        if(opcao==1){         
            System.out.print("O Nome do Minerio é "+minerio.getNomeMinerio()+"\n");
            System.out.print("e agora é...\n");
            minerio.setNomeMinerio(null);
            System.out.print("O Nome do Minerio é "+minerio.getNomeMinerio()+"\n");
            
        }
        else if(opcao==2){
            System.out.print("O Tamanho do minério é:"+minerio.getTamanhoMinerio()+"\n"); 
            System.out.print("agora é...\n"); 
            minerio.setTamanhoMinerio(0);
            System.out.print("O Tamanho do minério é:"+minerio.getTamanhoMinerio()+"\n"); 
        }
        else if(opcao==3){
            System.out.print("O valor do minério é:"+minerio.getValorMinerio()+"\n");
            System.out.print("agora é...\n");
            minerio.setValorMinerio(0); 
            System.out.print("O valor do minério é:"+minerio.getValorMinerio()+"\n");
        }
        while (true) {
            System.out.println("Agora o que irá fazer?\n" +
                "1 - Para retornar ao menu anterior\n" +
                "2 - Para retornar ao menu inicial\n");
            int retorno = scanner.nextInt();
            if (retorno == 1) {
                return;
            } else if (retorno == 2) {
                break;
            }
    }

   
    
}
}


