public class Carro {

  private Motor motor = new Motor();
  private String cor;
  private String placa;
  private Pneu[] pneu = new Pneu[4];

  public Carro (int potencia, String combustivel, String cor, String placa){
    motor = new Motor(potencia, combustivel);
    this.cor = cor;
    this.placa = placa;
  }

  public void colocarPneu (Pneu p1, Pneu p2, Pneu p3, Pneu p4){
    pneu[0] = new Pneu(p1);
    pneu[1] = new Pneu(p2);
    pneu[2] = new Pneu(p3);
    pneu[3] = new Pneu(p4);
  }

  public void pneusIguais(){
    for (int i = 0; i < 3; i++){
      if(pneu[i].getAro() != pneu[i+1].getAro()){
        System.out.println("Os pneus são diferentes");
        return;
      }
      else if(pneu[i].getEspessura() != pneu[i+1].getEspessura()){
        System.out.println("Os pneus são diferentes");
        return;
      }
    }
    System.out.println("Os pneus são igauis");
  }


  public String toString(){
    return ("Potencia: "+motor.getPotencia()+"CV\nTipo de combústivel: "+motor.getTipoCombustivel()+"\nCor: "+cor+"\nPlaca: "+placa);
  }

}
