public abstract class Pessoa {

  String nome;
  String id;

  public Pessoa(){}

    public Pessoa(String nome, String id){
      this.nome = nome;
      this.id = id;
    }

    public String getNome(){
      return nome;
    }

    public String getId(){
      return id;
    }
  }
