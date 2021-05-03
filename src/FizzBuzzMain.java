public class FizzBuzzMain {

    private static final int FIZZ_DIVIDEND = 3;
    private static final int BUZZ_DIVIDEND = 5;

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(printFuzzBuzz(i));
        }
    }

    private static String printFuzzBuzz(int i) {
        if (isFizz(i) && isBuzz(i)) return "FizzBuzz";
        else if (isBuzz(i)) return "Buzz";
        else if (isFizz(i)) return "Fizz";
        else return String.valueOf(i);
    }

    private static boolean isFizz(int i) {
        return i % FIZZ_DIVIDEND == 0;
    }

    private static boolean isBuzz(int i) {
        return i % BUZZ_DIVIDEND == 0;
    }
}
