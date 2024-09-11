public class main {
    public static void main(String[] args) {
        Cofrinho porquinho1 = new Cofrinho();
        porquinho1.meta = "Aquisição de um Playstation 5";
        porquinho1.saldo = 0.00;
        porquinho1.quebrado = false;
        porquinho1.depositar(50.00);
        porquinho1.depositar(50.00);
        porquinho1.depositar(50.00);
        porquinho1.depositar(50.00);
        porquinho1.agitar();
        porquinho1.quebrar();

        Cofrinho porquinho2 = new Cofrinho();
        porquinho2.meta = "Aquisição de uma bicicleta nova";
        porquinho2.saldo = 0.00;
        porquinho2.quebrado = true;
        porquinho2.depositar(100.00);
        porquinho2.agitar();
        porquinho2.quebrar();
    }
}
