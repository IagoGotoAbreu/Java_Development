public class Main {
    public static void main(String[] args) {

        Lutador[] listaLutadores = new Lutador[6];
        listaLutadores[0] = new Lutador("Pretty Boy", "França", 31 ,1.75, 68.9, 11, 3, 1);
        listaLutadores[1] = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        listaLutadores[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
        listaLutadores[3] = new Lutador("Dead code", "Austrália", 28, 1.93, 81.6, 13, 0, 2);
        listaLutadores[4] = new Lutador("UF0Cobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
        listaLutadores[5] = new Lutador("Nerdaart", "EUA", 30, 1.81, 105.7, 12, 2, 4);

        Luta[] UEC01 = new Luta[3];
        UEC01[0] = new Luta();
        UEC01[1] = new Luta();
        UEC01[2] = new Luta();

        UEC01[0].marcarLuta(listaLutadores[0], listaLutadores[1]);
        UEC01[0].lutar();

        UEC01[1].marcarLuta(listaLutadores[2], listaLutadores[3]);
        UEC01[1].lutar();

        UEC01[2].marcarLuta(listaLutadores[4], listaLutadores[5]);
        UEC01[2].lutar();
    }
}
