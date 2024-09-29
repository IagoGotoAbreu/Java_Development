public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Millena", 19, "F");
        p[1] = new Pessoa("Tiago", 20, "M");

        l[0] = new Livro("Babuino", "José", 300, p[0]);
        l[1] = new Livro("Dimundo" , "Maria", 600, p[0]);
        l[2] = new Livro("Harry", "Potter", 1500, p[1]);

        l[0].folhear(250);
        l[0].avancarPag();
        l[0].avancarPag();
        l[0].avancarPag();
        l[0].avancarPag();
        l[0].avancarPag();
        l[0].avancarPag();
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
    }
}
