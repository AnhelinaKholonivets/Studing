package org.example;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtils {
    public int[] randArr(int arrLength, int maxRandNumber) {
        int[] arr = new int[arrLength];
        Random rand = new Random();
        for (int i = 0; i < arrLength; i++) {
            arr[i] = rand.nextInt(maxRandNumber);
        }
        System.out.println(Arrays.toString(arr) + " Rand array");
        return arr;
    }
}
