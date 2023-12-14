// 2. **Exercícios de Operadores**:
//    - Crie um programa que leia dois números inteiros e imprima a soma, subtração, multiplicação, divisão e o módulo.
//    - Implemente um programa que calcula o IMC (Índice de Massa Corporal) utilizando operadores aritméticos.
package Day2.Exercises;

import java.util.Scanner;

public class Exercise2 {
    int a;
    int b;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int a = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int b = scanner.nextInt();
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Módulo: " + (a % b));
    }
}
