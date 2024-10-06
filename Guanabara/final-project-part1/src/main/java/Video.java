public final class Video implements AcoesVideo {
    private String titulo;
    private Integer avalicao;
    private Integer views;
    private Integer curtidas;
    private Boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avalicao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAvalicao() {
        return avalicao;
    }

    public void setAvalicao(Integer avalicao) {
        int nova;
        nova = (this.avalicao + avalicao) / this.views;
        this.avalicao = nova;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(Integer curtidas) {
        this.curtidas = curtidas;
    }

    public Boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(Boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.curtidas++;
    }

    @Override
    public String toString() {
        return """
                Vídeo{
                Título: %s
                Avalição: %d
                Views: %d
                Curtidas: %d 
                Reproduzindo: %b
                }
                """.formatted(titulo, avalicao, views, curtidas, reproduzindo);
    }
}
