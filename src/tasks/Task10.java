package tasks;

public class Task10 {

    private String fio;
    private String jobTitle;
    private String email;
    private String phone;
    private double salary;
    private short age;

    public Task10(String fio, String jobTitle, String email, String phone, int salary, short age) {
        this.fio = fio;
        this.jobTitle = jobTitle;
        this.phone = phone;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }

    public void getEmployeeInfo() {
        System.out.println("ФИО: " + fio);
        System.out.println("Должность: " + jobTitle);
        System.out.println("email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println("-----------------------------");
    }

    public int getAge() {
        return age;
    }
}
