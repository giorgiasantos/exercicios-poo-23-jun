package EX04;

public abstract class Animal {
    String nome;
    double comprimento;
    int numPatas;
    String cor;
    String ambiente;
    double velocidade;

    public Animal(String nome, double comprimento, int numPatas, String cor, String ambiente, double velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numPatas = numPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }

    public void mostrarInfos() {
        System.out.println("----------------------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Comprimento em metros: " + comprimento);
        System.out.println("Número de patas: " + numPatas);
        System.out.println("Cor: " + cor);
        System.out.println("Ambiente em que vive: " + ambiente);
        System.out.println("Velocidade média: " + velocidade);
        System.out.println("----------------------------------------");


    }
}
