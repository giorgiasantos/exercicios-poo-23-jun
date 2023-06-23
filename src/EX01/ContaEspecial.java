package EX01;

public class ContaEspecial extends ContaBancaria{
    private double limite;


    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public double fazerSaque(double quantiaSaque){

        if (quantiaSaque > 0 && quantiaSaque <= getLimite()) {
            setSaldo(getSaldo() - quantiaSaque);
            System.out.println("VOCÊ SACOU R$ " + quantiaSaque + ". SEU SALDO ATUAL É R$" + getSaldo());
            return getSaldo();
        } else {
            System.out.println("OPERAÇÃO INVÁLIDA.");

        }
        return getSaldo();
    }

}
