import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Sair");
        Scanner leitor = new Scanner(System.in);
        Integer numero = leitor.nextInt();

        while(numero < 1 || numero > 4) {
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Sair");
            numero = leitor.nextInt();
        }
        while(numero != 4){
            switch (numero){
                case 1:
                    System.out.println("Digite o primeiro número: ");
                    Integer num1 = leitor.nextInt();
                    System.out.println("Digite o segundo número: ");
                    Integer num2 = leitor.nextInt();
                    System.out.println("A soma dos números é: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Digite o primeiro número: ");
                    Integer num3 = leitor.nextInt();
                    System.out.println("Digite o segundo número: ");
                    Integer num4 = leitor.nextInt();
                    System.out.println("A subtração dos números é: " + (num3 - num4));
                    break;
                case 3:
                    System.out.println("Digite o primeiro número: ");
                    Integer num5 = leitor.nextInt();
                    System.out.println("Digite o segundo número: ");
                    Integer num6 = leitor.nextInt();
                    System.out.println("A multiplcação dos números é: " + (num5 * num6));
                    break;
            }
            System.out.println("\nEscolha uma opção: ");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Sair");
            numero = leitor.nextInt();
        }
                    System.out.println("Programa encerrado!");
    }
}
