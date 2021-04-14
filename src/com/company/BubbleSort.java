package com.company;

public class BubbleSort {
    void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }

    void print(int[] arr){
        System.out.println("Bubble Sort results");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
