public class Tecnico extends Aluno{
    private Integer registroProfissional;

    public void praticar(){
        System.out.println(this.getNome() + ", Estou praticando!");
    }

    public Integer getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(Integer registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
