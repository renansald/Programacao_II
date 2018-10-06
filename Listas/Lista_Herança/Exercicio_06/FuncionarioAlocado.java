public class FuncionarioAlocado  {

  String dataAlocacao;
  String dataDesalocao;
  Funcionarios f1;
  double valorHora;

  public FuncionarioAlocado(Funcionarios f1, String data){
    dataAlocacao = data;
    this.f1 = f1;
    if(f1.cargo == "Analista junior"){
      valorHora = 20;
    }
    else if(f1.cargo == "Analista senior"){
      valorHora = 40;
    }
    else if(f1.cargo == "Programador"){
      valorHora = 15;
    }
    else
    valorHora = 5;
  }

  public void desaloca(String data){
    dataDesalocao = data;
  }

  public String toString(){
    return ("Funcionario: "+f1.nome+"\nData de alocação: "+dataAlocacao+"\nData de desalocação: "+dataDesalocao);
  }



}
