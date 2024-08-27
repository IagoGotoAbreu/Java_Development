public class ContaBanco {
    public Integer numConta;
    protected String tipo;
    private String dono;
    private Double saldo;
    private Boolean status; //true -> aberto , false -> fechado

    public ContaBanco() {
        saldo = 0.00;
        status = false;
    }

    public Integer getNumConta() {
        return this.numConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public Boolean getStatus() {
        return this.status;
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void abrirConta(){
        setTipo(tipo);
        setStatus(true);
        if (tipo == "CC") {
            saldo = 50.00;
        } else  {
            saldo = 150.00;
        }
    }
    public void fecharConta(){
        if (saldo > 0) {
            System.out.println("Conta com dinheiro");
        } else if (saldo < 0) {
            System.out.println("Conta em débito");
        } else {
            setStatus(false);
        }
    }
    public void depositar(Double valor){
        if(status.equals(true)){
            setSaldo(getSaldo() + valor);
        } else {
            System.out.println("Impossível depositar");
        }
    }
    public void sacar(Double valor){
        if (getStatus()){
            if(getSaldo() > valor){
                saldo = saldo - valor;
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível sacar");
        }
    }
    public void pagarMensal(){
        Integer v = 0;
        if (tipo.equals("CC")){
            v = 12;
        } else if (tipo.equals("CP")) {
            v = 20;
        }
        if (getStatus()){
            if (getSaldo() > v){
                saldo = saldo - v;
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível pagar");
        }
    }

    public void status(){
        System.out.println("CONTA DO BANCO");
        System.out.println("Número da conta: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Dono da conta: " + this.getDono());
        System.out.println("Saldo da conta: " + this.getSaldo());
        System.out.println("Status da conta: " + this.getStatus());
    }

}

