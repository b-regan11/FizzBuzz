public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int divisorA = 3;
            int divisorB = 5;
            int remainderA = i % divisorA;
            int remainderB = i % divisorB;
            if (remainderA == 0 && remainderB == 0) {
                System.out.println("FizzBuzz");
            } else if (remainderA == 0) {
                System.out.println("Fizz");
            } else if (remainderB == 0) {
                System.out.println("Buzz");
            }
        }
    }
}
