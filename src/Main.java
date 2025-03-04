import tasks.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // ЗАДАНИЕ 1 - Написать метод, который вычисляет факториал введенного целого числа
        System.out.println("ЗАДАНИЕ 1 - Написать метод который вычисляет факториал введенного целого числа." +
                "\nРезультат выполнения: ");
        System.out.println(Task1.getFactorial(10));
        System.out.println("-------------------------------------------------------------------");


        // ЗАДАНИЕ 2 - Посчитать сумму цифр заданного числа
        System.out.println("ЗАДАНИЕ 2 - Посчитать сумму цифр заданного числа." +
                "\nРезультат выполнения: ");
        System.out.println(Task2.getSum(101));
        System.out.println("-------------------------------------------------------------------");


        // ЗАДАНИЕ 3 - Написать программу вычисляющую площадь треугольника по трем сторонам
        System.out.println("ЗАДАНИЕ 3 - Написать программу вычисляющую площадь треугольника по трем сторонам." +
                "\nРезультат выполнения: ");
        System.out.println(Task3.GetTriangleSquare(5, 3, 4) + "м2");
        System.out.println("-------------------------------------------------------------------");


        // ЗАДАНИЕ 4 - Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false
        System.out.println("ЗАДАНИЕ 4 - Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false." +
                "\nРезультат выполнения: ");
        System.out.println(Task4.BetweenNumber(10, 2));
        System.out.println("-------------------------------------------------------------------");


        // ЗАДАНИЕ 5 - Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [1, 1, 0, 0, 1, 0, 1, 1, 0, 0]. С помощью цикла и условия заменить 0 на 1, 1 на 0.
        System.out.println("ЗАДАНИЕ 5 - Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [1, 1, 0, 0, 1, 0, 1, 1, 0, 0]. С помощью цикла и условия заменить 0 на 1, 1 на 0." +
                "\nРезультат выполнения: ");
        System.out.println(Arrays.toString(Task5.GetArray01(new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0})));
        System.out.println("-------------------------------------------------------------------");


        // ЗАДАНИЕ 6 - Задать массив [1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1] пройти по нему циклом, и числа меньшие 6 умножить на 2.
        System.out.println("ЗАДАНИЕ 6 - Задать массив [1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1] пройти по нему циклом, и числа меньшие 6 умножить на 2." +
                "\nРезультат выполнения: "
                + Arrays.toString(Task6.GetArrayAfterChange(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1})));
        System.out.println("-------------------------------------------------------------------");


        // ЗАДАНИЕ 7 - Вывести элементы массива в обратном порядке.
        System.out.println("ЗАДАНИЕ 7 - Вывести элементы массива, например, [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] в обратном порядке." +
                "\nРезультат выполнения: "
                + Arrays.toString(Task7.GetInvertedArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})));
        System.out.println("-------------------------------------------------------------------");


        // ЗАДАНИЕ 8 - Среди чисел найти число-палиндром. Если таких чисел больше одного, найти второе.
        System.out.println("ЗАДАНИЕ 8 - Среди чисел найти число-палиндром. Если таких чисел больше одного, найти второе." +
                "\nРезультат выполнения: ");
        Task8.getPalindrome(new int[]{123, 555, 321, 123321});
        System.out.println("-------------------------------------------------------------------");


        // ЗАДАНИЕ 9 - Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.
        System.out.println("ЗАДАНИЕ 9 - Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины." +
                "\nМассив: [423, 61, 1222, 343, 77, 11, 101, 5, 8]. " +
                "\nРезультат выполнения: ");
        List<Integer> numbers = List.of(423, 61, 1222, 343, 77, 11, 101, 5, 8);
        List<Integer> sortedArr = numbers.stream()
                .map(n -> n.toString().length())
                .sorted()
                .toList();
        System.out.println(sortedArr);
        System.out.println("-------------------------------------------------------------------");


        // ЗАДАНИЕ 10 - Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
        // При создании объекта данного класса все поля должны быть заполнены.
        // Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
        // Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        System.out.println("ЗАДАНИЕ 10 - Создать класс \"Сотрудник\" с полями: ФИО, должность, email, телефон, зарплата, возраст." +
                "\nПри создании объекта данного класса все поля должны быть заполнены." +
                "\nВнутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль." +
                "\nСоздать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет." +
                "\nРезультат выполнения: ");

        Task10[] employees = {
                new Task10("Иванов А.И.", "QA", "test1@mail.ru", "89997278899", 110000, (short) 27),
                new Task10("Петров А.И.", "Java Developer", "test2@mail.ru", "89991778899", 102000, (short) 28),
                new Task10("Сидоров А.И.", "Frontend Developer", "test3@mail.ru", "89997738899", 100300, (short) 50),
                new Task10("Васин А.И.", "QA", "test4@mail.ru", "89927778899", 104000, (short) 41),
                new Task10("Романенко А.И.", "DevOps", "test5@mail.ru", "89197778899", 100060, (short) 77),
        };
        System.out.println("-----------------------------");
        for (Task10 employee : employees) {
            if (employee.getAge() > 40) {
                employee.getEmployeeInfo();
            }
        }
        System.out.println("-------------------------------------------------------------------");


        // ЗАДАНИЕ 11 - Написать код, который создаст, а затем отловит ArrayIndexOutOfBoundsException
        System.out.println("ЗАДАНИЕ 11 - Написать код, который создаст, а затем отловит ArrayIndexOutOfBoundsException." +
                "\nРезультат выполнения: ");
        Task11.GetArrayIndexOutOfBoundsException(new int[]{1, 2, 3, 4, 5});
        System.out.println("-------------------------------------------------------------------");


        // ЗАДАНИЕ 12 - Дана строка "Август, Сумма расходов равна, 0 ₽, Сумма доходов равна, 0 ₽"
        // Где Август - любой месяц, 0 - это суммы расходов / доходов. Сохранить в переменные значения расходов и доходов, вывести в консоль
        System.out.println("ЗАДАНИЕ 12 - Дана строка \"Август, Сумма расходов равна, 0 ₽, Сумма доходов равна, 0 ₽\"" +
                "\n" +
                "Где Август - любой месяц, 0 - это суммы расходов / доходов. Сохранить в переменные значения расходов и доходов, вывести в консоль." +
                "\nРезультат выполнения: ");
        Task12.getExpensesAndIncome("Август, Сумма расходов равна, 1000 ₽, Сумма доходов равна, 1500 ₽");
        System.out.println("-------------------------------------------------------------------");


        // ЗАДАНИЕ 13 - Вывести на экран строку, которая представляет собой период длиной в неделю.
        // Пример: 07 августа - 14 августа
        System.out.println("ЗАДАНИЕ 13 - Вывести на экран строку, которая представляет собой период длиной в неделю." +
                "\n" +
                "Пример: 07 августа - 14 августа " +
                "\nРезультат выполнения: ");
        LocalDate startDate = LocalDate.of(2025, 1, 1);
        LocalDate endDate = startDate.plusDays(7);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM", new Locale("ru"));
        String period = startDate.format(formatter) + " - " + endDate.format(formatter);
        System.out.println(period);
        System.out.println("-------------------------------------------------------------------");


        // ЗАДАНИЕ 14 - Дана строка s, состоящая из слов и пробелов. Верните длину последнего слова в строке.
        // Слово — это максимальная подстрока, состоящая только из символов, не являющихся пробелами.
        System.out.println("ЗАДАНИЕ 14 - Дана строка s, состоящая из слов и пробелов. Верните длину последнего слова в строке." +
                "\n" +
                "Слово — это максимальная подстрока, состоящая только из символов, не являющихся пробелами." +
                "\nРезультат выполнения: ");
        String s = "Слово — это максимальная подстрока, состоящая только из символов, не являющихся пробелами.".replaceAll("[.?!]", "");
        List<String> words = new ArrayList<>(List.of(s.split(" ")));
        System.out.println(words.getLast().length());
        System.out.println("-------------------------------------------------------------------");


        // ЗАДАНИЕ 15 - Написать класс Студент с полями имя, возраст, AVG балл аттеста. Создать массив Студентов. Выполнить сортировку по оценке и по имени. Вывести на консоль студентов, у которых средний бал выше 8
        System.out.println("ЗАДАНИЕ 15 - Написать класс Студент с полями имя, возраст, AVG балл аттеста. " +
                "\nСоздать массив Студентов. Выполнить сортировку по оценке и по имени. " +
                "\nВывести на консоль студентов, у которых средний бал выше 8." +
                "\nРезультат выполнения: ");
        List<Task15> students = new LinkedList<>(Arrays.asList(
                new Task15("Иван", (short) 16, 2),
                new Task15("Пётр", (short) 12, 9),
                new Task15("Алексей", (short) 11, 5),
                new Task15("Кирилл", (short) 17, 8),
                new Task15("Артём", (short) 15, 9)
        ));
        List<Task15> sortedStudents = students.stream()
                .sorted(Comparator.comparingInt(Task15::getGpa)
                        .thenComparing(Task15::getName))
                .filter(gpa -> gpa.getGpa() > 8)
                .collect(Collectors.toList());
        System.out.println(sortedStudents);
        System.out.println("-------------------------------------------------------------------");


        // ЗАДАНИЕ 16 - Дано три разных целых числа. Реализовать лямбда-выражение, которое находит наибольшее из этих трех чисел и выводит в консоль
        System.out.println("ЗАДАНИЕ 16 - Дано три разных целых числа. \n" +
                "Реализовать лямбда-выражение, которое находит наибольшее из этих трех чисел и выводит в консоль." +
                "\nРезультат выполнения: ");
        Task16 maxNumber = (a, b, c) -> Math.max(a, Math.max(b, c));
        System.out.println(maxNumber.threeNumbers(3, 5, 7));
        System.out.println("-------------------------------------------------------------------");


        // ЗАДАНИЕ 17 - Необходимо сформировать список цветов кислых фломастеров и вывести его в формате ["цвет1", ..., "цветN"] пример ["красный", "зелёный", "жёлтый"]
        System.out.println("ЗАДАНИЕ 17 - Необходимо сформировать список цветов кислых фломастеров и вывести его в формате [\"цвет1\", ..., \"цветN\"] " +
                "\nпример [\"красный\", \"зелёный\", \"жёлтый\"] " +
                "\nРезультат выполнения: ");

        Set<Task17> flomasterSet = Set.of(
                new Task17("красный", "кислый"),
                new Task17("зелёный", "кислый"),
                new Task17("жёлтый", "кислый"),
                new Task17("синий", "сладкий")
        );
        String result = Task17.getSourFlomaster(flomasterSet);
        System.out.println(result);
        System.out.println("-------------------------------------------------------------------");
    }
}