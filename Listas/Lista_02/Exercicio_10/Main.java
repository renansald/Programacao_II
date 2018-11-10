public class Main {
  public static void main(String[] args) {
    Cachorro c = new Cachorro();
    Moto m = new Moto();
    Carro car = new Carro();
    Pessoa p = new Pessoa();
    System.out.println(c.latir(c));
    System.out.println(c.latir(m));
    System.out.println(c.latir(car));
    System.out.println(c.latir(p));
  }
}
