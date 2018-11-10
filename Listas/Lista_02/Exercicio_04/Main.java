public class Main {

  public static void main(String[] args) {
    Loja j = new Loja("Submarino");
    try{
      Mouse m = new Mouse(1100, "razor", 100.50);
      System.out.println("ADD MOUSE !");
      Mouse m2 = new Mouse("Acer", 99.99);
      System.out.println("ADD MOUSE !");
      Livro l = new Livro("Bon Jovi", "Como fazer as melhores musicas", -19.99);
      Livro l2 = new Livro("Ozzy Osbourne", "Beneficios de ser velho e louco");
      j.addProduto(m);
      j.addProduto(l);
      j.addProduto(m2);
      j.addProduto(l2);
      j.addProduto(m);
      j.addProduto(l);
      j.addProduto(m2);
      j.addProduto(l2);
      j.addProduto(m);
      j.addProduto(l);
      j.addProduto(m2);
      j.addProduto(l2);
      j.addProduto(m);
      j.addProduto(l);
    }
    catch (ExceptionsProduto e) {
      e.printStackTrace();
    }
    catch (java.lang.ArrayIndexOutOfBoundsException e) {
      System.out.println("Você está com o estoque cheio");
    }
    j.imprimeProdutos();
  }
}
