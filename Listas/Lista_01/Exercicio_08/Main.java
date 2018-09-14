public class Main {

  public static void main(String[] args) {
    Casa casa = new Casa(3, 3);
    Casa kitnet = new Casa (1, 1);
    Porta p1 = new Porta("12x20", "aço");
    Porta p2 = new Porta("13X00", "madeira");
    Janela j1 = new Janela("12x20", "red");
    Janela j2 = new Janela("11X11", "azul");
    Comodo banheiro = new Comodo();
    Comodo quarto = new Comodo();
    casa.addPortaBanheiro(p1, 0);
    casa.addPortaQuarto(p2, 0);
    casa.addPortaBanheiro(p2, 1);
    casa.addPortaBanheiro(p1, 2);
    kitnet.addPortaBanheiro(p2, 0);
    casa.addJanelaBanheiro(j1, 0);
    casa.addJanelaQuarto(j2, 0);
    casa.addJanelaBanheiro(j2, 1);
    casa.addJanelaBanheiro(j1, 2);
    kitnet.addJanelaBanheiro(j2, 0);
    casa.addPortaQuarto(p2, 0);
    casa.addPortaQuarto(p1, 1);
    casa.addPortaQuarto(p2, 2);
    kitnet.addPortaQuarto(p1, 0);
    casa.addJanelaQuarto(j1, 0);
    casa.addJanelaQuarto(j2, 1);
    casa.addJanelaQuarto(j1, 2);
    kitnet.addJanelaQuarto(j2, 0);
    casa.getBanheiro();
    casa.getQuarto();
    kitnet.getBanheiro();
    kitnet.getQuarto();
  }

}
