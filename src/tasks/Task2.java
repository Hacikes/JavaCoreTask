package tasks;

public class Task2 {
    public static int getSum(int n) {
        int input = n;
        int result = 0;
        while(n > 0) {
            result += n % 10;
            n /= 10;
        }
        System.out.println("Сумма цифр числа " + input + ": ");
        return result;
    }
}
