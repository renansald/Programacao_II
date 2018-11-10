public class Main {
  public static void main(String[] args) {
    Biblioteca b = new Biblioteca();
    Funcionario f1 = new Funcionario("Roger", "123.123.4", "hawaii");
    Cliente c1 = new Cliente("Vinicius", "12.12.12");
    b.addPessoa(f1);
    b.addPessoa(c1);
    Livro l = new Livro("As cronicas dos senhores de Castelo", "Brasman & Norris", 134, "Disponivel");
    Livro l2 = new Livro("Alice in wonderland", "Lewis Carroll", 135, "Disponivel");
    Livro l3 = new Livro("O nevoeiro", "Stephan King", 136, "Disponivel");
    b.addLivro(l);
    b.addLivro(l2);
    b.addLivro(l3);
    try{
      b.reseva("Roger", "123.123.4", "Vinicius", "12.12.12", "As cronicas dos senhores de Castelo");
      b.reseva("Roger", "123.123.4", "Vinicius", "12.12.12", "Alice in wonderland");
      b.reseva("Roger", "123.123.4", "Vinicius", "12.12.12", "O nevoeiro");
      // para teste de erro b.reseva("Roger", "123.123.4", "Vinicius", "12.12.12", "A vida de rogerinho do co");
      c1.livrosCliente();
      b.devolve("Roger", "123.123.4", "Vinicius", "12.12.12", 135);
      c1.livrosCliente();
    }
    catch (ExceptionBiblioteca e) {
      e.printStackTrace();
    }
  }
}
