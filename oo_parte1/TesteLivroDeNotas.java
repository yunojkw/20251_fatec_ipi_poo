public class TesteLivroDeNotas{
    public static void main(String... args){
        //1. Construir um livro de notas
        LivroDeNotas livroDeNotas = new LivroDeNotas("POO");
        // livroDeNotas.nomeDaDisciplina = "POO";
        livroDeNotas.setNomeDaDisciplina("POO");

        System.out.println(livroDeNotas.getNomeDaDisciplina());

        //2. Acionar o comportamento de exibir mensagem de boas vindas
        livroDeNotas.exibirMensagem();    
    }
}