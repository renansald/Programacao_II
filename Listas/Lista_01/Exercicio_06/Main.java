public class Main{

  public static void main(String[] args) {
    Carro c1 = new Carro(220, "gas", "vermelho", "GQG0001");
    Pneu p1 = new Pneu(13, 21);
    Pneu p2 = new Pneu(13, 22);
    Pneu p3= new Pneu(13, 23);
    Pneu p4 = new Pneu(13, 24);
    c1.colocarPneu(p1, p2, p3, p4);
    c1.pneusIguais();
    System.out.println(c1.toString());
  }

}
