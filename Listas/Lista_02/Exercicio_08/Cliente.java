import java.util.ArrayList;

public  class Cliente extends Pessoa {

  ArrayList<Livro> livros = new ArrayList<Livro>();

  public Cliente(){}

    public Cliente(String nome, String matricula){
      super(nome, matricula);
    }

    public void addLivro(Livro l){
      livros.add(l);
    }

    public void livrosCliente(){
      System.out.println("Livros com "+super.getNome());
      for(int i = 0; i < livros.size(); i++){

        System.out.println(livros.get(i).toString());
      }
    }
  }
