package Day2.Exercises.Exercise9;

import java.util.Arrays;
import java.util.List;

public class FiltrarString {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("casa", "carro", "moto", "bicicleta", "caminhão", "ônibus", "avião", "Arco", "trem", "metrô");
        char initialLetter = 'A';
        char initialLetterFilter = Character.toLowerCase(initialLetter);

       List<String> palavrasFiltradas = palavras.stream()
            .filter(palavra -> palavra.toLowerCase().charAt(0) == initialLetterFilter)
            .toList();

        System.out.println(palavrasFiltradas);
    }
}
