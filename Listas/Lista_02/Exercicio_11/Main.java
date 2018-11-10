import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String[] c = new String[5];
    char c1, c2;
    Scanner scan = new Scanner(System.in);

    for(int i = 0; i < 5; i++){
      System.out.println("Informa a "+(i+1)+" frase: ");
      c[i] = scan.nextLine();
    }
    int i = 1;
    for (String s : c) {
      System.out.println("Frase "+i);
      ++i;
      try {
        c1 = s.charAt(4);
        c2 = s.charAt(9);
        System.out.println("A quinta letra é "+c1+"\nA decima letra é "+c2);
      }
      catch (java.lang.StringIndexOutOfBoundsException e) {
        try {
          System.out.println("Essa frase não tem 10 letras, mas a quinta letra é "+s.charAt(4));
        }
        catch (java.lang.StringIndexOutOfBoundsException a) {
          System.out.println("Essa frase tem menos de cinco letras");
        }
      }
    }
  }
}
