import java.util.ArrayList;

public class Comodo {

  ArrayList<Porta> portas = new ArrayList<Porta>();
  ArrayList<Janela> janela = new ArrayList<Janela>();

  public Comodo(){}

  public Comodo(int janelas, int portas){
    for (int i = 0; i < janelas; i++){
      janela.add(new Janela());
    }
    for (int i = 0; i < portas; i++){
      this.portas.add(new Porta());
    }
  }

  public void getPortasJanelas(String comodo, int i){
    System.out.println(comodo+" "+(i+1)+":\nPortas:");
    for (int a = 0; a < portas.size(); a++){
      System.out.println("Material da porta "+(a+1)+": "+portas.get(a).getMaterial()+"\nTamanho da porta "+(a+1)+": "+portas.get(a).getTamanho());
    }
    System.out.println("\nJanelas:");
    for(int a = 0; a < janela.size(); a++){
      System.out.println("Cor da Janela "+(a+1)+": "+janela.get(a).getCor()+"\nTamanho da janela "+(a+1)+": "+janela.get(a).getTamanho());
    }
    System.out.println("\n");
  }

  public void addPorta(Porta p1){
    portas.add(p1);
  }

  public void addJanela(Janela j1){
    janela.add(j1);
  }
}
