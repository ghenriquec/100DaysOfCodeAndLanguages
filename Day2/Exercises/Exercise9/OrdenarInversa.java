package Day2.Exercises.Exercise9;

import java.util.Arrays;
import java.util.List;

public class OrdenarInversa {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("João", "Maria", "José", "Pedro", "Ana", "Carlos", "Paulo", "Marta", "Lucas", "Luana");
        List<String> nomesOrdenados = nomes.stream()
            .sorted((nome1, nome2) -> nome2.compareTo(nome1))
            .toList();

        System.out.println(nomesOrdenados);
    }
}
