package tasks;

public class Task6 {
    public static int[] GetArrayAfterChange(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        return arr;
    }
}
