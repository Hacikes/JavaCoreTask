package tasks;

import java.util.Set;
import java.util.stream.Collectors;

public class Task17 {
    String color;
    String taste;

    public Task17(String color, String taste) {
        this.color = color;
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }
    public String getColor() {
        return color;
    }

    public static String getSourFlomaster(Set<Task17> flomasterSet) {
        // РЕАЛИЗОВАТЬ МЕТОД
        // Необходимо сформировать список цветов кислых фломастеров и вывести его в формате ["цвет1", ..., "цветN"] пример ["красный", "зелёный", "жёлтый"]
        return flomasterSet.stream()
                .filter(flomaster -> flomaster.getTaste().equals("кислый"))
                .map(Task17::getColor)
                .collect(Collectors.joining(", ", "[", "]"));
    }
}
