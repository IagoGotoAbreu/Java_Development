import java.util.concurrent.ThreadLocalRandom;

public class MetodosDivetidos {
    Integer avaliandoSorte(Integer numero) {
        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 11);
        Integer tentativas = 1;
        while (!numeroAleatorio.equals(numero)) {
            numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 11);
            tentativas++;
        }
        return tentativas;
    }

    Integer exibeSorteio() {
        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 11);
        Integer somaNumeros = 0;
        while (!numeroAleatorio.equals(0)){
            numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 11);
            somaNumeros += numeroAleatorio;
        }
        return somaNumeros;
    }

    void exbieImpares(){
        for (Integer i = 0; i <= 90; i+=2){
            System.out.println(i);
        }
    }

    Integer posicaoSorteio(Integer numero){
        Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0, 101);
        Integer contador = 1;
        Integer sorteadoPrimeiraVez = -1;
        while (contador <= 200){
            if(numeroSorteado.equals(numero) && sorteadoPrimeiraVez.equals(-1)){
                sorteadoPrimeiraVez = contador;
            }
            numeroSorteado = ThreadLocalRandom.current().nextInt(0, 101);
            contador++;
        }
        return sorteadoPrimeiraVez;
    }

}
