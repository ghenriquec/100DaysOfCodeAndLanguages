package Day2.Exercises;


public class Exercise5 {
    public static void main(String[] args) {
        
    }

    class car{
        int speed = 0;
        void speedUp(){
            speed += 5;
            System.out.println("speeding up...");
        }

        void speedDown(){
            speed -= 5;
            System.out.println("speeding down...");
        }

        void showSpeed(){
            System.out.println("speed: " + speed + "km/h");
        }
    }

    // calculator
    class calculator{
        static double sum(double a, double b){
            return a + b;
        }

        static double sub(double a, double b){
            return a - b;
        }

        static double mult(double a, double b){
            return a * b;
        }

        static double div(double a, double b){
            if(b == 0){
                System.out.println("Error: division by zero");
                return 0;
            }
            return a / b;
        }
        
    }
}
