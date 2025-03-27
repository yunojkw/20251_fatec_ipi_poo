package sobrecarga;

public class Calculadora {

    // public long somar(long a, long b){
    //     return a + b;
    // }

    // public double somar(long a, long b){
    //     return a + b;
    // }

    // public long somar(long x, long y){
    //     return x + y;
    // }

    public long somar(String s1, String s2){
        return Long.parseLong(s1) + Long.parseLong(s2);
    }

    public long somar(long a, long b, long c){
        return a + b + c;
    }

    public long somar(String s1, long l){
        return Long.parseLong(s1) + l;
    }

    public long somar(long l, String s){
        //não vale usar + e nem Long.parseLong
        return somar(s, l);
    }
}
