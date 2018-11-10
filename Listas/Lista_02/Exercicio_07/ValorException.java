public class ValorException extends Exception {

  public ValorException(char c){
    super("Não existe referencia a "+c);
  }
}
