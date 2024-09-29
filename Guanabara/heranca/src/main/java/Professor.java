public class Professor extends Pessoa {
    private String especialidae;
    private Double salario;

    public void receberAumento(Double aumento){
        this.salario += aumento;
    }

//    public Professor(String nome, Integer idade, String sexo, String especialidae, Double salario) {
//        super(nome, idade, sexo);
//        this.especialidae = especialidae;
//        this.salario = salario;
//    }

    public String getEspecialidae() {
        return especialidae;
    }

    public void setEspecialidae(String especialidae) {
        this.especialidae = especialidae;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
