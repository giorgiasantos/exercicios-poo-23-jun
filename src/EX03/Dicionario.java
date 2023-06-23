package EX03;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    public void imprimirChaves() {
        System.out.println("DICIONÁRIO DE OBJETOS E CORES");
        Map<String, String> objetosECores = new HashMap<>();
        objetosECores.put("Bola", "Azul");
        objetosECores.put("Gato", "Branco");
        objetosECores.put("Livro", "Vermelho");
        objetosECores.put("Bolsa", "Preta");
        objetosECores.put("Carro", "Amarelo");

        objetosECores.forEach((chave, valor) -> {
            System.out.println(chave + "-> " + valor);
        });
    }
}
