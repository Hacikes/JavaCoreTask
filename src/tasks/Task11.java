package tasks;

import java.util.Arrays;

public class Task11 {
    public static void GetArrayIndexOutOfBoundsException(int[] expArr) {
        try{
            System.out.println(expArr[(int) (Arrays.stream(expArr).count() + 1)]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Вы вышли за границу массива!!!");
        }
    }
}
