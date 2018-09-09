public class Motor {

  private int potencia;
  private String tipoCombustivel;

  public Motor(){};

  public Motor(int potencia, String tipoCombustivel){
    this.potencia = potencia;
    this.tipoCombustivel = tipoCombustivel;
  }

  public int getPotencia(){
    return potencia;
  }

  public String getTipoCombustivel(){
    return tipoCombustivel;
  }

}
