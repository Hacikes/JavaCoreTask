package tasks;

import java.util.Arrays;

public class Task5 {
    public static int[] GetArray01(int[] arr) {
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                arr[i] = 1;
            }
            else {
                arr[i] = 0;
            }
        }
        return arr;
    }
}