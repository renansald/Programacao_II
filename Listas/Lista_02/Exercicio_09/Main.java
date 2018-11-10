import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Valores a = new Valores();
    Scanner scan = new Scanner(System.in);
    int x = 1;
    while(true){
      try {
        System.out.println("Informe o numero: ");
        x = scan.nextInt();
        if(x < 0)
        break;
        a.addValor(x);
      }
      catch (java.util.InputMismatchException e) {
        System.out.println("Valor desconsiderado\nDeve ser um numero inteiro");
        scan = new Scanner(System.in);
      }
    }
    a.imprimeArray();
    int res = a.getValor(0);
    for(int i = 1; i< a.valor.size(); i++){
      try{
        res = res / a.getValor(i);
      }
      catch (java.lang.ArithmeticException e) {
        System.out.println("Não existe divisao por zero, então será dividido por um");
        res = res;
      }
    }
    System.out.println(res);
  }
}
