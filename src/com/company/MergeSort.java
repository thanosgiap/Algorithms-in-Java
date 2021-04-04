package com.company;

public class MergeSort {

    void merge(int[] arr, int p, int q, int r){

        int n1 = q - p + 1;
        int n2 = r - q;

        // Creating two sub-arrays
        int[] L = new int[n1];
        int[] M = new int[n2];

        for (int i = 0; i < n1; i++){
            L[i] = arr[p + i];
        }
        for (int j = 0; j < n2; j++){
            M[j] = arr[q + 1 + j];
        }

        int i = 0, j = 0, k = p;
        while(i < n1 && j < n2){
            if(L[i] <= M[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = M[j];
                j++;
            }
            k++;
        }

        while (i < n1){
            arr[k] = L[i];
            k++;
            i++;
        }

        while (j < n2){
            arr[k] = L[j];
            k++;
            j++;
        }
    }


    void mergeSort(int[] arr, int left, int right){
        if (left < right) {
            // Variable holding the point where the array is divided into two sub-arrays
            int median = (left + right) / 2;

            // Recursive call of the mergeSort function until the array has been divides completely
            mergeSort(arr, left, median);
            mergeSort(arr, median + 1, right);

            merge(arr, left, median, right);
        }
    }

    void print(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

}
