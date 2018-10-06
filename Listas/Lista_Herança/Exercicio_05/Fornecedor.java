public class Fornecedor extends Pessoa {

  private double cred, valorEmDivida;

  public Fornecedor(String nome, String CPF, double cred, double valorEmDivida){
    super(nome, CPF);
    this.cred = cred;
    this.valorEmDivida = valorEmDivida;
  }

  public double getCred(){
    return cred;
  }

  public double getValorEmDivida(){
    return valorEmDivida;
  }

  public String getNome(){
    return super.getNome();
  }

  public String getCPF(){
    return super.getCPF();
  }

  public double obterSaldo(){
    return (cred - valorEmDivida);
  }
}
