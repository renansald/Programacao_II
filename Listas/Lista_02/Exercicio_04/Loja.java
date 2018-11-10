public class Loja {

  String nomeLoja;
  Produto[] produtos = new Produto[10];
  int count = 0;

  public Loja(String nome){
    nomeLoja = nome;
  }

  public void addProduto(Produto p){
    produtos[count] = p;
    count++;
  }

  public void imprimeProdutos(){
    for(int i = 0; i<count; i++){
      if(produtos[i] instanceof Livro){
        Livro l = (Livro) produtos[i];
        System.out.println(l.toString());
        System.out.println();
      }
      else{
        Mouse m = (Mouse) produtos[i];
        System.out.println(m.toString());
        System.out.println();
      }
    }
  }
}
