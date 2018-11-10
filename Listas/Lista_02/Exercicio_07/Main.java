import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Valor v = new Valor(0);
    Scanner scan = new Scanner(System.in);
    int x;
    double f;
    try {
      x = scan.nextInt();
      v.somaValor(x);
      System.out.println(v.getValor());
      f = scan.nextDouble();
      v.somaValor(f);
      System.out.println(v.getValor());
      char c = scan.next().charAt(0);
      v.somaValor(c);
      System.out.println(v.getValor());
    }
    catch (java.util.InputMismatchException e) {
      System.out.println("Erro não");
    }
    catch (ValorException e) {
      e.printStackTrace();
    }
  }
}
