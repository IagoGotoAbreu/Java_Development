package school.sptech.ex2;

public class TesteEncomendas {
  public static void main(String[] args) {
    Encomenda encomenda01 = new Encomenda();
    encomenda01.valorProduto = 100.0;
    encomenda01.distancia = 330.0;
    encomenda01.tamanho = "P";
    encomenda01.enderecoRemetente = "Rua Santos da Glória, 18";
    encomenda01.enderecoDestinatario = "Av Dr. Pedro, 255";
    encomenda01.calcularFrete();
    encomenda01.aplicarCupomDeDesconto(20);
    encomenda01.valorTotalDaEncomenda();

    Encomenda encomenda02 = new Encomenda();
    encomenda02.valorProduto = 100.0;
    encomenda02.distancia = 90.0;
    encomenda02.tamanho = "G";
    encomenda02.enderecoRemetente = "Rua Santos da Glória, 28";
    encomenda02.enderecoDestinatario = "Av Dr. Pedro, 255";
    encomenda02.calcularFrete();
    encomenda02.aplicarCupomDeDesconto(15);
    encomenda02.valorTotalDaEncomenda();

    Encomenda encomenda03 = new Encomenda();
    encomenda03.valorProduto = 50.0;
    encomenda03.distancia = 200.0;
    encomenda03.tamanho = "M";
    encomenda03.enderecoRemetente = "Rua Santos da Glória, 38";
    encomenda03.enderecoDestinatario = "Av Dr. Pedro, 355";
    encomenda03.calcularFrete();
    encomenda03.aplicarCupomDeDesconto(5);
    encomenda03.valorTotalDaEncomenda();
  }
}
