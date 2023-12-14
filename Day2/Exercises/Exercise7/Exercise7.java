package Day2.Exercises.Exercise7;

class Circulo implements FormaGeometrica{
    @Override
    public void calcularArea() {
        System.out.println("Calculando a área do círculo...");
    }
}

class Retangulo implements FormaGeometrica{
    @Override
    public void calcularArea() {
        System.out.println("Calculando a área do retângulo...");
    }
}

class Quadrado implements FormaGeometrica{
    @Override
    public void calcularArea() {
        System.out.println("Calculando a área do quadrado...");
    }
}

public class Exercise7 {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Retangulo retangulo = new Retangulo();
        Quadrado quadrado = new Quadrado();

        circulo.calcularArea();
        retangulo.calcularArea();
        quadrado.calcularArea();
    }
}
