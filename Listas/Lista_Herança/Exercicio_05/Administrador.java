public class Administrador extends Empregado {

  private double ajudaDeCustos;

  public Administrador(String nome, String CPF, int numeroSeccao, double salarioBase, double INSS, double ajudaDeCustos){
    super(nome, CPF, numeroSeccao, salarioBase, INSS);
    this.ajudaDeCustos = ajudaDeCustos;
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

  public double getAjudaDeCustos(){
    return ajudaDeCustos;
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

  public void setAjudaDeCusto(double y){
    ajudaDeCustos = y;
  }

  public double calculaSalario(){
    return ((super.calculaSalario()) + ajudaDeCustos);
  }

}
