public class Mouse extends Produto {

  int dpi;
  String nome;

  public Mouse(int dpi, String nome, double valor)throws ExceptionsProduto{
    super(valor);
    this.dpi = dpi;
    this.nome = nome;
  }

  public Mouse(String nome, double valor) throws ExceptionsProduto{
    super(valor);
    dpi = 1000;
    this.nome = nome;

  }

  public String toString(){
    return ("Marca: "+nome+"\nDPI: "+dpi+"\nValor: "+super.getValor());
  }
}
