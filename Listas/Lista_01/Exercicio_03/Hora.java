public class Hora {

  private int hora;
  private int minuto;
  private int segundo;

  public Hora(){};

  public Hora(int hora, int minuto, int segundo){
    /*if ((hora > 23) || (hora < 0)){
      System.out.println("Hora(s) inválida(s), o intevalo deve ir de '0' a '23' hora(s)");
    }
    else
    this.hora = hora;
    if ((minuto > 59) || (minuto < 0)){
      System.out.println("Minuto(s) inválido(s), o intevalo deve ir de '0' a '59' minuto(s)");
    }
    else
    this.minuto = minuto;
    if ((segundo > 59) || (segundo < 0)){
      System.out.println("segundo(s) inválido(s), o intevalo deve ir de '0' a '59' segundo(s)");
    }
    else
    this.segundo = segundo;*/
    setHora(hora);
    setMinuto(minuto);
    setSegundo(segundo);

  }

  public void setHora(int hora){
    if ((hora > 23) || (hora < 0)){
      System.out.println("Hora(s) inválida(s), o intevalo deve ir de '0' a '23' hora(s)");
      return;
    }
    else
    this.hora = hora;
  }

  public void setMinuto(int minuto){
    if ((minuto > 59) || (minuto < 0)){
      System.out.println("Minuto(s) inválido(s), o intevalo deve ir de '0' a '59' minuto(s)");
      return;
    }
    else
    this.minuto = minuto;
  }

  public void setSegundo(int segundo){
    if ((segundo > 59) || (segundo < 0)){
      System.out.println("segundo(s) inválido(s), o intevalo deve ir de '0' a '59' segundo(s)");
      return;
    }
    else
    this.segundo = segundo;
  }

  public int getHora(){
    return hora;
  }

  public int getMinuto(){
    return minuto;
  }

  public int getSegundo(){
    return segundo;
  }

  public int emSegundos(){
    return ((hora*3600) + (minuto * 60) + segundo);
  }

  public String toString(){
    String nminutos = String.format("%02d", minuto);
    String nhora = String.format("%02d", hora);
    String nsegundo = String.format("%02d", segundo);
    return nhora +":"+nminutos+":"+nsegundo;
  }

  public String horaAmericana(){
    if (hora > 12){
      String nminutos = String.format("%02d", minuto);
      String nhora = String.format("%02d", (hora-12));
      String nsegundo = String.format("%02d", segundo);
      return nhora + ":" + nminutos + ":" + nsegundo + " PM";
    }
    else{
      String nminutos = String.format("%02d", minuto);
      String nhora = String.format("%02d", hora);
      String nsegundo = String.format("%02d", segundo);
      return nhora + ":" + nminutos + ":" + nsegundo + " AM";
    }
  }

}
