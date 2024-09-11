import java.util.concurrent.ThreadLocalRandom;

public class Cofrinho {
    String meta;
    Double saldo;
    Boolean quebrado;

    void depositar(Double valorDeposito){
        if (!quebrado && valorDeposito > 0){
            saldo += valorDeposito;
            System.out.println("Depósito feito com sucesso! Valor atual: " + saldo);
        } else {
            System.out.println("Cofrinho já está quebrado ou seu depósito é inválido");
        }
    }

    Double agitar(){
        Double valorAleatorio = null;
        if (!quebrado){
            valorAleatorio = ThreadLocalRandom.current().nextDouble(0, saldo);
            System.out.println("Você agitou e caiu: " + valorAleatorio + "reais");
            saldo -= valorAleatorio;
        } else {
            System.out.println("Não da para agitar um cofre quebrado");
        }
        return valorAleatorio;
    }

    Double quebrar(){
        if (quebrado){
            System.out.println("Não da para quebrar um cofrinho já quebrado!");
            return null;
        } else {
            Double ValorAntesDeZerar = saldo;
            quebrado = true;
            saldo = 0.00;
            System.out.println("Você quebrou seu cofrinho! Agora você tem: " + ValorAntesDeZerar);
            return ValorAntesDeZerar;
        }
    }
}
