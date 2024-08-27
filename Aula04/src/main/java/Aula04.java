public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", "Amerelo", 0.4f);
        c1.status();
        Caneta c2 = new Caneta("KKK", "Laranja", 0.8f);
        c2.status();

        Carro ca1 = new Carro("Toyta", "Preto", 2020);
        ca1.status();
        Carro ca2 = new Carro("Fiat", "Branco", 2014);
        ca2.status();

//        c1.setModelo("BIC");
//        c1.modelo = "BIC";

//        c1.setPonta(0.5f);
//        c1.ponta = 0.5f;

//        System.out.println("Tenho uma caneta "+ c1.getModelo() + " de ponta " + c1.getPonta());
    }
}
