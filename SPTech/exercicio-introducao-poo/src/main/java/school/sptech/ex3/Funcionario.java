package school.sptech.ex3;

public class Funcionario {
    String nome;
    String cargo;
    Double salario;

    void reajustarSalario(Integer percentualReajuste){
        System.out.println("Salário antes do reajuste: " + salario);
        salario = salario * percentualReajuste / 100 + salario;
        System.out.println("Salário atual: " + salario);
    }

    Double calcularValorHora(){
        Double valorHora = salario / 220;
        System.out.println("Valor da sua hora trabalhada: " + valorHora);
        return valorHora;
    }

    Double calcularHoraExtra(Integer qtdHorasExtra, Integer percentualAdicionalNoturno){
        Double salarioAdicional = qtdHorasExtra * calcularValorHora();
        System.out.println("Valor a mais pelas horas extras: " + salarioAdicional);
        salarioAdicional = salarioAdicional * percentualAdicionalNoturno / 100 + salarioAdicional;
        System.out.println("Valor completo: " + salarioAdicional);
        return salarioAdicional;
    }
}
