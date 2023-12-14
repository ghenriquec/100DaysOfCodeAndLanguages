package Day2.Exercises;

// Animals and abstract classes
abstract class animal {
    abstract void makeSound();
}

class dog extends animal {
    @Override
    void makeSound() {
        System.out.println("Au au");
    }
}

class cat extends animal {
    @Override
    void makeSound() {
        System.out.println("Miau");
    }
}

// Forms 
abstract class forma{
    abstract void calculateArea();
}

class circulo extends forma{
    @Override
    void calculateArea() {
        System.out.println("Calculando a área do círculo...");
    }
}

class retangulo extends forma{
    @Override
    void calculateArea() {
        System.out.println("Calculando a área do retângulo...");
    }
}

public class Exercise6 {
    public static void main(String[] args) {
        dog dog = new dog();
        cat cat = new cat();
        circulo circulo = new circulo();
        retangulo retangulo = new retangulo();

        circulo.calculateArea();
        retangulo.calculateArea();
        dog.makeSound();
        cat.makeSound();
    }
}

