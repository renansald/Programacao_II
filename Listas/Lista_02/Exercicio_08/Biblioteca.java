import java.util.ArrayList;

public class Biblioteca {

  ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
  ArrayList<Livro> acervo = new ArrayList<Livro>();

  public void addPessoa(Pessoa p){
    pessoas.add(p);
  }

  public void addLivro(Livro l){
    acervo.add(l);
  }

  public void reseva(String nome, String matricula, String nomeCliente, String matriculaCliente, String nomeLivro) throws ExceptionBiblioteca{
    Cliente c = clientes(nomeCliente, matriculaCliente);
    Livro l = livroEmprestimo(nomeLivro);
    Funcionario f = funcionarios(nome, matricula);
    f.reserva(c, l);
  }

  public void devolve(String nome, String matricula, String nomeCliente, String matriculaCliente, int codigo) throws ExceptionBiblioteca{
    Cliente c = clientes(nomeCliente, matriculaCliente);
    Livro l = livroDevolucao(codigo);
    Funcionario f = funcionarios(nome, matricula);
    f.devolva(c, l);

  }

  public void existeLivro(String l){
    for(int i = 0; i < acervo.size(); i++){
      if(acervo.get(i).titulo == l || acervo.get(i).autor == l){
        System.out.println(acervo.get(i).toString());
      }
    }
  }

  public void existeLivro(int l){
    for(int i = 0; i < acervo.size(); i++){
      if(acervo.get(i).codigo == l){
        System.out.println(acervo.get(i).toString());
      }
    }
  }

  public Funcionario funcionarios(String nome, String matricula)throws ExceptionBiblioteca{
    Funcionario f = new Funcionario();
    for(int i = 0; i < pessoas.size(); i++){
      if(pessoas.get(i).getNome() == nome && pessoas.get(i).getId() == matricula){
        if(pessoas.get(i) instanceof Funcionario){
          return f = (Funcionario) pessoas.get(i);
        }
      }
    }
    throw new ExceptionBiblioteca("Não existe o funcionario");
  }

  public Livro livroEmprestimo(String nome) throws ExceptionBiblioteca{
    Livro l = new Livro();
    int x = 0;
    for(int a = 0; a < acervo.size(); a++){
      if(acervo.get(a).titulo == nome && acervo.get(a).situacao == "Disponivel"){
        return l = acervo.get(a);
      }
      else if(acervo.get(a).titulo == nome && acervo.get(a).situacao == "Indisponivel"){
        x = 1;
      }
    }
    if(x == 1){
      throw new ExceptionBiblioteca("Não tem disponibilidade");
    }
    else{
      throw new ExceptionBiblioteca("Livro não existe no acervo");
    }
  }

  public Livro livroDevolucao(int codigo) throws ExceptionBiblioteca{
    Livro l = new Livro();
    for(int a = 0; a < acervo.size(); a++){
      if(acervo.get(a).codigo == codigo && acervo.get(a).situacao == "Indisponivel"){
        return l = acervo.get(a);
      }
    }
    throw new ExceptionBiblioteca("Nao é o livro que o usuário pegou");
  }

  public Cliente clientes(String nome, String matricula) throws ExceptionBiblioteca{
    Cliente c = new Cliente ();
    for(int a = 0; a < pessoas.size(); a++){
      if(pessoas.get(a).getNome() == nome && pessoas.get(a).getId() == matricula){
        if(pessoas.get(a) instanceof Cliente){
          return c = (Cliente) pessoas.get(a);
        }
      }
    }
    throw new ExceptionBiblioteca("Nao existe o cliente");
  }

}
