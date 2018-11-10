public class Livro extends Produto{

  public String autor;
  public String titulo;

  public Livro(String autor, String titulo, double valor) throws ExceptionsProduto{
    super(valor);
    this.autor = autor;
    this.titulo = titulo;
  }

  public Livro(String autor, String titulo) throws ExceptionsProduto{
    super(16.9);
    this.autor = autor;
    this.titulo = titulo;
  }
  public String toString(){
    return ("Autor: "+autor+"\nTitulo: "+titulo+"\nValor: "+super.getValor());
  }
}
