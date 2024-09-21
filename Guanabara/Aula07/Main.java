import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Lutador[] listaLutadores = new Lutador[6];
        listaLutadores[0] = new Lutador("Pretty Boy", "França", 31 ,1.75, 68.9, 11, 3, 1);
        listaLutadores[1] = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        listaLutadores[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
        listaLutadores[3] = new Lutador("Dead code", "Austrália", 28, 1.93, 81.6, 13, 0, 2);
        listaLutadores[4] = new Lutador("UF0Cobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
        listaLutadores[5] = new Lutador("Nerdaart", "EUA", 30, 1.81, 105.7, 12, 2, 4);

        listaLutadores[3].status();
    }
}
