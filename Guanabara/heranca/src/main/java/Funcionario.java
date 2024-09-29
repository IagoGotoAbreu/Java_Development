public class Funcionario extends Pessoa{
    private String setor;
    private Boolean trabalhando;

    public void mudarTrabalho(){
//        if (this.trabalhando){
//            this.trabalhando = false;
//        } else {
//            this.trabalhando = true;
//        }
        this.trabalhando = !this.trabalhando;
    }

//    public Funcionario(String nome, Integer idade, String sexo, String setor, Boolean trabalhando) {
//        super(nome, idade, sexo);
//        this.setor = setor;
//        this.trabalhando = trabalhando;
//    }

    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Boolean getTrabalhando() {
        return this.trabalhando;
    }

    public void setTrabalhando(Boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
