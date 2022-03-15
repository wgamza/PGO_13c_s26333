package zaj_1;

import java.util.Arrays;
import java.util.Random;

public class zad_6 {
    public static void main(String[] args) {

        int[] arr = new Random().ints(100, 1000).limit(10).toArray();
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
