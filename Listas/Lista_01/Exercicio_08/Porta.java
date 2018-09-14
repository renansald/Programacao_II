public class Porta {

  String tamanho;
  String material;

  public Porta(){}

  public Porta (String tamanho, String material){
    this.tamanho = tamanho;
    this.material = material;
  }

  public String getTamanho(){
    return tamanho;
  }

  public String getMaterial(){
    return material;
  }

  public String toString(){
    return "Tamanho = "+tamanho+"\nmaterial = "+material;
  }

}
