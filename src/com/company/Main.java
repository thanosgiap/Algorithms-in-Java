package com.company;

import java.util.Scanner;

public class Main {

    // Driver function
    public static void main(String[] args) {
        int[] arr = {8, 4, 2, 4, 1};

        System.out.println("Select the method that you would like to sort the array with: " +
                "\n1. Merge Sort \n" +
                "2. Quick Sort \n" +
                "3. Selection Sort \n" +
                "4. Bubble Sort");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        switch (input){
            case "1":
                MergeSort mergeObj = new MergeSort();
                mergeObj.mergeSort(arr, 0, arr.length - 1);
                mergeObj.print(arr);
                break;
            case "2":
                QuickSort quickObj = new QuickSort();
                quickObj.quickSort(arr, 0, arr.length - 1);
                quickObj.print(arr);
                break;
            case "3":
                SelectionSort selectObj = new SelectionSort();
                selectObj.selectionSort(arr);
                selectObj.print(arr);
                break;
            case "4":
                BubbleSort bubbleObj = new BubbleSort();
                bubbleObj.bubbleSort(arr);
                bubbleObj.print(arr);
                break;
        }


    }
}
