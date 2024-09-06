import java.util.Scanner;

public class ProjetoTeste {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Criando um objeto para utilizar seus métodos
        MetodosUteis metodosLegais = new MetodosUteis();

        System.out.println("Digite seu nome:");
        String nomeUsuario = leitor.nextLine();

        metodosLegais.exibirUsuario(nomeUsuario);
//        System.out.println("teste");
//        metodosLegais.exibirUsuario("iago");
    }
}
