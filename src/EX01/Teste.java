package EX01;

public class Teste {
    public static void main(String[] args) {
        ContaPoupanca poupanca = new ContaPoupanca();
        poupanca.setNomeCliente("Marilia Brandão");
        poupanca.setNumConta(9807);
        poupanca.setTipoDeConta("Poupança");
        poupanca.setSaldo(150.0);

        ContaEspecial especial = new ContaEspecial();
        especial.setNomeCliente("João Melo");
        especial.setNumConta(1989);
        especial.setLimite(500.0);
        especial.setTipoDeConta("Especial");
        especial.setSaldo(895.0);

        poupanca.fazerSaque(190.0);
        especial.fazerSaque(800.0);
        poupanca.fazerSaque(100.0);
        especial.fazerSaque(499.9);

        poupanca.fazerDeposito(1000.0);
        especial.fazerDeposito(67.5);

        poupanca.calcularNovoSaldo(30);

        poupanca.mostrarDados();
        especial.mostrarDados();


    }
}
