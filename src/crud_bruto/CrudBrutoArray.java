package crud_bruto;
import java.util.Scanner;
import java.util.Arrays;


import crud_bruto.Array;

public class CrudBrutoArray { 
    
    public static void main(String[] args) throws Exception {
        Array array = new Array();
        Scanner scanner = new Scanner(System.in);

        while (true) {
        System.out.println("Digite o que você deseja fazer: ");
        System.out.println("1 - Para declarar novos dados");
        System.out.println("2 - Para editar valores já declarados");
        System.out.println("3 - Para apagar valores já declarados");
        System.out.println("0 - Para sair");
        int opcao = scanner.nextInt();

        if(opcao == 1) {
            Receber_Valores(array); // Passa o objeto para o método Receber_Valores
        } else if(opcao == 2) {
            Editar_Valores(array); // Passa o objeto para o método Editar_Valores
        } else if(opcao == 3) {
            Deletar_Valores(array); // Passa o objeto para o método Deletar_Valores
        } else if (opcao == 0) {
            break; // Encerra o loop e sai do método main
        } else {
            System.out.println("Opção inválida, digite novamente");
        }
    }
    }

    public static void Receber_Valores(Array array){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do minério: \n");
        String nome = scanner.nextLine();
        String[] nomes = array.getNomeMinerio();
        String[] novoNomes = new String[nomes.length + 1];
        System.arraycopy(nomes, 0, novoNomes, 0, nomes.length);
        novoNomes[nomes.length] = nome;
        array.setNomeMinerio(novoNomes);

        System.out.print("Digite o tamanho do minério: \n");
        int tamanho = scanner.nextInt();
        int[] tamanhos = array.getTamanhoMinerio();
        int[] novoTamanhos = new int[tamanhos.length + 1];
        System.arraycopy(tamanhos, 0, novoTamanhos, 0, tamanhos.length);
        novoTamanhos[tamanhos.length] = tamanho;
        array.setTamanhoMinerio(novoTamanhos);
        
        System.out.print("Digite o valor do minério: \n");
        int valor = scanner.nextInt();
        int[] valores = array.getValorMinerio();
        int[] novoValores = new int[valores.length + 1];
        System.arraycopy(valores, 0, novoValores, 0, valores.length);
        novoValores[valores.length] = valor;
        array.setValorMinerio(novoValores);


        System.out.print("Agora o que irá fazer?\n");
        System.out.print("1 - Para retornar ao menu anterior\n");
        System.out.print("2 - Para retornar ao menu inicial\n");
        int retorno = scanner.nextInt();
        if(retorno ==1){
            Receber_Valores(array);
        }
        else if(retorno==2){
            return;

        }

        
    }

    public static void Editar_Valores(Array array){
        Scanner scanner = new Scanner(System.in);

       /* */ System.out.println("Dados atuais são:\n" +
        "Nome do minério: " + Arrays.toString(array.getNomeMinerio())+"\n"+
        "Tamanho do minério: " + Arrays.toString(array.getTamanhoMinerio()) + "\n" +
        "Valor do minério: " + Arrays.toString(array.getValorMinerio()) + "\n");

        System.out.print("Escolha a opção que deseja realizar"+"\n"+
        "1 - Para editar o nome do Minerio"+"\n"
        +"2 - Para editar o Tamanho do Minerio"+"\n"+ 
        "3 - Para editar o valor do Minerio\n");
        int opcao = scanner.nextInt();

        if(opcao==1){
            String[] novoNomes = array.getNomeMinerio();
            for(int i=0; i<novoNomes.length; i++){
                System.out.println("O nome atual do minério é: " + novoNomes[i]);
                System.out.println("Digite o novo nome do minério:");
                String novoNome = scanner.next();
                array.setNomeMinerio(novoNomes);
                //array.setNomeMinerio(novoNomes);
                System.out.println("O nome do minério foi atualizado para: " + array.getNomeMinerio()[i]);
            }
        }

        else if(opcao==2){
            int[] novoTamanhos = array.getTamanhoMinerio();
            for(int i=0; i<novoTamanhos.length; i++){
                System.out.println("O Tamanho atual do minério é: " + novoTamanhos[i]);
                System.out.println("Digite o novo tamanho do minério:"); 
                int tamanhos = scanner.nextInt();
                int[] valorTamanhos = new int[novoTamanhos.length + 1];
                System.arraycopy(novoTamanhos, 0, valorTamanhos, 0, novoTamanhos.length);
                valorTamanhos[novoTamanhos.length] = tamanhos;
                array.setValorMinerio(valorTamanhos);
                System.out.println("O valor do minério foi atualizado para: " + array.getTamanhoMinerio());
            }
        }
        else{
            int[] valoresMinerios = array.getValorMinerio();
            for(int i=0; i<valoresMinerios.length; i++){
                System.out.println("O valor atual do minério é: " + valoresMinerios[i]);
                System.out.println("Digite o novo valor do minério:");
                int novoValor = scanner.nextInt();
                int[] novoValores = new int[valoresMinerios.length + 1];
                System.arraycopy(valoresMinerios, 0, novoValores, 0, valoresMinerios.length);
                novoValores[valoresMinerios.length] = novoValor;
                array.setValorMinerio(novoValores);
                System.out.println("O valor do minério foi atualizado para: " + array.getValorMinerio());
            }
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

    public static void Deletar_Valores (Array array){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Diga de qual dado você deseja apagar um valor?\n"+
        "1 - Para editar o nome do Minerio"+"\n"
        +"2 - Para editar o Tamanho do Minerio\n"+
        "3 - Para editar o valor do Minerio\n");

        int opcao = scanner.nextInt();

        if(opcao==1){         
            System.out.print("O Nome do Minerio é "+array.getNomeMinerio()+"\n");
            System.out.print("e agora é...\n");
            array.setNomeMinerio(null);
            System.out.print("O Nome do Minerio é "+array.getNomeMinerio()+"\n");
            
        }
        else if(opcao==2){
            System.out.print("O Tamanho do minério é:"+array.getTamanhoMinerio()+"\n"); 
            System.out.print("agora é...\n"); 
            array.setTamanhoMinerio(null);
            System.out.print("O Tamanho do minério é:"+array.getTamanhoMinerio()+"\n"); 
        }
        else if(opcao==3){
            System.out.print("O valor do minério é:"+array.getValorMinerio()+"\n");
            System.out.print("agora é...\n");
            array.setValorMinerio(null); 
            System.out.print("O valor do minério é:"+array.getValorMinerio()+"\n");
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


