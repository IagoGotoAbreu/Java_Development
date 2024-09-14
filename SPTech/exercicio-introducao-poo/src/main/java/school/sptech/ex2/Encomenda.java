package school.sptech.ex2;

public class Encomenda {
    String tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia;
    Double valorProduto;

    Double calcularFrete(){
        Double valorFrete = 0.00;
        if (tamanho.equals("P")){
            valorProduto *= 0.01;
        }
        if (tamanho.equals("M")) {
            valorProduto *= 0.03;
        }
        if (tamanho.equals("G")) {
            valorProduto *= 0.05;
        }
        if (distancia <= 50) {
            valorFrete = valorProduto + 3.00;
        }
        if (distancia > 50 && distancia <= 200) {
            valorFrete = valorProduto + 5.00;
        }
        if (distancia > 200) {
            valorFrete = valorProduto + 7.00;
        }
        System.out.println("Frete: " + valorFrete);
        return valorFrete;
    }

    void aplicarCupomDeDesconto(Integer percentualDesconto){
        Double valorDesconto = percentualDesconto * valorProduto / 100.00;
        valorProduto -= valorDesconto;
        System.out.println("Valor do produto com desconto: " + valorProduto);
    }

    Double valorTotalDaEncomenda(){
        return valorProduto + calcularFrete();
    }
}
