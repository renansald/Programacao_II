import java.util.ArrayList;

public class Projeto {

  Cliente c1;
  String nomeDoProjeto;
  String dataContratacao, dataEncerramento;
  ArrayList<FuncionarioAlocado> fAlocado = new ArrayList<FuncionarioAlocado>();


  public Projeto(Cliente c1, String nomeDoProjeto, String dataContratacao, String dataEncerramento){
    this.c1 = c1;
    this.nomeDoProjeto = nomeDoProjeto;
    this.dataContratacao = dataContratacao;
    this.dataEncerramento = dataEncerramento;
  }

  public void alocaFuncionario(Funcionarios f2, String data){
      FuncionarioAlocado f = new FuncionarioAlocado(f2, data);
      fAlocado.add(f);
  }

  public void desalocaFuncionario(int i, String data){
    fAlocado.get(i).desaloca(data);
  }

}
