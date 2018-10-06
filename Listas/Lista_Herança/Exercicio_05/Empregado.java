public class Empregado extends Pessoa {

  private int numeroSeccao;
  private double salarioBase;
  private double INSS;

  public Empregado(String nome, String CPF, int numeroSeccao, double salarioBase, double INSS){
    super(nome, CPF);
    this.numeroSeccao = numeroSeccao;
    this.salarioBase = salarioBase;
    this.INSS = INSS;
  }

  public String getNome(){
    return super.getNome();
  }

  public String getCPF(){
    return super.getCPF();
  }

  public int getNumeroSeccao(){
    return numeroSeccao;
  }

  public double getSalarioBase(){
    return salarioBase;
  }

  public double getINSS(){
    return INSS;
  }

  public void setName(String y){
    super.setNome(y);
  }

  public void setCPF(String y){
    super.setCPF(y);
  }

  public void setNumeroSeccao(int y){
    numeroSeccao = y;
  }

  public void setSalarioBase(double y){
    salarioBase = y;
  }

  public void setINSS(double y){
    INSS = y;
  }

  public double calculaSalario(){
    return (salarioBase - ((INSS/100)*salarioBase));
  }

}
