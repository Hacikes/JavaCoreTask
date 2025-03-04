package tasks;

public class Task7 {
    public static int[] GetInvertedArray(int[] arr) {
        int[] result = new int[arr.length];
        int j = 0;
        for(int i = arr.length - 1; i >= 0; i--) {
            result[j] = arr[i];
            j++;
        }
        return result;
    }
}
