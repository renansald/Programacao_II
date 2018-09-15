public class Data {

  private int dia;
  private int mes;
  private int ano;
  Hora hora = new Hora();

  public Data (){};

  public Data(int dia, int mes, int ano, int h, int minuto, int segundo){
    if ((dia > 30) && ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11))){
      System.out.println("Data Inválida");
      return;
    }
    else if ((dia >= 30) && (mes == 2)){
      System.out.println("Data Inválida");
      return;
    }
    else if ((mes > 12) || (mes < 1) || (dia < 1) || (dia >31)){
      System.out.println("Data Inválida");
      return;
    }
    this.mes = mes;
    this.dia = dia;
    this.ano = ano;
    hora.setHora(h);
    hora.setMinuto(minuto);
    hora.setSegundo(segundo);
  }

  public void setDiaMes(int mes, int dia){
    if ((dia > 30) && ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11))){
      System.out.println("Data Inválida");
      return;
    }
    else if ((dia >= 30) && (mes == 2)){
      System.out.println("Data Inválida");
      return;
    }
    else if ((mes > 12) || (mes < 1) || (dia < 1) || (dia >31)){
      System.out.println("Data Inválida");
      return;
    }
    this.mes = mes;
    this.dia = dia;
  }

  public void setAno(int ano){
    this.ano = ano;
  }

  public void setHora(int h, int minuto, int segundo){
    hora.setHora(h);
    hora.setMinuto(minuto);
    hora.setSegundo(segundo);
  }

  public int getDia(){
    return dia;
  }

  public int getMes(){
    return mes;
  }

  public int getAno(){
    return ano;
  }

  public int getHora(){
    return hora.getHora();
  }

  public int getMinuto(){
    return hora.getMinuto();
  }

  public int getSegundo(){
    return hora.getSegundo();
  }

  public String getHorario(){
    return hora.toString();
  }

  public String toString(){
    return dia+"/"+mes+"/"+ano+"  "+hora.toString();
  }

  public String menosData(Data d){
    int dias1 = (ano*365) + (mes*30) + dia;
    int dias2 = (d.getAno()*365) + (d.getMes()*30) + d.getDia();
    int horas1 = (hora.getHora()*3600) + (hora.getMinuto()*60) + (hora.getSegundo());
    int horas2 = (d.getHora() * 3600) + (d.getMinuto()*60) + (d.getSegundo());
    if ((dias2 >= dias1) && (horas2 >= horas1)){
      dias2 = dias2 - dias1;
      horas2 = horas2 - horas1;
      int newhora = horas2/3600;
      int resto1 = horas2%3600;
      int newminutos = resto1/60;
      resto1 = resto1%60;
      int newAno = dias2/365;
      int resto = dias2%365;
      int newMes = resto/30;
      resto = resto%30;
      return ("Faltam "+newAno+" anos e "+ newMes+" mes, "+resto+" dias, "+newhora+" horas, "+newminutos+" minutos, "+resto1+" segundos");
    }
    else if((dias2 > dias1) && (horas2 < horas1)){
      dias2 = dias2 - dias1;
      horas2 = horas1 - horas2;
      int newhora = 23 - (horas2/3600);
      int resto1 = horas2%3600;
      int newminutos =  60 - ((resto1)/60);
      resto1 = 60 -(resto1%60);
      if(resto1 == 60)
      resto1 = 0;
      if(resto1 > 0)
      newminutos--;
      if(newminutos == 60)
      newminutos = 0;
      int newAno = dias2/365;
      int resto = dias2%365;
      int newMes = resto/30;
      resto = resto%30;
      return ("Faltam "+newAno+" anos e "+ newMes+" mes, "+(resto-1)+" dias, "+newhora+" horas, "+newminutos+" minutos, "+resto1+" segundos");
    }
    else{
      return "Data invalida";
    }
  }
}
