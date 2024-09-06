import java.util.ArrayList;
import java.util.List;

public class TesteVendas {
    public static void main(String[] args) {
        List<Double> precos = new ArrayList<>(List.of(5.00, 10.00, 15.00, 20.00, 25.00, 30.00, 35.00, 40.00, 45.00, 50.00));
        RelatorioMetodos metodos = new RelatorioMetodos();

        Integer qtdPrecos = metodos.buscarQuantidadeVendas(precos);
        System.out.println("A quantidade de precos da lista é: " + qtdPrecos);

        Double somaPrecos = metodos.somarVendas(precos);
        System.out.println("A soma dos preços da lista é: " + somaPrecos);

        Boolean resultado = metodos.buscarPreco(precos);
        System.out.println("O preço existe na lista? " + resultado);

        Double maiorPreco = metodos.buscarMaiorPreco(precos);
        System.out.println("O maior preço da lista é: " + maiorPreco);

        Double menorPreco = metodos.buscarMenorPreco(precos);
        System.out.println("O menor preço da lista é: " + menorPreco);

        List<Double> buscaPorPreco = metodos.buscarPorPrecoMinimo(precos);
        System.out.println("Lista dos maiores preços:" + buscaPorPreco);
    }
}
