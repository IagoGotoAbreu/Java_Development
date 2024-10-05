public class Main {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        c.reagir("ola");
        c.reagir("Vai apanhar");
        c.reagir(11);
        c.reagir(21);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5);
        c.reagir(17,4.5);
    }
}
