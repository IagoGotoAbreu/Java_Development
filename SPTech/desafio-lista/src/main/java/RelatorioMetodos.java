import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RelatorioMetodos {
    Integer buscarQuantidadeVendas(List<Double> precos){
        return precos.size();
    }
    Double somarVendas(List<Double> precos){
        Double precoTotal = 0.00;
        for (int i = 0; i < precos.size(); i++){
            precoTotal += precos.get(i);
        }
        return precoTotal;
    }
    Boolean buscarPreco(List<Double> precos){
        System.out.println("Digite um preço: ");
        Scanner leitor = new Scanner(System.in);
        Double preco = leitor.nextDouble();
        for (int i = 0; i < precos.size(); i++){
            if (preco.equals(precos.get(i))){
                return true;
            }
        }
        return false;
    }
    Double buscarMaiorPreco(List<Double> precos){
        Double maiorPreco = 0.00;
        for (int i = 0; i < precos.size(); i++){
            if (precos.get(i) > maiorPreco){
                maiorPreco = precos.get(i);
            }
        }
        return maiorPreco;
    }
    Double buscarMenorPreco(List<Double> precos){
        Double menorPreco = precos.get(0);
        for (int i = 0; i < precos.size(); i++){
            if (precos.get(i) < menorPreco){
                menorPreco = precos.get(i);
            }
        }
        return menorPreco;
    }
    List<Double> buscarPorPrecoMinimo(List<Double> precos){
        System.out.println("Digite um preço: ");
        Scanner leitor = new Scanner(System.in);
        Double preco = leitor.nextDouble();
        List<Double> listaNova = new ArrayList<>();
        for (int i = 0; i < precos.size() ; i++) {
            if (precos.get(i) >= preco){
                listaNova.add(precos.get(i));
            }
        }
        return listaNova;
    }
}
