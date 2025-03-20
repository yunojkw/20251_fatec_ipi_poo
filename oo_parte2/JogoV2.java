package oo_parte2;
import java.util.Random;
public class JogoV2 {
    public static void main(String[] args) throws Exception {
        var gerador = new Random();
        var p = new Personagem();
        p.nome = "Curry";
        while(true){
            //1: caçar
            //2: comer
            //3: dormir   
            var oQueFazer = 1 + gerador.nextInt(3);//[0, 3)
            switch(oQueFazer){
                case 1:
                    p.cacar();
                    break;
                case 2:
                    p.comer();
                    break;
                case 3:
                    p.dormir();
                    break;
            }
            System.out.println(p);
            System.out.println("************");
            Thread.sleep(8000);
        }
    }    
}
