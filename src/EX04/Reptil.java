package EX04;

public class Reptil extends Animal{
    Boolean temSangueFrio;

    public Reptil(String nome, double comprimento, int numPatas, String cor, String ambiente, double velocidade, Boolean temSangueFrio) {
        super(nome, comprimento, numPatas, cor, ambiente, velocidade);
        this.temSangueFrio = temSangueFrio;
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
        System.out.println("Tem sangue frio: " + temSangueFrio);
        System.out.println("----------------------------------------");

    }
}
