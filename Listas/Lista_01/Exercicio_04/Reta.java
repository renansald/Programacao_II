public class Reta {
  public double tamanho(double x1, double y1, double x2, double y2){
    double tam = ((x2 - x1)*(x2 - x1)) + ((y2 - y1)*(y2 - y1));
    tam = Math.sqrt(tam);
    return tam;
  }

}
