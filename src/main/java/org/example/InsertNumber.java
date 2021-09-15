package org.example;

import java.util.Arrays;

public class InsertNumber {
    public void insertNumber() {

        int[] arr = new int[]{1, 2, 3, 6, 8, 10, 11};
        int n = 5;
        int i = arr.length - 2;
        while (arr[i] > n) {
            arr[i+1] = arr[i];
            arr[i] = n;
            i--;
        }
        System.out.println(Arrays.toString(arr) + " Done!");
    }
}

