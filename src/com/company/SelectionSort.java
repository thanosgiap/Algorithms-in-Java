package com.company;

public class SelectionSort {

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++)
                min_index = j;

            swap(arr, i, min_index);
        }
    }

    void print(int[] arr){
        System.out.println("Selection Sort results");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
