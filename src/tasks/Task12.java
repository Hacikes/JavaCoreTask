package tasks;

public class Task12 {

    public static void getExpensesAndIncome(String input) {
        System.out.println("Исходная строка: " + input);
        String[] parts = input.split(", ");
        int expenses = Integer.parseInt(parts[2].replace(" ₽", ""));
        int income = Integer.parseInt(parts[4].replace(" ₽", ""));
        System.out.println("Расходы: " + expenses + " ₽");
        System.out.println("Доходы: " + income + " ₽");
    }
}
