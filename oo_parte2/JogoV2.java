package oo_parte2;
import java.util.Random;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;


public class JogoV2 {
    public static void main(String[] args) throws Exception {
        Class<?> classe = Personagem.class;
        Method [] metodos = classe.getDeclaredMethods();
        int numeroDeMetodos = 0;

        for (Method metodo : metodos) {
            if (Modifier.isPublic(metodo.getModifiers()) && !metodo.getName().equals("toString")) {
                numeroDeMetodos++;
            }
        }
        var gerador = new Random();
        var p = new Personagem();
        var p2 = new Personagem("Lebron", 10, 10, 0);
        var p3 = new Personagem("Soneca", 4, 4, 10);
        Personagem [] personagens = {p, p2, p3};
        while(true){
            var quemVaiJogar = gerador.nextInt(personagens.length);
            //1: caçar
            //2: comer
            //3: dormir
            //descobrir quantos métodos a classe Personagem possui
            // var qtosMetodos = Personagem.getMethods().length;   
            var oQueFazer = 1 + gerador.nextInt(numeroDeMetodos);//[0, 3)
            switch(oQueFazer){
                case 1:
                    personagens[quemVaiJogar].cacar();
                    break;
                case 2:
                    personagens[quemVaiJogar].comer();
                    break;
                case 3:
                    personagens[quemVaiJogar].dormir();
                    break;
            }
            System.out.println(personagens[quemVaiJogar]);
            System.out.println("************");
            Thread.sleep(8000);
        }
    }    
}
