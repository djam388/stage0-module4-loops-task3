package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int generalLoopNumber = 0;
        int divider = 1;

        if (t < 0) {
            t *= -1;
        }

        while (t / divider > 1) {
            generalLoopNumber++;
            divider *= 10;
        }

        int reminder = t;
        int sum = 0;

        for (int loop = generalLoopNumber; loop >= 0 ; loop--) {
            int numberToDivide = 1;


            for (int iteration = 1; iteration <= loop; iteration++) {
                numberToDivide *= 10;
            }
            if (reminder >= numberToDivide) {
                sum += reminder / numberToDivide;
                reminder = reminder % numberToDivide;
            }

        }
        System.out.println(sum);
    }
}
