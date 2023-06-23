package EX02;

public class TributosContaCorrente implements CalculoTributos{
    private String nome;
    private int numConta;
    private double saldo;
    private String tipoDeConta = "Corrente";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    @Override
    public void calcularTributos() {
        if(getTipoDeConta().equalsIgnoreCase("Corrente")) {
            double tributos = getSaldo() * 0.01;
            setSaldo(getSaldo() - tributos);
            System.out.println("VOCÊ PAGARÁ O TOTAL DE R$ " + tributos + " EM TRIBUTOS.");
            System.out.println("SEU SALDO ATUALIZADO É DE R$ " + getSaldo());
        } else {
            System.out.println("OPERAÇÃO INVÁLIDA.");
        }

    }
}
