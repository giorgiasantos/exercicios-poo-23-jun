package EX04;

public class Peixe extends Animal{
    String caracteristicas;

    public Peixe(String nome, double comprimento, int numPatas, String cor, String ambiente, double velocidade, String caracteristicas) {
        super(nome, comprimento, numPatas, cor, ambiente, velocidade);
        this.caracteristicas = caracteristicas;
    }

    @Override
    public void mostrarInfos() {
        System.out.println("----------------------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Comprimento em metros: " + comprimento);
        System.out.println("Número de patas: " + numPatas);
        System.out.println("Cor: " + cor);
        System.out.println("Ambiente em que vive: " + ambiente);
        System.out.println("Velocidade média: " + velocidade);
        System.out.println("Características: " + caracteristicas);
        System.out.println("----------------------------------------");

    }
}
