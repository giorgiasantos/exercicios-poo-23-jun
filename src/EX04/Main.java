package EX04;


public class Main {
    public static void main(String[] args) {
        Peixe tubarao = new Peixe("Tubarão", 2.0, 0, "Cinza", "Oceano", 19.0, "Barbatana, dentes afiados");
        Mamifero camelo = new Mamifero("Camelo", 2.5, 4, "Laranja", "Deserto", 65.0, "Vegetais");
        Mamifero ursoDoCanada = new Mamifero("Urso-do-Canadá",2.5,4, "Marrom", "Floresta", 56.0, "Peixes, frutas, nozes");
        Mamifero micoLeao = new Mamifero("Mico-Leão-Dourado", 0.24, 4, "Dourado", "Mata Atântica Brasileira", 20.0, "Frutas, insetos");
        Reptil iguana = new Reptil("Iguana", 0.8, 4, "Verde", "Regiões tropicais", 20.0, true);
        Mamifero leao = new Mamifero("Leão", 2.0, 4,"Caramelo", "Savana", 80.0, "Animais de médio a grande porte");

        System.out.println("------------JARDIM ZOOLOGICO------------");
        tubarao.mostrarInfos();
        camelo.mostrarInfos();
        ursoDoCanada.mostrarInfos();
        micoLeao.mostrarInfos();
        iguana.mostrarInfos();
        leao.mostrarInfos();

    }
}
