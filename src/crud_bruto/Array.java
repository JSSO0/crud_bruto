package crud_bruto;

public class Array {
    String nome_minerio[] = new String[10];
    int tamanho_minerio[] = new int[10];
    int valor_minerio[] = new int[10];
    int opcao[] = new int[10];
    
     public String[] getNomeMinerio() {
          return nome_minerio;
      }
  
      public void setNomeMinerio(String[] nome_minerio, int i) {
          this.nome_minerio = nome_minerio;
      }
  
      public int[] getTamanhoMinerio() {
          return tamanho_minerio;
      }
  
      public void setTamanhoMinerio(int[] tamanho_minerio) {
          this.tamanho_minerio = tamanho_minerio;
      }
  
      public int[] getValorMinerio() {
          return valor_minerio;
      }
  
      public void setValorMinerio(int[] valor_minerio) {
          this.valor_minerio = valor_minerio;
      }
  
      public int[] getOpcao() {
          return opcao;
      }
  
      public void setOpcao(int[] opcao) {
          this.opcao = opcao;
      }

    public void setTamanhoMinerio(int novoTamanho) {
    }
}
