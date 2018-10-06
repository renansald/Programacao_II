public class Operario extends Empregado {

  double valorProducao, comissao;

  public Operario(String nome, String CPF, int numeroSeccao, double salarioBase, double INSS, double valorProducao, double comissao){
    super(nome, CPF, numeroSeccao, salarioBase, INSS);
    this.valorProducao = valorProducao;
    this.comissao = comissao;
  }

  public String getNome(){
    return super.getNome();
  }

  public String getCPF(){
    return super.getCPF();
  }

  public int numeroSeccao(){
    return super.getNumeroSeccao();
  }

  public double getSalarioBase(){
    return super.getSalarioBase();
  }

  public double getINSS(){
    return super.getINSS();
  }

  public double getValorProducao(){
    return valorProducao;
  }

  public double getComissao(){
    return comissao;
  }

  public void setNome(String y){
    super.setNome(y);
  }

  public void setCPF(String y){
    super.setCPF(y);
  }

  public void setNumeroSeccao(int y){
    super.setNumeroSeccao(y);
  }

  public void setSalarioBase(double y){
    super.setSalarioBase(y);
  }

  public void setINSS(double y){
    super.setINSS(y);
  }

  public void setValorProducao(double y){
    valorProducao = y;
  }

  public void setComissao(double y){
    comissao = y;
  }

  public double calculaSalario(){
    return (super.calculaSalario() + ((comissao/100)*valorProducao));
  }

}
