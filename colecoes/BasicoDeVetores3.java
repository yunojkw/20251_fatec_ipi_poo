package colecoes;
class Veiculo{
  String placa;
  int ano;

  Veiculo(String placa, int ano){
    this.placa = placa;
    this.ano = ano;
  }
}

public class BasicoDeVetores3 {
  public static void main(String[] args) {
    Veiculo [] veiculos = new Veiculo[4];
    veiculos[0] = new Veiculo("abc-1234", 2000);
    trocaValor(veiculos);
    trocaValorV2(veiculos[0].ano);
    System.out.println(veiculos[0].ano);
    // String s = null;
    // System.out.println(s.length());
    // Veiculo veiculos [] = new Veiculo[4];

  }

  static void trocaValorV2(int ano){
    ano = 2001;
  }

  static void trocaValor(Veiculo [] veiculos){
    veiculos[0].ano = 2001;
  }
}
