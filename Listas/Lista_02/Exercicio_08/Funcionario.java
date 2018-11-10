public class Funcionario extends Pessoa {

  String senha;

  public Funcionario(){}

    public Funcionario(String nome, String codigo, String senha){
      super(nome, codigo);
      this.senha = senha;
    }

    private void reservaLivro(Cliente c, Livro l){
      if(l.situacao == "Disponivel"){
        c.addLivro(l);
        l.situacao = "Indisponivel";
      }
    }

    public void reserva(Cliente c, Livro l){
      reservaLivro(c, l);
    }

    public void devolva(Cliente c, Livro l){
      devolveLivro(c, l);
    }

    private void devolveLivro(Cliente c, Livro l){
      for (int i = 0; i < c.livros.size(); i++) {
        if(l == c.livros.get(i)){
          c.livros.remove(i);
          l.situacao = "Indisponivel";
        }
      }
    }

    public String getNome(){
      return super.getNome();
    }

    public String getId(){
      return super.getId();
    }
  }
