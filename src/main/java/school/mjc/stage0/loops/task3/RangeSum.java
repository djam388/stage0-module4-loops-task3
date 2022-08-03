package school.mjc.stage0.loops.task3;

public class RangeSum {
    public static void main(String[] args) {
        printSumInclusive(10, 100);
    }
    public static void printSumInclusive(int firstBoarder, int secondBoarder) {
        int sum = 0;
        for (int i = firstBoarder; firstBoarder <= secondBoarder; firstBoarder++) {
            sum += firstBoarder;
        }
        System.out.println(sum);
    }
}
