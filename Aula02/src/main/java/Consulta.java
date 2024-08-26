import java.time.LocalDateTime;

public class Consulta {
    LocalDateTime horario;
    Double duracao;
    String endereco;
    Boolean confirmada;

    void cancelar() {
        this.confirmada = true;
        if (this.duracao >= 2){
            this.confirmada = false;
        }
    }

    void status() {
        System.out.println("Horário da consulta: " + this.horario);
        System.out.println("Duração da consulta: " + this.duracao);
        System.out.println("Endereço da consulta: " + this.endereco);
        System.out.println("Consulta confirmada?: " + this.confirmada);
    }

    void remarcar() {
        if (this.confirmada == true) {
            System.out.println("Não será remarcada");
        } else {
            System.out.println("Vamos remarcar");
        }
    }
}
