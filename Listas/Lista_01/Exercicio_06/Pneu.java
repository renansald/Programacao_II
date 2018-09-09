public class Pneu {
  public int aro;
  public double espessura;

  public Pneu(){};

  public Pneu(Pneu p){
    this.aro = p.getAro();
    this.espessura = p.getEspessura();
  }

  public Pneu(int aro, double espessura){
    this.aro = aro;
    this.espessura = espessura;
  }

  public int getAro(){
    return aro;
  }

  public double getEspessura(){
    return espessura;
  }

}
