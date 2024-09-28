import java.util.concurrent.ThreadLocalRandom;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private Integer rounds;
    private Boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && !l1.equals(l2)){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if (this.aprovada){
            System.out.println("");
            System.out.println("###### DESAFIADO ######");
            this.desafiado.apresentar();
            System.out.println("");
            System.out.println("###### DESAFIANTE ######");
            this.desafiante.apresentar();
            Integer vencedor = ThreadLocalRandom.current().nextInt(0, 3);
            switch (vencedor){
                case 0:
                    System.out.println("*-------------------------------*");
                    System.out.println("Empatou!");
                    System.out.println("*-------------------------------*");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("*-------------------------------*");
                    System.out.println("Vitoria do " + this.desafiado.getNome());
                    System.out.println("*-------------------------------*");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("*-------------------------------*");
                    System.out.println("Vitoria do " + this.desafiante.getNome());
                    System.out.println("*-------------------------------*");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }

        } else {
            System.out.println("Luta não pode acontecer");
        }
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Lutador getDesafiado() {
        return this.desafiado;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public Lutador getDesafiante() {
        return this.desafiante;
    }
}
