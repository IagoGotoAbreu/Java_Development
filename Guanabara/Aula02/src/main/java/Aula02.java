import java.time.LocalDateTime;

public class Aula02 {
    public static void main(String[] args) {
//        Caneta c1 = new Caneta();
//        c1.cor = "Azul";
//        c1.ponta = 0.5f;
//        c1.tampar();
//
//        c1.status();
//        c1.rabiscar();
//
//        Caneta c2 = new Caneta();
//        c2.modelo = "Hostnet";
//        c2.cor = "Preta";
//        c2.destampar();
//        c2.status();
//        c2.rabiscar();

        Consulta con1 = new Consulta();
        con1.horario = LocalDateTime.of(2024, 07, 22, 10, 15, 30);
        con1.endereco = "Paulista, sp - 1245";
        con1.duracao = 2.30;
        con1.cancelar();
        con1.status();
        con1.remarcar();
    }
}
