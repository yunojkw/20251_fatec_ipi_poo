package oo_parte2;

public class Personagem {
    String nome = null;
    int energia = 10;
    int fome = 0;
    int sono = 0;
    
    void cacar(){
        if(energia >= 2){
            System.out.println(nome + " cacando");
            energia -= 2;
        }
        else{
            System.out.println(nome + " sem energia para cacar");
        }
        fome = fome < 10 ? fome + 1 : fome;
        sono = Math.min(sono + 1, 10); 
    }

    void comer(){
        if(fome >= 1){
            System.out.print(nome + " comendo\n");
            // fome = Math.max(0, fome - 1);
            fome--; //fome -=1 fome = fome - 1 --fome
            if(energia < 10)
                ++energia;
        }
        else{
            System.out.print(nome + " sem fome\n");
        }
    }

    void dormir(){
        if(sono >= 1){
            System.out.printf("%s dormindo\n", nome);
            sono--;
            switch(energia){
                case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9:
                    energia++;
                    break;
            }
        }
        else{
            System.out.printf("%s sem sono\n", nome);
        }
    }

    @Override
    public String toString(){
        return String.format(
            "%s: e: %d, f: %d, s: %d",
            nome, energia, fome, sono
        );   
    }
}
