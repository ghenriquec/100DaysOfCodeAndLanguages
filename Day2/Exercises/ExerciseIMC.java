package Day2.Exercises;

import java.util.Scanner;

public class ExerciseIMC {
    float weight;
    float height;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu peso: ");
        float weight = scanner.nextFloat();
        System.out.println("Digite a sua altura: ");
        float height = scanner.nextFloat();

        float imc = weight / (height * height);

        System.out.printf("IMC: %.2f\n", imc);

        if(imc < 18.5)
            System.out.println("Abaixo do peso");
        else if(imc >= 18.5 && imc < 24.9)
            System.out.println("Peso normal");
        else if(imc >= 25 && imc < 29.9)
            System.out.println("Sobrepeso");
        else if(imc >= 30 && imc < 34.9)
            System.out.println("Obeso leve");
        else if(imc >= 35 && imc < 39.9)
            System.out.println("Obeso Grau II");
        else if(imc >= 40)
            System.out.println("Obeso mórbida");
    }
}
