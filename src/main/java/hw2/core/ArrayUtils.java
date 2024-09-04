package hw2.core;

import java.util.Arrays;

public class ArrayUtils {

    public void countEvens(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 || arr[i] == 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    public void differenceMinMax(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max - min);


    }

    public void doubleZero(int[] arr) {
        boolean result = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0) {
                result = true;
            }
        }
        System.out.println(result);
    }


}
