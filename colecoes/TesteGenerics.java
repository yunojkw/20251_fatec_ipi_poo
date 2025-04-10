package colecoes;

class Musica{

}
public class TesteGenerics {
  public static void main(String[] args) {
    //Java7: operador diamante
    // VetorDinamico<Integer> 
    //         ints = new VetorDinamico<>();
    var meusInteiros = new VetorDinamico<Integer>();
    meusInteiros.adicionar(1);
    var minhasMusicas = new VetorDinamico<Musica>();
    minhasMusicas.adicionar(new Musica());
  }  
}
