package EX01;

public abstract class ContaBancaria {
    private String nomeCliente;
    private int numConta;
    private double saldo;
    private String tipoDeConta;


    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    public double fazerSaque(double quantiaSaque){

        if (quantiaSaque > 0 && quantiaSaque <= getSaldo()) {
            setSaldo(getSaldo() - quantiaSaque);
            System.out.println("VOCÊ SACOU R$ " + quantiaSaque + ". SEU SALDO ATUAL É R$" + getSaldo());
            return getSaldo();
        } else {
            System.out.println("OPERAÇÃO INVÁLIDA.");

        }
        return getSaldo();
    }

    public double fazerDeposito(double quantiaDeposito){
        setSaldo(getSaldo() + quantiaDeposito);
        System.out.println("VOCÊ DEPOSITOU O VALOR DE R$ " + quantiaDeposito + ". SEU SALDO ATUAL É R$ " + getSaldo());
        return getSaldo();
    }

    public void mostrarDados() {
        System.out.println("----------------------------------");
        System.out.println("INFORMAÇÕES DE CONTA BANCÁRIA");
        System.out.println("----------------------------------");
        System.out.println("Nome do cliente: " + getNomeCliente());
        System.out.println("Número da conta: " + getNumConta());
        System.out.println("Tipo de conta: " + getTipoDeConta());
        System.out.println("Saldo R$ " + getSaldo());
    }
}
