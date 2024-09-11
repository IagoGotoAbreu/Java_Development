public class BilheteUnico {

    //Atributos = Caracteristicas do objeto
    String nomeTitular;
    Double saldo;
    String codigo;
    Integer qtdVezesUsada;

    //Metodos = Comportamentos
    void carregar(Double valorRecarga){
        if (valorRecarga > 0.00){
            saldo += valorRecarga;
            System.out.println("Recarga efetuada!");
        } else {
            System.out.println("Valor inválido!");
        }
    }

    Boolean usar(){
        if (saldo >= 5.0){
            saldo -= 5.00;
            qtdVezesUsada++;
            return true;
        }
        return false;
    }
}
