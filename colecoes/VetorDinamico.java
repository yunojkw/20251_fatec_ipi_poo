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

  public boolean estaVazio(){
    return quantidade == 0;
  }

  public void remover(){
    if(!estaVazio()){
      quantidade--;
      if(capacidade > LIMIAR_INFERIOR && quantidade == capacidade / 4){
        //1. Alocar um novo vetor com metade do tamanho
        int [] aux = new int[capacidade / 2];
        //2. Copiar todo mundo
        for (int i = 0; i < quantidade; i++)
          aux[i] = elementos[i];
        //3. Ajustar a capacidade
        capacidade /= 2;
        //4. Ajustar a variável elementos
        elementos = aux;
      }
    }
  }

  public boolean estaCheio(){
    // if(quantidade == capacidade)
    //   return true;
    // return false;
    return quantidade == capacidade;
  }

  public void adicionar(int e){
    //se está cheio
    if(estaCheio()){
      //redimensionar
      //1. Alocar um novo vetor com o dobro da capacidade
      int [] aux = new int[capacidade * 2];
      //2. Copiar todo mundo do elementos para o novo vetor
      for(int i = 0; i < quantidade; i++)
        aux[i] = elementos[i];
      //3. Atualizar o valor de capacidade
      capacidade *= 2;
      //4. Atualizar a variável de referência elementos, ela deve apontar para o novo vetor
      elementos = aux;
    }
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