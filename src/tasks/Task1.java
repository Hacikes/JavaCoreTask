package tasks;

public class Task1 {
    public static int getFactorial(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Факториал числа " + n + ": ");
        return result;
    }
}
