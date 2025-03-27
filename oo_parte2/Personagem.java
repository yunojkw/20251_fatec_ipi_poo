package oo_parte2;
import java.util.Random;
public class Personagem {
    
    private String nome = null;
    private String [] possiveisNomes = {"Steve", "Alex", "Mark"};
    private int energia;
    private int fome;
    private int sono;
    
    public Personagem(){
        nome = obterNomeAleatorio();
        energia = 10;
        fome = 0;
        sono = 0;
    }
    
    private String obterNomeAleatorio(){
        var gerador = new Random();
        return possiveisNomes[gerador.nextInt(possiveisNomes.length)];
    }
    //deve ser possivel construir um Personagem com dados passados pela classe cliente
    //se algum valor for invalido, usar aquele que é padrão para a respectiva propriedade
    //incluir a validação de nome: somente valem nomes que tenham pelo menos 4 caracteres
    //se essa regra for violada, atribuir um nome aleatório
    public Personagem(String nome, int energia, int fome, int sono){
        this.nome = 
            nome.length() >= 4 ? 
            nome:
            obterNomeAleatorio();
        this.energia = 
            energia >= 0 && energia <= 10 ?
            energia:
            10;
        if(fome >= 0 && fome <= 10)
            this.fome = fome;
        else
            this.fome = 0;
        switch(sono){
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10:
                this.sono = sono;
            default:
                this.sono = 0;
        }
    }
    
    public void cacar(){
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

    public void comer(){
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

    public void dormir(){
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
