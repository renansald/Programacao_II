public class Livro {

  String titulo;
  String autor;
  int codigo;
  String situacao;

  public Livro(){}

    public Livro(String titulo, String autor, int codigo, String situacao){
      this.codigo = codigo;
      this.autor = autor;
      this.titulo = titulo;
      this.situacao = situacao;
    }

    public String toString(){
      return ("Titulo: "+titulo+"\nAutor: "+autor+"\nCodigo: "+codigo+"\nSituação: "+situacao+"\n\n");
    }
  }
