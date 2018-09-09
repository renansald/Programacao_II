public class HoraAmericana {

  private int hora;
  private int minuto;
  private int segundo;
  private String periodo;

  public HoraAmericana(){};

  public HoraAmericana (int hora, int minuto, int segundo, String periodo){
    if((periodo != "AM") && (periodo != "PM")){
      System.out.println("Periódo inválido, será considerdo o perido AM");
      this.periodo = "AM";
    }
    else
      this.periodo = periodo;
    if ((hora > 12) || (hora < 1)){
      System.out.println("Hora(s) inválida(s), o intevalo deve ir de '1' a '12' hora(s), sera considerado 12 Horas do periodo definido");
      this.hora = 12;
    }
    else
    this.hora = hora;
    if ((minuto > 59) || (minuto < 0)){
      System.out.println("Minuto(s) inválido(s), o intevalo deve ir de '0' a '59' minuto(s), será considerado 00 minutos");
    }
    else
    this.minuto = minuto;
    if ((segundo > 59) || (segundo < 0)){
      System.out.println("segundo(s) inválido(s), o intevalo deve ir de '0' a '59' segundo(s), será considerado 00 segundos");
    }
    else
    this.segundo = segundo;
  }

  public void setPeriodo(String periodo){
    if((periodo != "AM") && (periodo != "PM")){
      System.out.println("Periódo inválido");
    }
    else
    this.periodo = periodo;
  }

  public void setHora(int hora){
    if ((hora > 12) || (hora < 1)){
      System.out.println("Hora(s) inválida(s), o intevalo deve ir de '1' a '12' hora(s)");
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
    if((periodo == "PM") && (hora != 12))
    return (((hora + 12) *3600) + (minuto * 60) + segundo);
    else if (((periodo == "AM") && (hora != 12)) || ((periodo == "PM") && (hora == 12)))
    return ((hora *3600) + (minuto * 60) + segundo);
    else
    return ((minuto * 60) + segundo);
  }

  public String toString(){
    String nminutos = String.format("%02d", minuto);
    String nhora = String.format("%02d", hora);
    String nsegundo = String.format("%02d", segundo);
    return nhora +":"+nminutos+":"+nsegundo+" "+periodo;
  }

  public String horaAmericana(){
    if ((periodo == "PM") && (hora != 12)){
      String nminutos = String.format("%02d", minuto);
      String nhora = String.format("%02d", (hora+12));
      String nsegundo = String.format("%02d", segundo);
      return nhora + ":" + nminutos + ":" + nsegundo;
    }
    else if((periodo == "AM") && (hora != 12)){
      String nminutos = String.format("%02d", minuto);
      String nhora = String.format("%02d", (hora));
      String nsegundo = String.format("%02d", segundo);
      return nhora + ":" + nminutos + ":" + nsegundo;
    }
    else if ((periodo == "AM") && (hora == 12)){
      String nminutos = String.format("%02d", minuto);
      String nsegundo = String.format("%02d", segundo);
      return "00:" + nminutos + ":" + nsegundo;
    }
    else{
      String nminutos = String.format("%02d", minuto);
      String nsegundo = String.format("%02d", segundo);
      return "12:" + nminutos + ":" + nsegundo;
    }
  }

}
