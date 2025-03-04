package tasks;

public class Task15 {
    private String name;
    private short age;
    private int gpa; // AVG балл аттеста

    public String getName() {
        return name;
    }

    public int getGpa() {
        return gpa;
    }

    public Task15(String name, short age, int gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "\n\t{\n\t" +
                "\tname='" + name + "', " + "\n\t" +
                "\tage=" + age + "', " + "\n\t" +
                "\tgpa=" + gpa + "\n\t" +
                '}' + "\n";
    }
}
