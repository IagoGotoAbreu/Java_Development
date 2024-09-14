package school.sptech.ex1;

public class Bolo {
    String sabor;
    Double valor;
    Integer quantidadeVendida;
    Integer quantidadeEmEstoque;

    void venderBolo(Integer qtdDesejada){
        if (qtdDesejada >= 0){
            if (qtdDesejada <= quantidadeEmEstoque){
            quantidadeVendida += qtdDesejada;
            quantidadeEmEstoque -= quantidadeVendida;
            }
        }
        System.out.println("Você vendeu: " + quantidadeVendida);
    }

    void aumentarEstoque(Integer qtdAddEstoque){
        System.out.println("Bolos no estoque: " + quantidadeEmEstoque);
        if (qtdAddEstoque >= 0){
            quantidadeEmEstoque += qtdAddEstoque;
        }
        System.out.println("Bolos no estoque agora: " + quantidadeEmEstoque);
    }

    Integer quantidadeDisponivel(){
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
        return quantidadeEmEstoque;
    }

    Double totalVendido(){
        System.out.println("Total de bolos de " + sabor + " Vendido: " + quantidadeVendida);
        return quantidadeVendida * valor;
    }
}
