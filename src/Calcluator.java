public class Calcluator {

    // Parameterised Method -

    public static void addition(int a, int b) {
        System.out.println("addition of " + a + " + " + b + " = " + (a + b));
    }

    public static void substration(int a, int b) {

        System.out.println("substration of " + a + " - " + b + " = " + (a - b));

    }

    public static void multipication(int a, int b) {
        System.out.println("Multiplication of " + a + " * " + b + " = " + (a * b));
    }
    public static void division (int c , int d){
        System.out.println("division of " + c +" / "+ d+ " = "+ (c/d));
    }

    public static void main(String[] args) {
        addition(20, 23);
        addition(13, 24);
        substration(45, 32);
        substration(67, 32);
        substration(90, 9);
        multipication(12,13);
        multipication(10,2);
        multipication(2,4);
        multipication(5 ,6);
        division(12 ,4);
        division(4,6);
        division(78,32);
        division(34,21);
        division(21 ,23);



    }

}

