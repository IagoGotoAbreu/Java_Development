import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class NaoJogueTigrinho {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = leitor.nextLine();
        System.out.println("Digite o prêmio:");
        Double premio = leitor.nextDouble();
        if (premio >= 0.50 && premio <= 5000) {

            Integer numeroDaSorte = ThreadLocalRandom.current().nextInt(1, 101);
            System.out.printf("Seu número da sorte é: %d", numeroDaSorte);

            Integer numeroSorteado = ThreadLocalRandom.current().nextInt(1, 101);
            Integer tentativas = 0;

            while (!numeroDaSorte.equals(numeroSorteado)) {
                numeroSorteado = ThreadLocalRandom.current().nextInt(1, 101);
                tentativas++;
            }
            if (tentativas == 1){
                System.out.printf("\nOlá, %s. Seu número foi sorteado na %d° tentativa. Seu prêmio será de R$%.2f.", nome, tentativas, premio);
            } else if (tentativas >= 2 && tentativas <= 5) {
                System.out.printf("\nOlá, %s. Seu número foi sorteado na %d° tentativa. Seu prêmio será de R$%.2f.", nome, tentativas, premio * 0.9);
            } else if (tentativas >= 6 && tentativas <= 10) {
                System.out.printf("\nOlá, %s. Seu número foi sorteado na %d° tentativa. Seu prêmio será de R$%.2f.", nome, tentativas, premio / 2);
            } else {
                System.out.printf("\nOlá, %s. Seu número foi sorteado na %d° tentativa. Seu prêmio será de R$%.2f.", nome, tentativas, premio * 0);
            }

        } else {
            System.out.println("Prêmio deve ser entre R$0,50 e $5.000,00");
        }
    }
}
