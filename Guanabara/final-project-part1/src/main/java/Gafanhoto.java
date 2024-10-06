public class Gafanhoto extends Pessoa {
    private String login;
    private Integer totAssistido;

    public Gafanhoto(String nome, Integer idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    public void viuMaisUm(){

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(Integer totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{ "+ super.toString() +"Login: "+ login +"\nTotal de Videos Assistidos: "+ totAssistido +"}\n";
    }
}