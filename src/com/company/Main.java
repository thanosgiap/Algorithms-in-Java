package com.company;

public class Main {

    // Driver function
    public static void main(String[] args) {
        int[] arr = {8, 4, 2, 4, 1};

        MergeSort obj = new MergeSort();
        obj.mergeSort(arr, 0, arr.length - 1);

        QuickSort obj1 = new QuickSort();
        obj1.quickSort(arr, 0, arr.length - 1);

        obj.print(arr);
        obj1.print(arr);
    }
}
