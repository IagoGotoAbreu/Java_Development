public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private Integer totPaginas;
    private Integer pagAtual;
    private Boolean aberto;
    private Pessoa leitor;

    public String detalhes() {
        return "Livro{" +
                "\ntitulo = " + titulo +
                ", autor = " + autor +
                "\ntotPaginas = " + totPaginas +
                ", pagAtual = " + pagAtual +
                ", aberto = " + aberto +
                "\nleitor = " + leitor.getNome() +
                ", idade = " + leitor.getIdade() +
                ", sexo = " + leitor.getSexo() +
                "\n}";
    }

    public Livro(String titulo, String autor, Integer totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(Integer totPaginas) {
        this.totPaginas = totPaginas;
    }

    public Integer getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(Integer pagAtual) {
        this.pagAtual = pagAtual;
    }

    public Boolean getAberto() {
        return aberto;
    }

    public void setAberto(Boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(Integer p) {
        if (p > this.getTotPaginas()){
            this.pagAtual = 0;
            System.out.println("Não tem páginas suficientes");
        } else {
            this.pagAtual = p;
        }
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
}

