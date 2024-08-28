public class ContaBanco {
    public Integer numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private Boolean status; //true -> aberto , false -> fechado

    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if (this.getTipo().equals("CC")) {
            this.setSaldo(50);
        } else if(this.getTipo().equals("CP")) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito");
        } else {
            setStatus(false);
        }
    }
    public void depositar(float valor){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado com sucesso");
        } else {
            System.out.println("Impossível depositar em uma conta fechada");
        }
    }
    public void sacar(float valor){
        if (this.getStatus()){
            if(this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado com sucesso");
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível sacar");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo().equals("CC")){
            v = 12;
        } else if (this.getTipo().equals("CP")) {
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga!");
        } else {
            System.out.println("Impossível pagar");
        }
    }

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
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

    public float getSaldo() {
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

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void status(){
        System.out.println("*----------------------*----------------------*");
        System.out.println("CONTA DO BANCO");
        System.out.println("Número da conta: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Dono da conta: " + this.getDono());
        System.out.println("Saldo da conta: " + this.getSaldo());
        System.out.println("Status da conta: " + this.getStatus());
    }

}

