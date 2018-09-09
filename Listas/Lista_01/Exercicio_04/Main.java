public class Main {

  public static void main(String[] args) {
    Ponto2D a = new Ponto2D(4.0, 1.0);
    Ponto2D b = new Ponto2D(1.0, 3.0);
    Reta res = new Reta();
    double resposta = res.tamanho(a.getX(), a.getY(), b.getX(), b.getY());
    System.out.println(resposta);
  }

}
