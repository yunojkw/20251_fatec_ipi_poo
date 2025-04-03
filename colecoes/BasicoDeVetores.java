package colecoes;

public class BasicoDeVetores {
  public static void main(String[] args) {
    //declaração de vetores
    // int v1 [10];
    // int [] v1 = new int[10];  
    // [0, 0, 0, 0]
    // var v1 = new int[4]; //inicializado com zero por padrão
    // v1[0] = 5;
    // v1[1] = 7;
    // v1[2] = 2;
    // v1[3] = 2;
    int [] v1 = {5, 7, 2, 2};
    System.out.println(v1.length);
    //calcular a média desse vetor
    var media = 0d;
    for(int i = 0; i <= v1.length; i++){
      // System.out.println(v1[i]);  
      media += v1[i]; //media = media + v1[i];
    }
    media /= v1.length;
    System.out.println(media);
  } 
}
