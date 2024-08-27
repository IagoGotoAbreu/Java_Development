public class Carro {
    private String marca;
    private String cor;
    private Integer ano;
    private Boolean seguro;

    public Carro (String m, String c, Integer a){
        this.marca = m;
        this.cor = c;
        this.ano = a;
        this.possuirSeguro();
    }

    public String getMarca() {
        return this.marca;
    }

    public String getCor() {
        return this.cor;
    }

    public Integer getAno() {
        return this.ano;
    }

    public Boolean getSeguro() {
        return this.seguro;
    }

    public void setMarca(String m) {
        this.marca = m;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public void setAno(Integer a) {
        this.ano = a;
    }

    public void setSeguro(Boolean s) {
        this.seguro = s;
    }

    public void possuirSeguro(){
        if (getAno() >= 2015){
            seguro = true;
        } else {
            seguro = false;
        }
    }

    public void status(){
        System.out.println("SOBRE O CARRO:");
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Tem seguro? " + this.getSeguro());
    }
}
