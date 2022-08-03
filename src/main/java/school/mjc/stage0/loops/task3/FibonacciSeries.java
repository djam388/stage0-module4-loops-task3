package school.mjc.stage0.loops.task3;

public class FibonacciSeries {

    public void printFibonacci(int lastFibonacci) {
        int numberOne = 0;
        int numberTwo = 1;
        int sum = 0;

        System.out.println(numberOne);
        System.out.println(numberTwo);

        for (int counter = 2; counter < lastFibonacci; counter++) {

            sum = numberOne + numberTwo;

            System.out.println(sum);

            numberOne = numberTwo;
            numberTwo = sum;

        }

    }
}
