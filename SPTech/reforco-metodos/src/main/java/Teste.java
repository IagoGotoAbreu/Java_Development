import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
//        System.out.println("Digite um número:");
//        Integer numero = leitor.nextInt();
        MetodosDivetidos metodos = new MetodosDivetidos();

//        Integer tentativas = metodos.avaliandoSorte(numero);
//        System.out.println("O número de tentativas: " + tentativas);
//        if(tentativas <= 3){
//            System.out.println("Você é MUITO sortudo");
//        } else if (tentativas <= 10) {
//            System.out.println("Você é sortudo");
//        } else {
//            System.out.println("É melhor você parar de apostar e ir trabalhar");
//        }

        System.out.println("*----------------*----------------*");

        Integer somaNumeros = metodos.exibeSorteio();
        System.out.println("A soma dos números é " + somaNumeros);

        System.out.println("*----------------*----------------*");

//        metodos.exbieImpares();
//
//        System.out.println("*----------------*----------------*");
//
//        System.out.println("Digite um número: ");
//        Integer numeroEscolhido = leitor.nextInt();
//        Integer n = metodos.posicaoSorteio(numeroEscolhido);
//        if (n.equals(-1)){
//            System.out.println("Seu número não foi sorteado!");
//        } else {
//        System.out.println("seu numero foi sorteado na posição: " + n);
//        }
    }
}
