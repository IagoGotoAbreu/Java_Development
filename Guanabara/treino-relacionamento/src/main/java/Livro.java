public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private Integer totPaginas;
    private Integer pagAtual;
    private Boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, Integer totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public String detalhes (){

        return "*-------------------------------------------------------------------------*\n" +
                "Título: " + titulo +
                ", Autor: " + autor +
                "\nTotal de páginas: " + totPaginas +
                ", Página atual: " + pagAtual +
                ", Está aberto: " + aberto +
                "\nLeitor: " + leitor.getNome() +
                ", Idade: " + leitor.getIdade() +
                ", Sexo: " + leitor.getSexo() +
                "\n*-------------------------------------------------------------------------*";
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getTotPaginas() {
        return this.totPaginas;
    }

    public void setTotPaginas(Integer totPaginas) {
        this.totPaginas = totPaginas;
    }

    public Integer getPagAtual() {
        return this.pagAtual;
    }

    public void setPagAtual(Integer pagAtual) {
        this.pagAtual = pagAtual;
    }

    public Boolean getAberto() {
        return this.aberto;
    }

    public void setAberto(Boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return this.leitor;
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
