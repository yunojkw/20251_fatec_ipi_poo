package colecoes;

public class VetorDinamico{
  private static final int LIMIAR_INFERIOR = 4;
  private int [] elementos;
  private int quantidade;
  private int capacidade;

  VetorDinamico(){
    quantidade = 0;
    capacidade = LIMIAR_INFERIOR;
    elementos =  new int[capacidade];
  }

  public void adicionar(int e){
    //numa linha só
    elementos[quantidade++] = e;
  }

  public String toString(){
    // String s = "a" + "b";
    //qtde: 3
    //cap: 4
    //1 2 3
    // return String.format(
    // );
    var sb = new StringBuilder("");
    sb.append("Qtde: ").append(quantidade).append("\n");
    sb.append("Cap: ").append(capacidade).append("\n");
    for(int i = 0; i < quantidade; ++i){
      sb.append(elementos[i]).append( i != quantidade - 1 ? " " : "");  
    }
    return sb.toString();
  }




}