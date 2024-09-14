package school.sptech.ex3;

public class TesteEmpresa {
  public static void main(String[] args) {
    Funcionario funcionario01 = new Funcionario();
    funcionario01.nome = "Iago";
    funcionario01.cargo = "Analista";
    funcionario01.salario = 15000.00;
    funcionario01.reajustarSalario(10);
    funcionario01.calcularValorHora();
    funcionario01.calcularHoraExtra(5, 7);

    Funcionario funcionario02 = new Funcionario();
    funcionario02.nome = "Thor";
    funcionario02.cargo = "Analista";
    funcionario02.salario = 25000.00;
    funcionario02.reajustarSalario(4);
    funcionario02.calcularValorHora();
    funcionario02.calcularHoraExtra(12, 10);

    Funcionario funcionario03 = new Funcionario();
    funcionario03.nome = "Millena";
    funcionario03.cargo = "Analista";
    funcionario03.salario = 35000.00;
    funcionario03.reajustarSalario(2);
    funcionario03.calcularValorHora();
    funcionario03.calcularHoraExtra(10, 5);
  }
}
