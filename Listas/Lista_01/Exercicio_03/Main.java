public class Main {
  public static void main(String[] args) {
    Data d = new Data(28, 5, 2018, 13, 01, 59);
    Data v5 = new Data(29, 5, 2018, 14, 00, 00);
    System.out.println("\t"+d.toString()+"\n-\n\t"+v5.toString());
    System.out.println(d.menosData(v5));
  }
}
