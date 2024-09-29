public class Pessoa {
    private String nome;
    private Integer idade;
    private String sexo;

    public void fazerAniver(){
        this.idade++;
    }

    public Pessoa(String nome, Integer idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public Integer getIdade() {
        return this.idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getSexo() {
        return this.sexo;
    }
}
