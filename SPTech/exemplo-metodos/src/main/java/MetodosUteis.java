public class MetodosUteis {
//    Método
//    Retorno: esse é void
//    nome: exibirUsuario
//    argumentos: nomeUsuario
//    corpo: faz um print enfeitado com o nome

    void exibirUsuario(String nome){
        System.out.printf("""
                *--------------*--------------*
                Usuario: %s
                *--------------*--------------*
                """, nome);
    }

    Double somar(Double num01, Double num02) {
        return num01 + num02;
    }
}
