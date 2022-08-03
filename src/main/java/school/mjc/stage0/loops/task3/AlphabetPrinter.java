package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public static void main(String[] args) {
        printAlphabet();
    }
    public static void printAlphabet() {
        for (char charCode = 97; charCode <= 122; charCode++) {
            System.out.println(charCode);
        }
    }
}
