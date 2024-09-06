import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

//        Leitor.nextDouble()
//        Leitor.nextInt()

        System.out.println("Digite seu nome:");
        String nomeUsuario = leitor.nextLine();

        System.out.println("Digite sua idade:");
        Integer idadeUsuario = leitor.nextInt();

        System.out.println("Digite sua altura:");
        Double alturaUsuario = leitor.nextDouble();

        System.out.printf("""
                O nome digitado foi: %s
                Você tem %d anos
                Você tem %.2f de altura""", nomeUsuario, idadeUsuario, alturaUsuario);
    }
}
