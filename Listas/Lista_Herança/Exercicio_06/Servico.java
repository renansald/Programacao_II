public class Servico {

  String nome, descrição, cargo, dataDeInicio, dataDeConclusao;
  double valor;

  public Servico(String nome, String dataDeInicio, double valor, String descrição, String cargo, String dataDeInicio){
    this.nome = nome;
    this.dataDeInicio = dataDeInicio;
    this.valor = valor;
    this.descrição = descrição;
    this.cargo = cargo;
    this.dataDeInicio = dataDeInicio;
  }

  public Servico(String nome, String dataDeInicio, double valor){
    this.nome = nome;
    this.dataDeInicio = dataDeInicio;
    this.valor = valor;
  }

  public void conclusao(String data){
    this.dataDeConclusao = data;
  }

}
