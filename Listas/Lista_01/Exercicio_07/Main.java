public class Main{
  public static void main(String[] args) {
    Pessoas p1 = new Pessoas("joão", 1.8, 80);
    p1.estadoNutricional();
    p1.setHistoricoConsultas("Dr. pedro");
    p1.setHistoricoConsultas("Dr. joão");
    p1.GetHistoricoConsultas();

  }
}
