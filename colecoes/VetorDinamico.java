package colecoes;

//generics(desde o Java 5)
//polimorfismo paramétrico
public class VetorDinamico<T>{
  private static final int LIMIAR_INFERIOR = 4;
  private T [] elementos;
  private int quantidade;
  private int capacidade;

  VetorDinamico(){
    quantidade = 0;
    capacidade = LIMIAR_INFERIOR;
    //intuição
    // elementos =  new T[capacidade];
    //realidade
    elementos = (T[]) new Object[capacidade];
  }

  public boolean estaVazio(){
    return quantidade == 0;
  }

  private void redimensionar(double fator){
    //1. Alocar um vetor com a capacidade apropriada
    // int [] aux = new int[(int)(capacidade * fator)];
    T [] aux = (T[])new Object[(int)(capacidade * fator)];
    //2. Copiar todo mundo
    for(int i = 0; i < quantidade; i++)
      aux[i] = elementos[i];
    //3. AJustar a capacidade
    capacidade = (int)(capacidade * fator);
    //4. Ajustar a variável elementos
    elementos = aux;
  }

  public void remover(){
    if(!estaVazio()){
      quantidade--;
      if(capacidade > LIMIAR_INFERIOR 
        && quantidade == capacidade / 4)
        redimensionar(0.5);        
    }
  }

  public boolean estaCheio(){
    // if(quantidade == capacidade)
    //   return true;
    // return false;
    return quantidade == capacidade;
  }

  public void adicionar(T e){
    //se está cheio
    if(estaCheio())
      redimensionar(2);
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