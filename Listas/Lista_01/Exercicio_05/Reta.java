public class Reta {
  public double tamanho(double x1, double y1, double z1, double x2, double y2, double z2){
    double tam = ((x2 - x1)*(x2 - x1)) + ((y2 - y1)*(y2 - y1)) + ((z2 - z1)*(z2 - z1));
    tam = Math.sqrt(tam);
    return tam;
  }

}
