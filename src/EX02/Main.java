package EX02;

public class Main {
    public static void main(String[] args) {
        TributosPoupanca poupanca = new TributosPoupanca();
        poupanca.setSaldo(100.0);
        poupanca.setNumConta(980);
        poupanca.setNome("Maria");
        TributosContaCorrente corrente = new TributosContaCorrente();
        corrente.setSaldo(1598.5);
        corrente.setNumConta(865);
        corrente.setNome("João");
        TributosSeguro seguro = new TributosSeguro();
        seguro.setSaldo(400.0);
        seguro.setNumConta(823);
        seguro.setNome("José");

        poupanca.calcularTributos();
        corrente.calcularTributos();
        seguro.calcularTributos();

    }
}
