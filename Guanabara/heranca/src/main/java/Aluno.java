public class Aluno extends Pessoa {
    private Integer matricula;
    private String curso;

    public void cancelarMatricula(){
        System.out.println("Matrícula será cancelada!");
    }

//    public Aluno(String nome, Integer idade, String sexo, Integer matricula, String curso) {
//        super(nome, idade, sexo);
//        this.matricula = matricula;
//        this.curso = curso;
//    }

    public Integer getMatricula() {
        return this.matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
