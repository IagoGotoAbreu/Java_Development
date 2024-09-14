package school.sptech.ex1;

public class TesteConfeitaria {
  public static void main(String[] args) {
    Bolo bolo01 = new Bolo();
    bolo01.sabor = "morango";
    bolo01.valor = 32.50;
    bolo01.quantidadeVendida = 0;
    bolo01.quantidadeEmEstoque = 50;
    bolo01.venderBolo(30);
    bolo01.aumentarEstoque(80);
    bolo01.quantidadeDisponivel();
    bolo01.totalVendido();

    Bolo bolo02 = new Bolo();
    bolo02.sabor = "chocolate";
    bolo02.valor = 55.50;
    bolo02.quantidadeVendida = 0;
    bolo02.quantidadeEmEstoque = 120;
    bolo02.venderBolo(50);
    bolo02.aumentarEstoque(80);
    bolo02.quantidadeDisponivel();
    bolo02.totalVendido();
  }
}
