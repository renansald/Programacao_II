public class Valor {

  double valor;

  public Valor(double valor){
    this.valor = valor;
  }

  public void somaValor(double x){
    valor = valor + x;
  }

  public void somaValor(char x) throws ValorException{
    switch (x){
      case 'a':
      valor = valor + 1;
      return;
      case 'b':
      valor = valor + 2;
      return;
      case 'c':
      valor = valor + 3;
      return;
      case 'd':
      valor = valor + 4;
      return;
      case 'e':
      valor = valor + 5;
      return;
      case 'f':
      valor = valor + 6;
      return;
      case 'g':
      valor = valor + 7;
      return;
      case 'h':
      valor = valor + 8;
      return;
      case 'i':
      valor = valor + 9;
      return;
      case 'j':
      valor = valor + 10;
      return;
      case 'k':
      valor = valor + 11;
      return;
      case 'l':
      valor = valor + 12;
      return;
      case 'm':
      valor = valor + 13;
      return;
      case 'n':
      valor = valor + 14;
      return;
      case 'o':
      valor = valor + 15;
      return;
      case 'p':
      valor = valor + 16;
      return;
      case 'q':
      valor = valor + 17;
      return;
      case 'r':
      valor = valor + 18;
      return;
      case 's':
      valor = valor + 19;
      return;
      case 't':
      valor = valor + 20;
      return;
      case 'u':
      valor = valor + 21;
      return;
      case 'v':
      valor = valor + 22;
      return;
      case 'w':
      valor = valor + 23;
      return;
      case 'x':
      valor = valor + 24;
      return;
      case 'y':
      valor = valor + 25;
      return;
      case 'z':
      valor = valor + 27;
      return;
      case 'A':
      valor = valor + 7;
      return;
      case 'B':
      valor = valor + 28;
      return;
      case 'C':
      valor = valor + 29;
      return;
      case 'D':
      valor = valor + 30;
      return;
      case 'E':
      valor = valor + 31;
      return;
      case 'F':
      valor = valor + 32;
      return;
      case 'G':
      valor = valor + 33;
      return;
      case 'H':
      valor = valor + 34;
      return;
      case 'I':
      valor = valor + 35;
      return;
      case 'J':
      valor = valor + 36;
      return;
      case 'K':
      valor = valor + 37;
      return;
      case 'L':
      valor = valor + 38;
      return;
      case 'M':
      valor = valor + 39;
      return;
      case 'N':
      valor = valor + 40;
      return;
      case 'O':
      valor = valor + 41;
      return;
      case 'P':
      valor = valor + 42;
      return;
      case 'Q':
      valor = valor + 43;
      return;
      case 'R':
      valor = valor + 44;
      return;
      case 'S':
      valor = valor + 45;
      return;
      case 'T':
      valor = valor + 46;
      return;
      case 'U':
      valor = valor + 47;
      return;
      case 'V':
      valor = valor + 48;
      return;
      case 'W':
      valor = valor + 49;
      return;
      case 'X':
      valor = valor + 50;
      return;
      case 'Y':
      valor = valor + 51;
      return;
      case 'Z':
      valor = valor + 52;
      return;
    }
    throw new ValorException(x);
  }

  public double getValor(){
    return valor;
  }
}
