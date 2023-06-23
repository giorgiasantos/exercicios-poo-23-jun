package EX04;

public class Mamifero extends Animal{
    String alimento;

    public Mamifero(String nome, double comprimento, int numPatas, String cor, String ambiente, double velocidade, String alimento) {
        super(nome, comprimento, numPatas, cor, ambiente, velocidade);
        this.alimento = alimento;
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
        System.out.println("Alimento:" + alimento);
        System.out.println("----------------------------------------");

    }
}
