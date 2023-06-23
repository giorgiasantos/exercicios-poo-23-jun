package EX01;

public class ContaPoupanca extends ContaBancaria{
    private double taxaRendimento = 0.002;
    private int diaRendimento;

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public double calcularNovoSaldo(int diasDeRendimento) {

        double rendimentoMensal = (taxaRendimento * getSaldo()) * diasDeRendimento;
        setSaldo(rendimentoMensal + getSaldo());
        System.out.println("SEU DINHEIRO RENDEU R$ " + rendimentoMensal+ " DURANTE O PERÍODO DE " + diasDeRendimento + " DIAS. SEU SALDO ATUAL É R$ " + getSaldo());
        return getSaldo();
    }

}
