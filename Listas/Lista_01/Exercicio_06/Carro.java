public class Carro {

  private Motor motor = new Motor ();
  private String cor;
  private String placa;
  //private Pneu[4] pneu;

  public Carro (int potencia, String combustivel, String cor, String placa){
    motor = new Motor(potencia, combustivel);
    this.cor = cor;
    this.placa = placa;
  }

  /*public colocrPneu (Pneu p1, Pneu p2, Pneus p3, Pneu p4){
    pneu[0] = new Pneu(p1);
    pneu[1] = new Pneu(p2);
    pneu[2] = new Pneu(p3);
    pneu[3] = new Pneu(p4);
  }*/

  public String toString(){
    return ("Potencia: "+motor.getPotencia()+"CV\nTipo de combústivel: "+motor.getTipoCombustivel()+"\nCor: "+cor+"\nPlaca: "+placa);
  }

}
