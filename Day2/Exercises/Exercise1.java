//    1. **Exercícios com Variáveis e Tipos Primitivos**:
//    - Crie variáveis de cada tipo primitivo e inicialize-as com valores. Em seguida, imprima esses valores na tela.
//    - Faça um programa que troque os valores armazenados em duas variáveis e imprima os valores antes e depois da troca.

package Day2.Exercises;

class Exercise1 {
    int a = 3;
    byte b = 1;
    short c = 2;
    long d = 4;
    float e = 5.0f;
    double f = 6.0;
    boolean g = true;
    char h = 'a';

    public static void main(String[] args) {
        Exercise1 ex1 = new Exercise1();
        System.out.println("a = " + ex1.a);
        System.out.println("b = " + ex1.b);
        System.out.println("c = " + ex1.c);
        System.out.println("d = " + ex1.d);
        System.out.println("e = " + ex1.e);
        System.out.println("f = " + ex1.f);
        System.out.println("g = " + ex1.g);
        System.out.println("h = " + ex1.h);

        int a = 1;
        int b = 2;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int c = a;
        a = b;
        b = c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    
}