package hw2;

import hw2.core.ArrayUtils;

public class Main {
    public static void main(String[] args) {
        ArrayUtils arr = new ArrayUtils();
        arr.countEvens(new int[]{2,2,0});
        arr.differenceMinMax(new int[]{2, 1, 2, 3, 4});
        arr.doubleZero(new int[]{1,2,3,0,1,2,0,0});
    }
}
