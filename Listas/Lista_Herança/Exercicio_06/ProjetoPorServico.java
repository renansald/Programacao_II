import java.util.ArrayList;

public class ProjetoPorServico extends Projeto {

  ArrayList<Servico> s1 = new ArrayList<Servico>();

  public ProjetoPorServico(Cliente c1, String nomeDoProjeto, String dataContratacao, String dataEncerramento){
    super(c1, nomeDoProjeto, dataContratacao, dataEncerramento);
  }

  public void addServico(Servico s){
    s1.add(s);
  }

  public void addDataEncerramentoservico(String data, int i){
    s1.get(i).conclusao(data);
  }

}
