package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        BubbleSort bubble = new BubbleSort();
        ArrayUtils array = new ArrayUtils();
        InsertionSort insertion = new InsertionSort();
        InsertNumber insert = new InsertNumber();
        //Scanner sc = new Scanner(System.in);

        System.out.println("Hello!");
        int[] arr = array.randArr(10,50);
        bubble.bubbleSort(arr);
        insertion.insertionSort(arr);
        insert.insertNumber();
    }

}
