package colecoes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JOptionPane;
class Trak implements Comparable <Trak>{
  private String titulo;
  private int avaliacao;

  public int getAvaliacao() {
    return avaliacao;
  }

  public void setAvaliacao(int avaliacao) {
    this.avaliacao = avaliacao;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public Trak(String titulo, int avaliacao){
    this.titulo = titulo;
    this.avaliacao = avaliacao;
  }
  public Trak(String titulo){
    this.titulo = titulo;
  }

  public String toString(){
    return String.format(
      "Título: %s, Avaliação: %d",
      titulo, avaliacao
    );
  }

  @Override
  public int compareTo(Trak o) {
    //se a this for menor, então devolvemos -1
    //se a this for igual à o, devolvemos 0
    //senão, devolvemos 1
    return this.titulo.compareTo(o.titulo);
  }

  @Override
  public boolean equals(Object obj) {
    var outra = (Trak)obj;
    return this.titulo.equals(outra.titulo);
  }
}

class AvaliacaoComparator implements Comparator <Trak>{
    @Override
    public int compare(Trak t1, Trak t2) {
      //se a avaliação de t1 for maior, devolvemos -1
      //se forem iguais, devolvemos 0
      //se a avliaação de t1 for menor, devolvemos 1
      if(t1.getAvaliacao() > t2.getAvaliacao())
        return -1;
      if (t1.getAvaliacao() == t2.getAvaliacao())
        return t1.compareTo(t2);
      return 1;
    }
}

public class MyTrakz {
  public static void main(String[] args) {
    // var minhasTrakz = new VetorDinamico<Trak>();  
    var minhasTrakz = new ArrayList<Trak>();
    var menu = "1-Cadastrar\n2-Remover\n3-Atualizar\n4-Listar ordenado por nome\n5-Listar ordenado por avaliação\n6-Avaliar\n0-Sair";
    int op;
    do{
      op = Integer.parseInt(
          JOptionPane.showInputDialog(menu)
      );
      switch(op){
        case 1:{
          var titulo = JOptionPane.showInputDialog("Titulo?");
          var trak = new Trak(titulo);
          minhasTrakz.add(trak);
          JOptionPane.showMessageDialog(null, "Trak adicionada!");
          break;
        }
        case 2:{
          var titulo = JOptionPane.showInputDialog("Titulo?");
          var trak = new Trak(titulo);
          if(minhasTrakz.contains(trak)){
            minhasTrakz.remove(trak);
            JOptionPane.showMessageDialog(
              null,
              "Música removida!"
            );
          }
          else{
            JOptionPane.showMessageDialog(
              null,
              "A música não foi encontrada!"
            );
          }
          break;
        }          
        case 3:{
          var titulo = JOptionPane.showInputDialog("Titulo?");
          var trak = new Trak(titulo);
          var indice = minhasTrakz.indexOf(trak);
          if(indice >= 0){
            var novoTitulo = JOptionPane.showInputDialog("Novo título?");
            minhasTrakz.get(indice).setTitulo(novoTitulo);
            JOptionPane.showMessageDialog(
              null,
              "Música atualizada!"
            );
          }
          else{
            JOptionPane.showMessageDialog(
              null,
              "Música não encontrada!"
            );
          }
          break;
        }
        case 4:{
          if(minhasTrakz.isEmpty()){
            JOptionPane.showMessageDialog(
              null, 
              "Lista vazia"
            );              
          }
          else{
            //opera in-place: altera a lista
            Collections.sort(minhasTrakz);
            //[]
            JOptionPane.showMessageDialog(
              null,
              minhasTrakz
            );  
          }
          break;
        }
      case 5:{
        if(minhasTrakz.isEmpty()){  
          JOptionPane.showMessageDialog(
            null,
            "Lista vazia!"
          );
        }
        else{
          Collections.sort(
            minhasTrakz,
            new AvaliacaoComparator()
          );
        }
        break;
      }
        case 6:{
          var titulo = JOptionPane.showInputDialog("Titulo?");
          var trak = new Trak(titulo);
          var indice = minhasTrakz.indexOf(trak);
          if(indice != -1){//encontrou
            var avaliacao = Integer.parseInt(
              JOptionPane.showInputDialog("Avaliação?")
            );
            minhasTrakz.get(indice).setAvaliacao(avaliacao);
            JOptionPane.showMessageDialog(
              null,
              "Música avaliada!"
            );
          }
          else{
            JOptionPane.showMessageDialog(
              null, 
              "Música não encontrada"
            );
          }
          break;
        }
        case 0:{
          JOptionPane.showMessageDialog(null, "Até logo!");
          break;
        }
        default:{
          JOptionPane.showMessageDialog(null, "Opção inválida");
          break;
        }
      }
    }while(op != 0);
  }  
}
