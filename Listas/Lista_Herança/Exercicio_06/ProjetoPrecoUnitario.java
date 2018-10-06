public class ProjetoPrecoUnitario extends Projeto {

  Cliente c1;
  String nomeDoProjeto;
  String dataContratacao, dataEncerramento;
  ArrayList<FuncionarioAlocado> fAlocado = new ArrayList<FuncionarioAlocado>();
  double horaMensal;

  public ProjetoPrecoUnitario(Cliente c1, String nomeDoProjeto, String dataContratacao, String dataEncerramento){
    super(c1, nomeDoProjeto, dataContratacao, dataEncerramento);
  }

  public void setHoraMensal(double hora){
    horaMensal = hora;
  }

  public double valorReceber(){
    double x;
    for(int i = 0; i < fAlocado.size(); i++){
      x += (fAlocado.get(i).valorHora * horaMensal);
    }
    return x;
  }



}
