public class Main {

  public static void main(String[] args) {
    Empregado e = new Empregado("Josivaldo", "111.111.111-11", 110, 1000, 10);
    System.out.println("Nome: "+e.getNome()+"\nCPF: "+e.getCPF()+"\nSeccao: "+e.getNumeroSeccao()+"\nSalario base: "+e.getSalarioBase()+"\nINSS: "+e.getINSS());
    System.out.println(e.calculaSalario());
    e.setNome("J");
    e.setCPF("111.222.111-22");
    e.setNumeroSeccao(10);
    e.setSalarioBase(2000);
    e.setINSS(0);
    System.out.println("Nome: "+e.getNome()+"\nCPF: "+e.getCPF()+"\nSeccao: "+e.getNumeroSeccao()+"\nSalario base: "+e.getSalarioBase()+"\nINSS: "+e.getINSS());
    System.out.println(e.calculaSalario());

    Administrador a = new Administrador("João", "222.222.222-22", 112, 5000, 10, 500);
    System.out.println("Nome: "+a.getNome()+"\nCPF: "+a.getCPF()+"\nSeccao: "+a.getNumeroSeccao()+"\nSalario base: "+a.getSalarioBase()+"\nINSS: "+a.getINSS()+"\nAjuda de Custo: "+a.getAjudaDeCustos());
    System.out.println(a.calculaSalario());
    a.setNome("Jão");
    a.setCPF("111.222.111-33");
    a.setNumeroSeccao(110);
    a.setSalarioBase(6000);
    a.setINSS(0);
    System.out.println("Nome: "+a.getNome()+"\nCPF: "+a.getCPF()+"\nSeccao: "+a.getNumeroSeccao()+"\nSalario base: "+a.getSalarioBase()+"\nINSS: "+a.getINSS()+"\nAjuda de Custo: "+a.getAjudaDeCustos());
    System.out.println(a.calculaSalario());

    Operario o = new Operario("Pedro", "111.000.000-00", 111, 1000, 10, 5000, 20);
    System.out.println("Nome: "+o.getNome()+"\nCPF: "+o.getCPF()+"\nSeccao: "+o.getNumeroSeccao()+"\nSalario base: "+o.getSalarioBase()+"\nINSS: "+o.getINSS()+"\nVenda no mes: "+o.getValorProducao()+"\nComissao: "+o.getComissao());
    System.out.println(o.calculaSalario());
    o.setNome("P");
    o.setCPF("000.000.000-00");
    o.setNumeroSeccao(109);
    o.setSalarioBase(2000);
    o.setINSS(0);
    o.setValorProducao(10000);
    o.setComissao(100);
    System.out.println("Nome: "+o.getNome()+"\nCPF: "+o.getCPF()+"\nSeccao: "+o.getNumeroSeccao()+"\nSalario base: "+o.getSalarioBase()+"\nINSS: "+o.getINSS()+"\nVenda no mes: "+o.getValorProducao()+"\nComissao: "+o.getComissao());
    System.out.println(o.calculaSalario());


  }

}
