import java.util.ArrayList;

public class Casa {

  ArrayList<Comodo> banheiro = new ArrayList<Comodo>();
  ArrayList<Comodo> quarto = new ArrayList<Comodo>();

  public Casa(int banheiro, int quarto){
    for (int i = 0; i < banheiro; i++){
      this.banheiro.add(new Comodo());
    }
    for (int i = 0; i < quarto; i++){
      this.quarto.add(new Comodo());
    }
  }

  public void getBanheiro(){
    System.out.println("A Seguir os tamanhos e caracteristicas das Portas e Janelas de cada banheiro: ");
    for (int i = 0; i < banheiro.size(); i++){
      banheiro.get(i).getPortasJanelas("Banheiro", i);
    }
  }

  public void getQuarto(){
    System.out.println("A Seguir os tamanhos e caracteristicas das Portas e Janelas de cada quarto: ");
    for (int i = 0; i < quarto.size(); i++){
      quarto.get(i).getPortasJanelas("Quarto", i);
    }
  }

  public void addBanheiro(){
    banheiro.add(new Comodo());
  }

  public void addQuarto(){
    quarto.add(new Comodo());
  }

  public void addPortaBanheiro(Porta p1, int i){
    banheiro.get(i).addPorta(p1);
  }

  public void addPortaQuarto(Porta p1, int i){
    quarto.get(i).addPorta(p1);
  }

  public void addJanelaBanheiro(Janela p1, int i){
    banheiro.get(i).addJanela(p1);
  }

  public void addJanelaQuarto(Janela p1, int i){
    quarto.get(i).addJanela(p1);
  }

}
