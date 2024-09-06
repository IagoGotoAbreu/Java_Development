import java.util.Scanner;

public class ExemploSwitch {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número entre 1 e 7:");
        Integer diaSemana = leitor.nextInt();

//        if (diaSemana == 1){
//            System.out.println("Domingo");
//        } else if (diaSemana == 2) {
//            System.out.println("Segunda");
//        } else if (diaSemana == 3) {
//            System.out.println("Terça");
//        } else if (diaSemana == 4) {
//            System.out.println("Quarta");
//        } else if (diaSemana == 5) {
//            System.out.println("Quinta");
//        } else if (diaSemana == 6) {
//            System.out.println("Sexta");
//        } else if (diaSemana == 7) {
//            System.out.println("Sábado");
//        } else {
//            System.out.println("Dia da semana inválido");
//        }

        String texto = switch (diaSemana){
            case 1, 7 -> "Não tem aula!!!!";
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            default -> "Dia da semana inválido";
        };
        System.out.println(texto);
    }
}
