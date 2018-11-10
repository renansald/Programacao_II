public class Produto {

  private double valor;

  public Produto(double x) throws ExceptionsProduto{
    setValor(x);
  }

  public void setValor(double valor) throws ExceptionsProduto{
    //try{
    if(valor > 0){
      this.valor = valor;
    }
    else
    throw new ExceptionsProduto("O valor não pode ser negativo");
    //}
    //catch (ExceptionsProduto e) {
    //e.printStackTrace();
    //}
  }

  public double getValor(){
    return valor;
  }

}
