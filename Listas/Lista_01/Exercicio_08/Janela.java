public class Janela {

  String cor;
  String tamanho;

  public Janela(){}

  public Janela (String tamanho, String cor){
    this.tamanho = tamanho;
    this.cor = cor;
  }

  public String getTamanho(){
    return tamanho;
  }

  public String getCor(){
    return cor;
  }

  public String toString(){
    return "Tamanho = "+tamanho+"\ncor = "+cor;
  }

}
