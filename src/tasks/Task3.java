package tasks;

public class Task3 {
    static double square = 0;
    public static double GetTriangleSquare(double a, double b, double c) {
        System.out.println("Заданы сторона a = " + a + "м, сторона b = " + b + "м, сторона c = " + c + "м.");
        double p = (a + b + c) / 2;
        square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return square;
    }
}
