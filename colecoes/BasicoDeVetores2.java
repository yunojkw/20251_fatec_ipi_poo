package colecoes;
// int v1 = 2;
// int * p1 = &v1;

// void f(int * p){

// }

// f2(v1)

// void f2 (int & p){

// }

// f(p1)
// f(&v1);

public class BasicoDeVetores2 {
  public static void main(String[] args) {
    int [] v = {1, 2};
    // int * v = malloc(sizeof(int) * 4);
    manipulaVetor(v);
    System.out.println(v[0]);
    System.out.println(v[1]);
    //passagem de parâmetro por valor e por referência
    // int b = 3;
    // manipulaValor(b);
    // System.out.println(b);
  }
  static void manipulaVetor(int [] x){
    x[0] = 10;
    x[1] = 20;
  }

  //passagem por cópia
  static void manipulaValor(int a){
    a = 2;
  }
}
