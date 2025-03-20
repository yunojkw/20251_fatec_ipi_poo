package oo_parte2;

public class JogoV1 {
    public static void main(String[] args) {
        //1. Construir um objeto do tipo Personagem
        //java 10+: operador de inferência de tipo
        //var (feito pelo compilador)
        var p = new Personagem();
        //2. Atribua um nome ao seu personagem
        p.nome = "John";
        //3. Fazer com que ele execute todos os seus comportamentos, na ordem que você desejar
        //10, 0, 0
        p.cacar();
        //8, 1, 1
        p.comer();
        //9, 0, 1
        p.dormir();
        //10, 0, 0
    }
}
