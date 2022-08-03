package school.mjc.stage0.loops.task3;

public class NinesSum {
    public static void main(String[] args) {
        calculateSum(0);
    }
    public static void calculateSum(int lengthOfLastNumber) {
        int multiplier = 1;
        int sum = 0;
        int result = 0;
        for (int loop = 1; loop <= lengthOfLastNumber; loop++) {
            if (loop == 1) {
                multiplier = 1;
            }
            else {
                multiplier *= 10;
            }
            sum += multiplier;
            result += sum * 9;
        }
        System.out.println(result);

    }
}
