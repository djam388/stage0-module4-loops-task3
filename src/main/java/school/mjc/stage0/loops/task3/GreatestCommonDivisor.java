package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        printGCD(20, 130);
    }
    public static void printGCD(int first, int second) {
        int greatestNumber;
        int greatestDivisor = 0;

        if (first < second) {
            greatestNumber = second;
        }
        else {
            greatestNumber = first;
        }

        for (int counter = 2; counter <= greatestNumber; counter++) {
            if (first % counter == 0 && second % counter == 0) {
                if (counter > greatestDivisor) {
                    greatestDivisor = counter;
                }
            }
        }

        System.out.println(greatestDivisor);

    }
}
