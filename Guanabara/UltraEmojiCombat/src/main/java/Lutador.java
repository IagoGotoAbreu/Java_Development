public class Lutador {
    private String nome;
    private String nacionalidade;
    private Integer idade;
    private Double altura;
    private Double peso;
    private String categoria;
    private Integer vitorias;
    private Integer derrotas;
    private Integer empates;

    public void apresentar(){
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura em metros: " + this.getAltura());
        System.out.println("Pesando: " + this.getPeso());
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());
    }

    public void status(){
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

    public Lutador(String no, String na, Integer id, Double al, Double pe, Integer vi, Integer de, Integer em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String no) {
        this.nome = no;
    }

    public Double getPeso() {
        return this.peso;
    }
    public void setPeso(Double pe) {
        this.peso = pe;
        this.setCategoria();
    }

    private void setCategoria() {
        if (this.peso < 52.2){
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Sumo!";
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setVitorias(Integer vi) {
        this.vitorias = vi;
    }

    public void setDerrotas(Integer de) {
        this.derrotas = de;
    }

    public void setEmpates(Integer em) {
        this.empates = em;
    }

    public Integer getVitorias() {
        return this.vitorias;
    }

    public Integer getDerrotas() {
        return this.derrotas;
    }

    public Integer getEmpates() {
        return this.empates;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public Integer getIdade() {
        return this.idade;
    }

    public Double getAltura() {
        return this.altura;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public void setAltura(Double al) {
        this.altura = al;
    }

    public void setIdade(Integer id) {
        this.idade = id;
    }
}
