package tasks;

public class Task4 {
    public static boolean BetweenNumber(int a, int b) {
        System.out.println("Исходные числа: " + a + ", " + b + ".");
        boolean betweenResult = false;
        if(10 <= a + b && a + b <= 20) {
            betweenResult = true;
        }
        return betweenResult;
    }
}