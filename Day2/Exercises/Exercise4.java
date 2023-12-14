// 4. **Exercícios com Loops e Arrays**:
//    - Faça um programa que leia 10 números do usuário, armazene-os em um array e imprima o maior e o menor valor.
//    - Escreva um programa que imprima os primeiros 10 números da série de Fibonacci.

package Day2.Exercises;
import java.util.Scanner;

public class Exercise4 {
    int[] numbers = new int[10];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Exercise4 exercise4 = new Exercise4();
        System.out.println("Digite 10 números: ");
        for(int i = 0; i < 10; i++){
            exercise4.numbers[i] = scanner.nextInt();
        }
        int max = exercise4.numbers[0];
        int min = exercise4.numbers[0];
        for(int i = 0; i < 10; i++){
            if(exercise4.numbers[i] > max)
                max = exercise4.numbers[i];
            if(exercise4.numbers[i] < min)
                min = exercise4.numbers[i];
        }
        System.out.println("Maior número: " + max);
        System.out.println("Menor número: " + min);
        
        // Fibonacci
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.println("Série de Fibonacci: ");
        for(int i = 0; i < 10; i++){
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
