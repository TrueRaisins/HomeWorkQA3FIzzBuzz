package FizzBuzz;

public class FizzBuzz {
    private final int i;

    public FizzBuzz(int i) {
        this.i = i;
    }

    public void calculate() {
        for (int i = 0; i <= 100; i++) {

            if (i % (3 * 5) == 0) {

                System.out.println(i + " " + "FIzzBuzz");
                continue;
            }
            if (i % 3 == 0) {

                System.out.println(i + " " + "Fizz");
                continue;
            }
            if (i % 5 == 0) {

                System.out.println(i + " " + "Buzz");
                continue;
            }
            ;
        }
    }
}