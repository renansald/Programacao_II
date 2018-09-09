public class Pessoas {
  private String nome;
  private String sexo;
  private int idade;
  private double altura;
  private double peso;
  private String historicoConsultas;

  public Pessoas (){};

  public Pessoas (String nome, double altura, double peso){
    this.nome = nome;
    this.altura = altura;
    this.peso = peso;
  }

  public double imc(){
    return (peso/(altura*altura));
  }

  public void estadoNutricional(){
    double x = imc();
    if (x < 18.5){
      System.out.println("O paciente "+nome+" esta abaixo do peso");
    }
    else if((x >=18.5) && (x < 24.9)){
      System.out.println("O paciente "+nome+" esta com peso normal");
    }
    else if ((x >= 24.9) && (x < 29.9)){
      System.out.println("O paciente "+nome+" esta com sobrepeso");
    }
    else if ((x >= 29.9) && (x < 34.9)){
      System.out.println("O paciente "+nome+" esta com obesidade grau I");
    }
    else if ((x >= 34.9) && (x < 39.9)){
      System.out.println("O paciente "+nome+" esta com obesidade grau II");
    }
    else if (x > 39.9){
      System.out.println("O paciente "+nome+" esta com obesidade grau II");
    }
    else{
      System.out.println("IMC errado");
    }
  }
}
