public class Main {

  public static void main(String[] args) {
    Ponto3D a = new Ponto3D(0, 2.0, 2.0);
    Ponto3D b = new Ponto3D(-2.0, 0, 1.0);
    Reta res = new Reta();
    double resposta = res.tamanho(a.getX(), a.getY(), a.getY(), b.getX(), b.getY(), b.getZ());
    System.out.println(resposta);
  }

}
