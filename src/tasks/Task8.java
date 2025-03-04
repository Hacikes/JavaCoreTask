package tasks;

import java.util.Arrays;

public class Task8 {

    public static boolean checkNumber(int n) {
        int num1 = Math.abs(n);
        int result = 0;

        while(num1 > 0) {
            result *= 10;
            result += num1 % 10;
            num1 /= 10;
        }
        return n == result;
    }

    public static void getPalindrome(int[] numarr) {
        System.out.println("Исходный массив: " + Arrays.toString(numarr));
        int[] temp = new int[numarr.length];
        int count = 0;

        for (int i = 0; i < numarr.length; i++) {
            if (checkNumber(numarr[i])) {
                temp[count] = numarr[i];
                count++;
            }
        }

        if(temp[1] != 0) {
            System.out.println(temp[1]);
        } else {
            System.out.println(temp[0]);
        }
    }
}
