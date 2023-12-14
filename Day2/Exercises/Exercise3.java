// 3. **Exercícios de Controle de Fluxo**:
//    - Escreva um programa que verifique se um número é par ou ímpar.
//    - Crie um programa que, dado um ano, determine se ele é um ano bissexto.

package Day2.Exercises;

import java.util.Scanner;

public class Exercise3 {
    double a;
    double b;
    long year;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double a = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        double b = scanner.nextDouble();
        
        if(a % 2 == 0 && b % 2 == 0)
            System.out.println("O primeiro e o segundo número são pares");
        else if (a % 2 == 0 && b % 2 != 0)
            System.out.println("O primeiro número é par e o segundo é ímpar");
        else if (a % 2 != 0 && b % 2 == 0)
            System.out.println("O primeiro número é ímpar e o segundo é par");
        else
            System.out.println("O primeiro e o segundo número são ímpares");

        // Ano Bissexto
        System.out.println("Digite um ano: ");
        long year = scanner.nextLong();

        if(year % 4 == 0 && year % 100 != 0)
            System.out.println("O ano " + year + " é bissexto");
        else if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0)
            System.out.println("O ano " + year + " é bissexto");
        else
            System.out.println("O ano " + year + " não é bissexto");

    }
}
