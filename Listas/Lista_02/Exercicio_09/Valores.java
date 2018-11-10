import java.util.ArrayList;

public class Valores {

  ArrayList<Integer> valor = new ArrayList<Integer>();

  public void addValor(int numb){
    valor.add(numb);
  }

  public int getValor(int n){
    return valor.get(n);
  }

  public void imprimeArray(){
    for (Integer d : valor) {
      System.out.println(d);
    }
  }

}
